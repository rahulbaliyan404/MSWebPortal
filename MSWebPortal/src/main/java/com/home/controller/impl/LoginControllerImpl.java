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

		LoginBean bean = new LoginBean();
		bean.setId(1);
		bean.setName("Rahul");
		bean.setPassword("123");

		message = loginLogic.saveUser(loginBean);
		if (message != null) {
			return "200";
		}
		return "300";
	}

}
