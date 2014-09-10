package com.springboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping(value ="/index", method = RequestMethod.GET)
	public String displayIndexPage(Model model) {
		model.addAttribute("message", "A message from beyond...");
		return "index";
	}
}
