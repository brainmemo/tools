package com.framework.tabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MenuController {
	
	@GetMapping("/menu")
	public String getGroups() {
		return "/tabs/Menu";
	}

}
