package com.login.loginReg.controller;







import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	//this controller method returns home.jsp
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Locale local,Model model)
	{
		logger.info("welcome to home! ",local);
		return "home";
		
	}
	
}
