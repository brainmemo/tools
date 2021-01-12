package com.framework.tabs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Roles extends GenericColumns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long role_cd;
	@Column(length = 50, nullable =false)
	private String role_name;
	@Column(length = 500)
	private String role_desc;
	@OneToOne
	@JoinColumn(name = "template", referencedColumnName = "template_id", nullable = false)
	private Template template;
	
	public Roles() {
		super();
	}

	public Long getRole_cd() {
		return role_cd;
	}

	public void setRole_cd(Long role_cd) {
		this.role_cd = role_cd;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_desc() {
		return role_desc;
	}

	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}
	
	
	
}
