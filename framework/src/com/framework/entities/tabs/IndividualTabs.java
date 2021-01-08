package com.framework.entities.tabs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class IndividualTabs extends GenericColumns implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tabid;
	
	@Column(nullable = false, length = 50)
	private String tabDisplayName;
	@Column(length = 500, nullable = false)
	private String tabAction;
	
	
	@OneToOne
	private Template tempalte;
	
	@ManyToMany(mappedBy = "tabs", cascade = CascadeType.ALL)
	private List<TabLayout> layout = new ArrayList<TabLayout>();
	 
	
	
	
	
	public String getTabAction() {
		return tabAction;
	}
	public void setTabAction(String tabAction) {
		this.tabAction = tabAction;
	}
	public Template getTempalte() {
		return tempalte;
	}
	public void setTempalte(Template tempalte) {
		this.tempalte = tempalte;
	}
	public List<TabLayout> getLayout() {
		return layout;
	}
	public void setLayout(List<TabLayout> layout) {
		this.layout = layout;
	}
	public IndividualTabs() {
		//super();
	}
	public Long getTabid() {
		return tabid;
	}
	public void setTabid(Long tabid) {
		this.tabid = tabid;
	}
	public String getTabDisplayName() {
		return tabDisplayName;
	}
	public void setTabDisplayName(String tabDisplayName) {
		this.tabDisplayName = tabDisplayName;
	}
	
	
}
