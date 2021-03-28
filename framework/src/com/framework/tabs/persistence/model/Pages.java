package com.framework.tabs.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Pages extends GenericColumns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long page_cd;
	@Column(length = 50, nullable =false, unique = true)
	private String page_name;
	@Column(length = 500)
	private String page_action;
 	@OneToOne
	@JoinColumn(name = "template", referencedColumnName = "groupID", nullable = false)
	private BusinessGroups template;
	
	
}
