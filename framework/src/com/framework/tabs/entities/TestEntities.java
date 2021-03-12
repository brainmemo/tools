package com.framework.tabs.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestEntities {

	public static void main(String[] args) {
	

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		/*
		 * Date dt = new Date(); Long j =(long) 1000;
		 */
		System.out.println("timestamp :: " + timestamp);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		try (Session session = sessionFactory.openSession()) {

			try {

				Transaction tx = session.beginTransaction();
				//Save the Development Template
				
				session.clear();
				System.out.println("Cache Mode --------------> " +session.getCacheMode());
				  Template template = new Template(); template.setCreatedByUser("admin");
				  template.setCreatedDate(timestamp); template.setIs_deleted("N");
				  template.setUpdatedByUser("admin"); template.setUpdatedDate(timestamp);
				  template.setTemplate_name("Development");
				  template.setTemplate_desc("Template for Development/Configuration tools");
				  session.save(template);
				 
			
					
				
				
				  List<IndividualTabs> lstTab = new ArrayList<IndividualTabs>();
				  
				  for (int i = 0; i < 10; i++) {
				  
				  IndividualTabs tab = new IndividualTabs(); tab.setCreatedByUser("admin");
				  tab.setCreatedDate(timestamp); tab.setIs_deleted("N");
				  tab.setUpdatedDate(timestamp); tab.setUpdatedByUser("admin");
				  //tab.setTabDisplayName("Dashboard "); tab.setTabAction("Page 1");
				  //tab.setTempalte(template); 
				  session.save(tab);
				  //System.out.println("Tab ID XXXXXXXXXXXXXXXXXXXXXXXXX " + tab.getTabid());
				  lstTab.add(tab); 
				  }
				  
				  
					
					  TabLayout layout = new TabLayout(); layout.setCreatedByUser("admin");
					  layout.setCreatedDate(timestamp); layout.setIs_deleted("N");
					  layout.setUpdatedDate(timestamp); layout.setUpdatedByUser("admin");
					  layout.setTabs(lstTab); layout.setLayoutName("child layout");
					  layout.setTemplate(template); 
					  
					  session.save(layout);
					  
					 
					/*
					 * MenuTemplate menu = new MenuTemplate();
					 * 
					 * menu.setMenu_name("Developer"); menu.setTemplate(template);
					 */  
				  //session.save(menu);
				 				
				tx.commit();
				
				
				  TabLayout layoutTab =session.get(TabLayout.class, (long)1);
				  
				  
				  List<IndividualTabs> lstofTabs =layoutTab.getTabs();
				  
				  
				  for (Iterator<IndividualTabs> iterator = lstofTabs.iterator();
				  iterator.hasNext();) {
				  
				  IndividualTabs individualTabs = (IndividualTabs) iterator.next();
				  
				//  System.out.println("Value of Tab ::" + individualTabs.getTabAction());
				  
				  }
				  
				  TabLayout childTablayout = layoutTab.getAssocLayout(); lstofTabs
				  =childTablayout.getTabs();
				  
				  for (Iterator<IndividualTabs> iterator = lstofTabs.iterator();
				  iterator.hasNext();) { IndividualTabs individualTabs = (IndividualTabs)
				  iterator.next();
				  
				  //System.out.println("Value of Child Tab =====================> " +
				  //individualTabs.getTabAction() +" === "+ individualTabs.getTabid()); 
				  
				  }
				 
			session.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} finally {
			
		}

	}

}
