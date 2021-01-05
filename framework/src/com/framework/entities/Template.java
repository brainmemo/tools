package com.framework.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Template extends GenericColumns {
	
	@Id
	@GeneratedValue
	private Long template_id;
	
	@Column(nullable = false, length = 50)
	private String template;
	
	@Column(length = 500)
	private String template_desc;
	
	
	public Template(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate, String is_deleted,
			Long template_id, String template, String template_desc) {
		super(createdByUser, updatedByUser, createdDate, updatedDate, is_deleted);
		this.template_id = template_id;
		this.template = template;
		this.template_desc = template_desc;
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
