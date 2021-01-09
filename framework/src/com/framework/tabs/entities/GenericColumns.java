package com.framework.tabs.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public abstract class GenericColumns {
	
	@Column(length=500,nullable = false)
	private String createdByUser;
	@Column(length=500, nullable = false)
	private String updatedByUser;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date updatedDate;
	@Column(length = 2, nullable = false)
	private String is_deleted;
	@Column(nullable = false, columnDefinition = "BINARY (16)")
	private UUID guid = UUID.randomUUID();
	
	
	public UUID getGuid() {
		return guid;
	}









	public void setGuid(UUID guid) {
		this.guid = guid;
	}









	public GenericColumns() {
		//super();
	}
	
	

	


	


	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	public String getUpdatedByUser() {
		return updatedByUser;
	}
	public void setUpdatedByUser(String updatedByUser) {
		this.updatedByUser = updatedByUser;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(String is_deleted) {
		this.is_deleted = is_deleted;
	}
	
	
	

}
