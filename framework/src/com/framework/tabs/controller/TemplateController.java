package com.framework.tabs.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.framework.tabs.DTO.TemplateDTO;
import com.framework.tabs.entities.BusinessGroups;
import com.framework.tabs.entities.TemplateRepository;
import com.framework.tabs.service.GenericNameID;
import com.framework.tabs.service.Interface_template;
import com.google.gson.Gson;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
@Controller
public class TemplateController {
	@Autowired
	Interface_template templateRepo;
	
	@GetMapping("/template")
	public ModelAndView getGroups() {
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/tabs/templates");
		TemplateDTO tempDTO = new TemplateDTO();
		
		
	    mv.addObject("tempDTO", tempDTO);
		return mv;
	}
	@GetMapping("/template/db")
	@ResponseBody
	public String getDashboardData(){
		Gson gson = new Gson();
		
		
		List<BusinessGroups> lstTemplates = templateRepo.getTemplate();
		
		String jsonString = gson.toJson(lstTemplates);
		 return jsonString; 
	}
	@GetMapping("/template/group")
	@ResponseBody
	public String getGroupdata(@RequestParam(name = "term", defaultValue ="", required = false ) String term){
		Gson gson = new Gson();
		
		
		List<GenericNameID> lstGroup = new ArrayList<GenericNameID>();
		try {
			lstGroup = templateRepo.getTemplateGroups();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String jsonString = gson.toJson(lstGroup);
		if (term !="") {
		DocumentContext jsnContext = JsonPath.parse(jsonString); 
		  List<Map<String, String>> dataList =jsnContext.read("$.[?(@.text=~ /"+ term +".*$/i)]");
		  jsonString =gson.toJson(dataList);
		}
		
		return jsonString; 
	}
	

}
