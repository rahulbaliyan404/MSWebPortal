package com.home.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.home.controller.LoginController;

@RestController
public class LoginControllerImpl implements LoginController {
	
	@Override
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
}
