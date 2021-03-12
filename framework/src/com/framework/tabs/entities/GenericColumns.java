package com.framework.tabs.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@MappedSuperclass
public abstract class GenericColumns {
	@JsonIgnore
	@Column(length=500,nullable = false)
	private String createdByUser;
	@JsonIgnore
	@Column(length=500, nullable = false)
	private String updatedByUser;
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdDate;
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date updatedDate;
	@Column(length = 2, nullable = false)
	@JsonIgnore
	private String is_deleted;
	@JsonIgnore
	@Column(nullable = false, columnDefinition = "BINARY (16)")
	private UUID guid = UUID.randomUUID();
	
	
	









	public GenericColumns(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate,
			String is_deleted, UUID guid) {
		super();
		this.createdByUser = createdByUser;
		this.updatedByUser = updatedByUser;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.is_deleted = is_deleted;
		this.guid = guid;
	}









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
