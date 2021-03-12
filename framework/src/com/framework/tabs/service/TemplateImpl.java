package com.framework.tabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.tabs.entities.BusinessGroups;
import com.framework.tabs.entities.TemplateRepository;

@Service
public class TemplateImpl implements Interface_template {
	
	@Autowired
	private TemplateRepository tempRepo;

	@Override
	public List<BusinessGroups> getTemplate() {
	 	
		
		return  (List<BusinessGroups> )tempRepo.findAll();
	}

}
