package com.home.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.bean.LoginBean;
import com.home.dao.LoginDao;
import com.home.utils.DbConnection;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private DbConnection connection;

	@Override
	public String saveUser(LoginBean loginBean) {

		System.out.println("This is Login Dao Class." + connection);

		return null;
	}

}
