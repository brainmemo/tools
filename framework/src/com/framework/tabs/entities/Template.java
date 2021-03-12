package com.framework.tabs.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Template extends GenericColumns implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long template_id;
	
		
	@Column(nullable = false, length = 50)
	private String template_name;
	
	@Column(length = 500)
	private String template_desc;
	
	public BusinessGroups getParentGroup() {
		return parentGroup;
	}


	public void setParentGroup(BusinessGroups parentGroup) {
		this.parentGroup = parentGroup;
	}
	@OneToOne
	@JoinColumn(name = "groupID", referencedColumnName="groupID")
	private BusinessGroups parentGroup;
	
	public Template(Long template_id, String template_name, String template_desc) {
		super();
		this.template_id = template_id;
		this.template_name = template_name;
		this.template_desc = template_desc;
	}
	
	
	public String getTemplate_name() {
		return template_name;
	}
	public void setTemplate_name(String template_name) {
		this.template_name = template_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Template() {
		//super();
	}
	
	
	public String getTemplate_desc() {
		return template_desc;
	}
	public Long getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(Long template_id) {
		this.template_id = template_id;
	}
	public void setTemplate_desc(String template_desc) {
		this.template_desc = template_desc;
	}
	
	
	

}
