package com.demo.hugo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	private static final String INDEX = "views/admin/home";

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {

		return INDEX;
	}
}
