package com.framework.tabs.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.framework.tabs.persistence.model.BusinessGroups;

@Repository
public interface TemplateRepository extends JpaRepository<BusinessGroups, Long> {
	
	 
	 
}
