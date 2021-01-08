package com.framework.entities.tabs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public abstract class GenericColumns {
	
	@Column(length=500)
	private String createdByUser;
	@Column(length=500)
	private String updatedByUser;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;
	@Column(length = 2)
	private String is_deleted;
	
	
	
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
