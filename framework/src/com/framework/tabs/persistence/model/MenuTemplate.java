package com.framework.tabs.persistence.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuTemplate extends GenericColumns implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue 
	private Long menu_id;
	@Column(length=100)
	private String menu_name;
	@OneToOne
	@JoinColumn(name = "template", referencedColumnName = "groupID", nullable = false)
	private BusinessGroups template;
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	private TabLayout horizontalLayout;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private TabLayout verticalLayout;
	@Column
	private int isActive;
}
