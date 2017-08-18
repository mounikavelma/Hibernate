package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Configuration cfg=new Configuration().configure("com/manytomany/Hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Course c1= new Course();
		c1.setCid(11);
		c1.setCname("computer science");
		c1.setFee(2000);
		
		Course c2= new Course();
		c2.setCid(12);
		c2.setCname("Networking");
		c2.setFee(3000);
		
		Course c3= new Course();
		c3.setCid(13);
		c3.setCname("management");
		c3.setFee(2500);
		
		Course c4= new Course();
		c4.setCid(14);
		c4.setCname("business");
		c4.setFee(2100);
		
		Set<Course> cset1 = new HashSet<Course>();
		cset1.add(c1);
		cset1.add(c2);
		
		Set<Course> cset2 = new HashSet<Course>();
		cset2.add(c2);
		cset2.add(c3);
		cset2.add(c4);
		
		Faculty f1= new Faculty();
		f1.setFid(1);
		f1.setFname("haque");
		f1.setYearex(3);
		f1.setCourses(cset1);
		
		Faculty f2= new Faculty();
		f2.setFid(2);
		f2.setFname("Hpark");
		f2.setYearex(3);
		f2.setCourses(cset1);
		
		Faculty f3= new Faculty();
		f3.setFid(3);
		f3.setFname("huimanlui");
		f3.setYearex(7);
		f3.setCourses(cset2);
		
		ses.saveOrUpdate(f1);
		ses.saveOrUpdate(f2);
		ses.saveOrUpdate(f3);
		ses.saveOrUpdate(c1);
		ses.saveOrUpdate(c2);
		ses.saveOrUpdate(c3);
		ses.saveOrUpdate(c4);
		
		tx.commit();	
		
		System.out.println("work done");
		
		

	}

}
