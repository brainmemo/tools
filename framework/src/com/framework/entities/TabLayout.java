package com.framework.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class TabLayout extends GenericColumns {
	
	@Id
	@GeneratedValue
	private Long layoutid;
	
	@Column(nullable = false, length = 250)
	private String layoutName;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name="Layout_Tab_Details")
	private List<IndividualTabs> tabs= new ArrayList<IndividualTabs>();
	
	@OneToOne(fetch = FetchType.EAGER)
	private TabLayout assocLayout;
	private boolean isGroup=false;
	
	
	
	public TabLayout(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate, String is_deleted,
			Long layoutid, String layoutName, List<IndividualTabs> tabs, TabLayout assocLayout, boolean isGroup) {
		super(createdByUser, updatedByUser, createdDate, updatedDate, is_deleted);
		this.layoutid = layoutid;
		this.layoutName = layoutName;
		this.tabs = tabs;
		this.assocLayout = assocLayout;
		this.isGroup = isGroup;
	}
	public Long getLayoutid() {
		return layoutid;
	}
	public void setLayoutid(Long layoutid) {
		this.layoutid = layoutid;
	}
	public String getLayoutName() {
		return layoutName;
	}
	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}
	public List<IndividualTabs> getTabs() {
		return tabs;
	}
	public void setTabs(List<IndividualTabs> tabs) {
		this.tabs = tabs;
	}
	public TabLayout getAssocLayout() {
		return assocLayout;
	}
	public void setAssocLayout(TabLayout assocLayout) {
		this.assocLayout = assocLayout;
	}
	public boolean isGroup() {
		return isGroup;
	}
	public void setGroup(boolean isGroup) {
		this.isGroup = isGroup;
	}
			
	
}
