package com.hexa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();
    	
    	//SessionFactory factory = new Configuration().configure().buildSessionFactory(); //This line to be replaced with below commented line

        Session session=factory.openSession();  
          
        Transaction t=session.beginTransaction();  
          
        Employee e1=new Employee();  
        e1.setName("Gaurav Chawla");  

        
        PerEmployee e2=new PerEmployee();  
       e2.setName("Vivek Kumar");  
        e2.setSal(50000);  
        e2.setBonus(5);  
          
        ContEmployee e3=new ContEmployee();  
       e3.setName("Arjun Kumar");  
       e3.setWage(5000);
       e3.setVendor("adsd123");
       e3.setDuration(3);
          
        session.persist(e1);  
        session.persist(e2);  
        session.persist(e3);  
          
        t.commit();  
        session.close();  
        System.out.println("success");        
    }  
}  





