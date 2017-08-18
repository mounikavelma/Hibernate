package com.onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Configuration cfg=new Configuration().configure("com/onetoone/Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Voter v1 = new Voter();
		v1.setVid(111);
		v1.setVname("mounika");
		v1.setVage(25);
		
		Voter v2 = new Voter();
		v2.setVid(112);
		v2.setVname("velma");
		v2.setVage(25);
		
		Vote vt1= new Vote();
		vt1.setPname("BJP");
		vt1.setCdate(new Date());
		vt1.setVoter(v1);
		
		Vote vt2= new Vote();
		vt2.setPname("BJP");
		vt2.setCdate(new Date());
		vt2.setVoter(v2);
		
		ses.save(v1);
		ses.save(vt1);
		ses.save(vt2);
		
		tx.commit();		
		

	}

}
