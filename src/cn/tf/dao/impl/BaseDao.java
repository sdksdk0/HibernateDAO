package cn.tf.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


import cn.tf.dao.Dao;
import cn.tf.util.HibernateUtil;

public class BaseDao<T>  implements  Dao<T> {

	private Class clazz;
	
	public BaseDao(){
		//this.clazz=clazz;
		ParameterizedType  type=(ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
		
		
	}
	
	
	public void add(T t) {
		Session s=HibernateUtil.getSession();
		Transaction tx=s.beginTransaction();
		s.save(tx);
		tx.commit();
		s.close();
		
	}

	public void update(T t) {
		Session s=HibernateUtil.getSession();
		Transaction tx=s.beginTransaction();
		s.update(tx);
		tx.commit();
		s.close();
		
	}

	public void delete(Serializable id) {
		Session s=HibernateUtil.getSession();
		Transaction tx=s.beginTransaction();
		
		T t=findOne(id);
		s.delete(tx);
		tx.commit();
		s.close();
		
	}

	public T findOne(Serializable id) {
		Session s=HibernateUtil.getSession();
		Transaction tx=s.beginTransaction();
		T t=(T) s.get(clazz, id);
		tx.commit();
		s.close();
		return t;
	}
	
	
	
	

}
