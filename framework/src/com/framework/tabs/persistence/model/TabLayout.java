package com.framework.tabs.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode( callSuper = false)
public class TabLayout extends GenericColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue 
	private Long layoutid;
	
	@Column(nullable = false, length = 250)
	private String layoutName;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name="Layout_Tab_Details")
	private List<IndividualTabs> tabs= new ArrayList<IndividualTabs>();
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private TabLayout assocLayout;
	private boolean isGroup=false;
	@OneToOne
	@JoinColumn(name = "template", referencedColumnName = "groupID", nullable = false)
	private BusinessGroups template;
	
}
