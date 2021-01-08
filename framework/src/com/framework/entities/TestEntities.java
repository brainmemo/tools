package com.framework.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		/*
		 * Date dt = new Date(); Long j =(long) 1000;
		 */
		System.out.println("timestamp :: " + timestamp);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		try (Session session = sessionFactory.openSession()) {

			try {

				Transaction tx = session.beginTransaction();

				List<IndividualTabs> lstTab = new ArrayList<IndividualTabs>();
				
				for (int i = 0; i < 10; i++) {
				
					IndividualTabs tab = new IndividualTabs();
					tab.setCreatedByUser("admin");
					tab.setCreatedDate(timestamp);
					tab.setIs_deleted("N");
					tab.setUpdatedDate(timestamp);
					tab.setUpdatedByUser("admin");
					tab.setTabDisplayName("Dashboard " + i);
					tab.setTabAction("Page 1" + i);
				    session.save(tab);	
					lstTab.add(tab);
				}

				
					
					TabLayout layout = new TabLayout();
						layout.setCreatedByUser("admin");
						layout.setCreatedDate(timestamp);
						layout.setIs_deleted("N");
						layout.setUpdatedDate(timestamp);
						layout.setUpdatedByUser("admin");
						layout.setTabs(lstTab);
						layout.setLayoutName("child layout");
				  
				session.save(layout);
			
				MenuTemplate menu = new MenuTemplate();
				
				menu.setMenu_name("Developer");
				
				tx.commit();
				
				TabLayout layoutTab =session.get(TabLayout.class, (long)3);
				
				
				List<IndividualTabs> lstofTabs =layoutTab.getTabs();
		
					
			for (Iterator<IndividualTabs> iterator = lstofTabs.iterator(); iterator.hasNext();) {
				
				IndividualTabs individualTabs = (IndividualTabs) iterator.next();
				
				System.out.println("Value of Tab ::" + individualTabs.getTabAction());
				
			}	
			
			TabLayout childTablayout = layoutTab.getAssocLayout();
			 lstofTabs =childTablayout.getTabs();
			 
			 for (Iterator<IndividualTabs> iterator = lstofTabs.iterator(); iterator.hasNext();) {
				IndividualTabs individualTabs = (IndividualTabs) iterator.next();
				
				System.out.println("Value of Child Tab =====================> " + individualTabs.getTabAction() +" === "+ individualTabs.getTabid());
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
