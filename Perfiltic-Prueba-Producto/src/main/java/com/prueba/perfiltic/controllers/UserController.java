package com.prueba.perfiltic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.perfiltic.entities.Product;
import com.prueba.perfiltic.entities.User;
import com.prueba.perfiltic.repositories.ProductRepository;
import com.prueba.perfiltic.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProductRepository productRepository;

	@RequestMapping("showRegUser")
	public String showRegUser() {
		return "registerUser";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password")String password, ModelMap modelMap) {
		User user = userRepository.findByEmail(email);
		if (user.getPassword().equals(password)) {
			List <Product> products =  productRepository.findAll();
			modelMap.addAttribute("products", products);
			return "allProducts";
		}else {
			modelMap.addAttribute("msg", "Invalid Password");
		}
		return "login";
	}

}
