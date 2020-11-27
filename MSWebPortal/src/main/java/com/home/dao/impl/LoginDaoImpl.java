package com.home.dao.impl;

import org.springframework.stereotype.Repository;
import com.home.bean.LoginBean;
import com.home.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public String saveUser(LoginBean loginBean) {

		System.out.println("This is Login Dao Class.");

		return null;
	}

}
