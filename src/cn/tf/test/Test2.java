package cn.tf.test;

import cn.tf.dao.UserDao;
import cn.tf.dao.impl.UserDaoImpl;
import cn.tf.domain.User;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User();
		user.setUsername("华华");
		UserDao uDao=new UserDaoImpl();
		uDao.add(user);

	}

}
