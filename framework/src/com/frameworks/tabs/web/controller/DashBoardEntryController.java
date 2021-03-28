package com.framework.tabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DashBoardEntryController {
	
	@GetMapping("/dbentry")
	public String getGroups() {
		return "/tabs/dashboardEntry";
	}

}
