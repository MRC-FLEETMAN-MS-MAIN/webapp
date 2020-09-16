package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
	
	@GetMapping({"/","/hello"})
	public String hello(@RequestParam(value="name", defaultValue="World", required=true) String name, Model model) {
		
		
		model.addAttribute("name", name);
		return "hello";
		
	}

}
