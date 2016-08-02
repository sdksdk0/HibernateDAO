package cn.tf.dao;

import java.util.List;

import cn.tf.domain.User;



public interface UserDao extends Dao<User>{
	List<User> findAll();
}
