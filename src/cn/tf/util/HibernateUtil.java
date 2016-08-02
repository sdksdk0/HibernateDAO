package cn.tf.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static{
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	
}
