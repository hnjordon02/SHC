package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dashboardController {
	
	@GetMapping("/index")
	public String getDashboardView() {
		return "index";
	}
	
	@GetMapping("/pages-blank")
	public String getBlankPage() {
		return "pages-blank";
	}
	
	@GetMapping("/pages-error-404")
	public String getError404() {
		return "pages-error-404";
	}
}
