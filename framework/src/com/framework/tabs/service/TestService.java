package com.framework.tabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import com.google.gson.Gson;

public class TestService {
	
	private DataSource dataSource;

	@PersistenceContext
	private EntityManager em;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	

public void getData(String term) {
	
	


	String query = "select bg.groupID, bg.groupDescription, bg.groupName, bg.groupParent_groupID from businessgroups bg where bg.groupname like ?";
	 
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try{
		con = dataSource.getConnection();
		ps = con.prepareStatement(query);
		ps.setString(1, term +"%");
		rs = ps.executeQuery();
		if(rs.next()){
			/*
			 * emp = new Employee(); emp.setId(id); emp.setName(rs.getString("name"));
			 * emp.setRole(rs.getString("role"));
			 * System.out.println("Employee Found::"+emp);
			 */
		}else{
			//System.out.println("No Employee found with id="+id);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try {
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

	

}

