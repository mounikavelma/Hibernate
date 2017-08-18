package com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Configuration cfg=new Configuration().configure("com/manytoone/Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Actor a1 = new Actor();
		a1.setAid(1);
		a1.setAname("Aamir");
		
		Movies m1 = new Movies(1, "Pk");
		m1.setActor(a1);
		Movies m2 = new Movies(2, "lagan");
		m2.setActor(a1);
	
		ses.save(m1);
		ses.save(m2);
		ses.save(a1);
		
		tx.commit();		
		

	}

}
