package com.home.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.bean.LoginBean;

@RequestMapping("/loginController")
public interface LoginController {
	
	@RequestMapping("/loadPage")
	public ModelAndView getLoginPage();
	
	@RequestMapping("/save")
	 public String saveUser(@RequestBody LoginBean loginBean);

}
