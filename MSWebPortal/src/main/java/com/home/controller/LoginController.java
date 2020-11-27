package com.home.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.bean.LoginBean;
public interface LoginController {
	
	@RequestMapping("/loadPage")
	public ModelAndView getLoginPage();
	
	@PostMapping(value ="/save")
	 public String saveUser(LoginBean loginBean );

}
