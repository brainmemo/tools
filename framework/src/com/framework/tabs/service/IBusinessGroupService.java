package com.framework.tabs.service;

import java.sql.SQLException;
import java.util.List;

import com.framework.tabs.entities.BusinessGroups;

public interface  Interface_template {

	public List<BusinessGroups> getTemplate();

	public List<GenericNameID> getTemplateGroups() throws SQLException;

}
