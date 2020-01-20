package com.prueba.perfiltic.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.perfiltic.entities.Category;
import com.prueba.perfiltic.entities.Product;
import com.prueba.perfiltic.repositories.CategoryRepository;
import com.prueba.perfiltic.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping("productReg")
	public String showProductPage() {
		return "addProduct";		
	}

	@RequestMapping(value="addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product, ModelMap modelMap, @RequestParam("category_id") int category_id) {
		Optional<Category> category = categoryRepository.findById(category_id);
		product.setCategory(category.get());
		productRepository.save(product);
		List<Product> products = productRepository.findAll();
		modelMap.addAttribute("products", products);
		return "allProducts";
	}
	
	@RequestMapping(value="showAllProducts")
	public String showAllProducts(ModelMap modelMap) {
		List <Product> products =  productRepository.findAll();
		modelMap.addAttribute("products", products);
		return "allProducts";
	}
	
	@RequestMapping("getProduct")
	public String getProduct() {
		return "";
	}
}
