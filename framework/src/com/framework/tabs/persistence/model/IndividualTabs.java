package com.framework.tabs.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@EqualsAndHashCode(callSuper=false)
@Data
public class IndividualTabs extends GenericColumns implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tabid;
	
		
	@Column(nullable = false, length = 50)
	private String tabDisplayName;
	
	
	@OneToOne
	@JoinColumn(name = "template", referencedColumnName = "groupID", nullable = false)
	private BusinessGroups template;
	
	@ManyToMany(mappedBy = "tabs", cascade = CascadeType.ALL)
	private List<TabLayout> layout = new ArrayList<TabLayout>();
	 
	@OneToOne 
	@JoinColumn(name = "page", referencedColumnName = "page_cd", nullable = false)
	private Pages page;
		
	
	
}
