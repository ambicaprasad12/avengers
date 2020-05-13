package com.hexa.HiberDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	    	
    	Transaction t =session.beginTransaction(); 	
    	
    	Demo d = new Demo();
    	d.setId(107);
    	d.setName("Thor");
    	d.setSp("cardialogy");
    	
    	session.save(d);
    t.commit();
    session.close();
    System.out.println("Data inserted");
    	
    	
    }
}










