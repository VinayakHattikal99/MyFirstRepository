package FactoryHelper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
  
	public static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		if(factory==null) {
			factory=new Configuration().configure("persistence.xml").buildSessionFactory();
		}
		return factory;
	}
	
	
	public void closeFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}
	
}
