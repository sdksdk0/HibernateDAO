package cn.tf.dao;

import java.io.Serializable;

public interface Dao<T> {
	void add(T t);
	void update(T t);
	void delete(Serializable id);
	T findOne(Serializable id);
}
