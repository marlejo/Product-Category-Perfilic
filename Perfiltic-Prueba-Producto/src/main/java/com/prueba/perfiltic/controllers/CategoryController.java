package com.prueba.perfiltic.controllers;

import java.util.List;

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

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping("categoryReg")
	public String showCategoryPage() {
		return "addCategory";
	}
	
	@RequestMapping(value="addCategory", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, ModelMap modelMap) {
		categoryRepository.save(category);
		List<Category> categories = categoryRepository.findAll();
		modelMap.addAttribute("categories", categories);
		return "allCategories";
	}
	
	@RequestMapping("showAllCategories")
	public String showAllCategories(ModelMap modelMap) {
		List<Category> categories = categoryRepository.findAll();
		modelMap.addAttribute("categories", categories);
		return "allCategories";
	}

	@RequestMapping("getCategory")
	public String getCategory(@RequestParam("categoryId") int id, ModelMap modelMap) {
		modelMap.addAttribute("categoryId", id);
		return "addProduct";
	}
}
