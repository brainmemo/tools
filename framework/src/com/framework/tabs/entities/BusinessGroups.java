package com.framework.tabs.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;

import com.google.gson.annotations.Expose;

@Entity
public class BusinessGroups extends GenericColumns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Long groupID;
	@Expose
	@Column(length = 100, nullable = false)
	private String groupName;
	@Expose
	@Column(length = 500, nullable = false)
	private String groupDescription;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private BusinessGroups groupParent;
	@Expose
	@Column()
	private boolean isGroup=false;
	
	public boolean isGroup() {
		return isGroup;
	}


	public void setGroup(boolean isGroup) {
		this.isGroup = isGroup;
	}


	public BusinessGroups() {
		
	}
	
	
	public Long getGroupID() {
		return groupID;
	}
	public void setGroupID(Long groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	public BusinessGroups getGroupParent() {
		return groupParent;
	}
	public void setGroupParent(BusinessGroups groupParent) {
		this.groupParent = groupParent;
	}
}
