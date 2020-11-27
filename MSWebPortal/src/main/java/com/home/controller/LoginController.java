package com.home.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/loginController")
public interface LoginController {
	
	@RequestMapping("/loadPage")
	public ModelAndView getLoginPage();

}
