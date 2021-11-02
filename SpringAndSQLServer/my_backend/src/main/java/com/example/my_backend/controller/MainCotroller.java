package com.example.my_backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.my_backend.repositories.UserRepo;

@Controller
public class MainCotroller {
	
	@Autowired
	UserRepo repo;
	
	@GetMapping("/")
	public String getAll(Model model){
		model.addAttribute("users", repo.findAll());

		return "index";
	}
}
