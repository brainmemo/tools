package com.frameworks.tabs.web.DTO;

import com.framework.tabs.persistence.model.BusinessGroups;
import com.framework.tabs.persistence.model.GenericColumns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagesPojo extends GenericColumns {

	private Long page_cd;
	private String page_name;
	private String page_action;
	private BusinessGroups template;
	
	
}
