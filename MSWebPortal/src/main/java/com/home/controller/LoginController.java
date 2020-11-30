package com.home.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.home.bean.LoginBean;
public interface LoginController {
	
	@RequestMapping(value="/loadPage", method = RequestMethod.GET)
	@ResponseBody public ModelAndView getLoginPage();
	
	@PostMapping(value ="/save")
	 public String saveUser(LoginBean loginBean );
	
	@GetMapping(value ="/get")
	 public String getUserById(int id );
	
	@PutMapping(value ="/ ")
	 public String updateUser(LoginBean loginBean );
	
	@DeleteMapping(value ="/deleteUser")
	 public String deleteUserById(int id );

}
