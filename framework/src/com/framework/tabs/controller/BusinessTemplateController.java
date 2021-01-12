package com.framework.tabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessTemplateController {

	@GetMapping("/template")
	public String getTemplate() {
		
		return"/tabs/businesstemplate";
	}
	
}
