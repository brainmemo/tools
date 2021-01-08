package com.framework.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private String template;
	
	@Column(length = 500)
	private String template_desc;
	
	
	
	
	public Template() {
		//super();
	}
	public Long getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(Long template_id) {
		this.template_id = template_id;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplate_desc() {
		return template_desc;
	}
	public void setTemplate_desc(String template_desc) {
		this.template_desc = template_desc;
	}
	
	

}
