package com.framework.entities.tabs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class MenuTemplate extends GenericColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public MenuTemplate() {
		//super();
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
