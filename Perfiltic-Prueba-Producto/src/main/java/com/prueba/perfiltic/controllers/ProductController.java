package com.prueba.perfiltic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.perfiltic.entities.Product;
import com.prueba.perfiltic.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("productReg")
	public String showProductPage() {
		return "addProduct";		
	}

	@RequestMapping(value="addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {
		productRepository.save(product);
		return "showAllProducts";
	}
	
	@RequestMapping(value="showAllProducts")
	public String allProducts(ModelMap modelMap) {
		List <Product> products =  productRepository.findAll();
		modelMap.addAttribute("products", products);
		return "allProducts";
	}
	
	@RequestMapping("getProduct")
	public String getProduct() {
		return "";
	}
}
