package cn.tf.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.tf.domain.Customer;



public class CRUD {
	
	
	//插入数据
	@Test
	public void testSave(){
		
		Customer c=new Customer();
		c.setName("王大锤");
		
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//开启事务
		Transaction tx=session.beginTransaction();
		session.save(c);
		//提交事务
		tx.commit();
		session.close();
		factory.close();
		
	}
	
	//查找数据
	@Test
	public void testFindOne(){
		
		
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//开启事务
		Transaction tx=session.beginTransaction();
		Customer c=(Customer) session.get(Customer.class,1);
		System.out.println(c);
		//提交事务
		tx.commit();
		session.close();
		factory.close();
		
	}
	
	
	//更新
	@Test
	public void testUpdate(){
		
		
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//开启事务
		Transaction tx=session.beginTransaction();
		Customer c=(Customer) session.get(Customer.class,1);
		
		c.setName("王尼玛");
		session.update(c);
		System.out.println(c);
		//提交事务
		tx.commit();
		session.close();
		factory.close();
		
	}
	
	
	//删除
	@Test
	public void testDel(){
		
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//开启事务
		Transaction tx=session.beginTransaction();
		Customer c=(Customer) session.get(Customer.class,1);
		
		session.delete(c);
		//提交事务
		tx.commit();
		session.close();
		factory.close();
		
	}
	

}
