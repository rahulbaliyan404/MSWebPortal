package com.home.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.home.bean.LoginBean;
import com.home.dao.LoginDao;
import com.home.logic.LoginLogic;

@Component
public class LoginLogicImpl implements LoginLogic {

	@Autowired
	private LoginDao loginDao;

	@Override
	public String saveUser(LoginBean loginBean) {
		String message;
		message = loginDao.saveUser(loginBean);
		return message;
	}

}
