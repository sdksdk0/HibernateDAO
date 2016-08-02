package cn.tf.dao;

import java.util.List;

import cn.tf.domain.Customer;



public interface CustomerDao extends Dao<Customer>{
	List<Customer> find(int startIndex,int size);
}
