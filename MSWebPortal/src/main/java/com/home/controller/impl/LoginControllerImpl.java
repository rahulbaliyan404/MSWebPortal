package com.home.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.home.bean.LoginBean;
import com.home.controller.LoginController;
import com.home.logic.LoginLogic;

@RestController
public class LoginControllerImpl implements LoginController {

	@Autowired
	private LoginLogic loginLogic;

	@Override
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
	
	@Override
	public String saveUser(LoginBean loginBean) {
		String message;
		message = loginLogic.saveUser(loginBean);
		if (message != null) {
			return "200";
		}
		return "300";
	}

	@Override
	public String getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(LoginBean loginBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
