package com.framework.tabs.service;

import java.sql.SQLException;
import java.util.List;

import com.framework.tabs.persistence.model.BusinessGroups;
import com.frameworks.tabs.web.DTO.GenericNameID;

public interface  IBusinessGroupService {

	public List<BusinessGroups> getTemplate();

	public List<GenericNameID> getTemplateGroups() throws SQLException;

}
