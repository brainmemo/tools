package com.framework.tabs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TabLayoutController {
	
	@GetMapping("/tablayout")
	public String getGroups() {
		return "/tabs/tablayout";
	}

}
