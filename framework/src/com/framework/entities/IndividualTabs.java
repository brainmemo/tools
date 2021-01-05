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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class IndividualTabs extends GenericColumns {
	@Id
	@GeneratedValue
	private Long tabid;
	
	@Column(nullable = false, length = 50)
	private String tabDisplayName;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private PageURI pageid;
	
	@ManyToMany(mappedBy = "tabs", cascade = CascadeType.ALL)
	private List<TabLayout> layout = new ArrayList<TabLayout>();
	
	
	
	public IndividualTabs(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate,
			String is_deleted, Long tabid, String tabDisplayName, PageURI pageid, List<TabLayout> layout) {
		super(createdByUser, updatedByUser, createdDate, updatedDate, is_deleted);
		this.tabid = tabid;
		this.tabDisplayName = tabDisplayName;
		this.pageid = pageid;
		this.layout = layout;
	}
	
	public Long getTabid() {
		return tabid;
	}
	public void setTabid(Long tabid) {
		this.tabid = tabid;
	}
	public String getTabDisplayName() {
		return tabDisplayName;
	}
	public void setTabDisplayName(String tabDisplayName) {
		this.tabDisplayName = tabDisplayName;
	}
	public PageURI getPageid() {
		return pageid;
	}
	public void setPageid(PageURI pageid) {
		this.pageid = pageid;
	}
	public List<TabLayout> getLayout() {
		return layout;
	}
	public void setLayout(List<TabLayout> layout) {
		this.layout = layout;
	}
	
	
	
	
}
