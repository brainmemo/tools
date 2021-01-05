package com.framework.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PageURI extends GenericColumns {
	
	@Id
	@GeneratedValue
	private Long page_id;
	@Column(nullable = false, length=250)
	private String page_nm;
	@Column(length = 500, nullable = false )
	private String page_uri;
	 
	
	public PageURI(String createdByUser, String updatedByUser, Date createdDate, Date updatedDate, String is_deleted,
			Long page_id, String page_nm, String page_uri) {
		super(createdByUser, updatedByUser, createdDate, updatedDate, is_deleted);
		this.page_id = page_id;
		this.page_nm = page_nm;
		this.page_uri = page_uri;
	}
	
	public Long getPage_id() {
		return page_id;
	}
	public void setPage_id(Long page_id) {
		this.page_id = page_id;
	}
	public String getPage_nm() {
		return page_nm;
	}
	public void setPage_nm(String page_nm) {
		this.page_nm = page_nm;
	}
	public String getPage_uri() {
		return page_uri;
	}
	public void setPage_uri(String page_uri) {
		this.page_uri = page_uri;
	}

	
	
}
