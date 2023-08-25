package com.learning.DemoHib4;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	Alien gaurav=new Alien();
//    	gaurav.setAid(101);
//    	gaurav.setAname("gaurav");
//    	
//    	Alien akash=new Alien();
//    	akash.setAid(102);
//    	akash.setAname("akash");
//    	
//    	Alien siddhant=new Alien();
//    	siddhant.setAid(103);
//    	siddhant.setAname("siddhant");
//    	
//    	Laptop laptop=new Laptop();
//    	laptop.setLid(1);
//    	laptop.setLname("apple");
//    	laptop.setPrice(2000);
//    	laptop.setAlien(gaurav);
//    	
//    	Laptop acer=new Laptop();
//    	acer.setLid(2);
//    	acer.setLname("acer");
//    	acer.setPrice(1000);
//    	acer.setAlien(akash);
//    	
//    	Laptop hp=new Laptop();
//    	hp.setLid(3);
//    	hp.setLname("hp");
//    	hp.setPrice(1400);
//    	hp.setAlien(gaurav);
//    	
//    	Laptop dell=new Laptop();
//    	dell.setLid(4);
//    	dell.setLname("dell");
//    	dell.setPrice(1200);
//    	dell.setAlien(siddhant);
//    	
//    	Laptop realme=new Laptop();
//    	realme.setLid(5);
//    	realme.setLname("realme");
//    	realme.setPrice(1100);
//    	realme.setAlien(akash);
    	
    	
    	//new comment to check github linking
    	
    	
    	
    	
    	
    	
    	Configuration config=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry registry =new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf=config.buildSessionFactory(registry);
        
        Session session=sf.openSession();
        
        Transaction tr=session.beginTransaction();
        
//        session.save(gaurav);
//        session.save(akash);
//        session.save(siddhant);
//        
//        session.save(laptop);
//        session.save(acer);
//        session.save(hp);
//        session.save(realme);
//        session.save(dell);
        Alien a1=(Alien)session.get(Alien.class,101);
        System.out.println(a1.getAid() + " " + a1.getAname());
        
        Collection<Laptop> laps=a1.getLaps();
        for(Laptop laptop:laps) {
        	System.out.println(laptop.getLid() + " " + laptop.getLname());
        }
        
        
        
        
        tr.commit();
    }
}
