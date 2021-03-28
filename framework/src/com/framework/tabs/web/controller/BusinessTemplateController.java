package com.framework.tabs.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.framework.tabs.entities.TemplateRepository;
import com.framework.tabs.persistence.model.BusinessGroups;
import com.google.gson.Gson;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import redis.clients.jedis.Jedis;


@Controller
public class BusinessTemplateController {

	@Autowired
	private TemplateRepository template;
	
	@GetMapping("/template/v1")
	@ResponseBody
	public List<BusinessGroups> getTemplate(@RequestParam("term") String term) {
		
		List<BusinessGroups> lstGroups =(List<BusinessGroups>)template.findAll();
		
		Gson gson = new Gson();
		
		
		if (term =="")
			term="$.[?(@.groupName=~ /Pr.*$/i)]['groupID','groupName']";
		
		String strGson =gson.toJson(lstGroups);
		
		Jedis jedi = new Jedis();
		
		jedi.set("json", strGson);
		
		/* ~ /Evelyn.*$/i -- Regex pattern
		 * Pattern ptrn = null; Filter filter =
		 * Filter.filter(Criteria.where("groupName").regex(ptrn).and("").)
		 */	
		//"$.[?(@.groupName=~ /Evelyn.*$/i)]['groupID','groupName']"
		
		 DocumentContext jsnContext = JsonPath.parse(strGson);
		List<Map<String, String>> dataList =jsnContext.read(term);
		
		strGson =gson.toJson(dataList);
		/*
		 * ModelAndView modelView = new ModelAndView();
		 * 
		 * modelView.setViewName("/tabs/templates");
		 */
		
		
		System.out.println("Request Parameter" + strGson);
		System.out.println("Jedis Data" + jedi.get("json").toString());
		
		return lstGroups;
	}
	@GetMapping("/temp/v1")
	public String getGroups() {
		return "/tabs/templates";
	}
	
}
