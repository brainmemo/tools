package com.framework.tabs.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.tabs.entities.TemplateRepository;
import com.framework.tabs.persistence.model.BusinessGroups;
import com.framework.tabs.service.IBusinessGroupService;
import com.frameworks.tabs.web.DTO.GenericNameID;

@Service
public class BusinessGroupServiceIMPL implements IBusinessGroupService {
	 static final String STATEMENT_SQLMAP = "Statement-SQL-Mapping";

	@Autowired
	private TemplateRepository tempRepo;
	 
	@Autowired
	DataSource ds;

	@Override
	public List<BusinessGroups> getTemplate() {
		return  (List<BusinessGroups> )tempRepo.findAll();
	}
 
	public void getDashboardData() {
	
	}
	
	@Override
	public List<GenericNameID> getTemplateGroups() throws SQLException   {
		Connection conn= null;
		Statement stmt = null;
		String SQL = "select bg.groupID, bg.groupName from businessgroups bg where bg.isGroup=0";
		ResultSet rs = null;
		System.out.println("Before Initialize List====================================");
		List<GenericNameID> lstGroups= new ArrayList<GenericNameID>();
		try {
			System.out.println("In Try===============================================");
			conn= ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL);
			System.out.println("After resultset===================================");
			while(rs.next()) {
				GenericNameID group = new GenericNameID();
				group.setId(rs.getLong("groupID"));
				group.setText(rs.getString("groupName"));
				lstGroups.add(group);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException sqle) {
			
		}catch (Exception e) {
			
		}
		finally {
			try {
				
				if (stmt !=null) {
					stmt.close();
				}
				if (conn !=null) {
					conn.close();
				}
			} catch (SQLException SQLE) {
				throw SQLE;
			}
		}
		
		
		return lstGroups;
	}
	
	public void saveTemplate() {
		
	}
	
	public void deleteTemplate() {
		
	}
}
