package com.framework.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class MenuTemplate extends GenericColumns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long menu_id;
	@Column(length=100)
	private String menu_name;
	@OneToOne
	private Template template;
	@OneToOne
	private TabLayout horizontalLayout;
	@OneToOne
	private TabLayout verticalLayout;
	private int isActive;
	public MenuTemplate(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate,
			String is_deleted, Long menu_id, String menu_name, Template template, TabLayout horizontalLayout,
			TabLayout verticalLayout, int isActive) {
		super(createdByUser, updatedByUser, createdDate, updatedDate, is_deleted);
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.template = template;
		this.horizontalLayout = horizontalLayout;
		this.verticalLayout = verticalLayout;
		this.isActive = isActive;
	}
	public Long getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = template.getTemplate() + "_Menu_" + this.menu_id;
	}
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public TabLayout getHorizontalLayout() {
		return horizontalLayout;
	}
	public void setHorizontalLayout(TabLayout horizontalLayout) {
		this.horizontalLayout = horizontalLayout;
	}
	public TabLayout getVerticalLayout() {
		return verticalLayout;
	}
	public void setVerticalLayout(TabLayout verticalLayout) {
		this.verticalLayout = verticalLayout;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
		

}
