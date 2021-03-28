package com.framework.tabs.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.google.gson.annotations.Expose;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class BusinessGroups extends GenericColumns {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Long groupID;
	@Expose
	@Column(length = 100, nullable = false,unique = true)
	private String groupName;
	@Expose
	@Column(length = 500, nullable = false)
	private String groupDescription;
	@Expose
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private BusinessGroups groupParent;
	@Column()
	private boolean isGroup=false;
}
