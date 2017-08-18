package com.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Configuration cfg=new Configuration().configure("com/onetomany/Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Movies m1 = new Movies(1, "Pk");
		Movies m2 = new Movies(2, "lagan");
		
		Actor a1 = new Actor();
		a1.setAid(1);
		a1.setAname("Aamir");
		
		Set<Movies> set = new HashSet<Movies>();
		set.add(m1);
		set.add(m2);
		
		a1.setMovies(set);
		
		ses.save(m1);
		ses.save(m2);
		
		ses.save(a1);
		tx.commit();		
		

	}

}
