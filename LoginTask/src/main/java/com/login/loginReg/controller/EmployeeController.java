package com.login.loginReg.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.loginReg.beans.Employee;
import com.login.loginReg.services.EmployeeService;
import com.login.loginReg.validation.EmployeeValidation;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	//following 2methods are used for login processiong 
	
	//this methpd return only register page when request comes to/emplyee/register
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public  String showForm(ModelMap model)
	{
		model.put("EmployeeDate", new Employee());
		return "register/register";
	}
	
	////this methods is used to processing registration from when employee submit the form 
	//we catch whole form data inside @modelAdttribute Annotation employee object 
	//affter that we validate the for if any feild is empty or not
	//then we procss it by calling service method
	
	public String saveForm(ModelMap model,@ModelAttribute("employeeData")@Valid Employee employee,BindingResult br,HttpSession session)
	{
		EmployeeValidation employeeValidation=new EmployeeValidation();
		employeeValidation.validate(employeeValidation, br);
		
		
		if(br.hasErrors())
		{
			return "register/register";
		}else
		{
			employeeService.saveEmployee(employee);
			session.setAttribute("employee", employee);
			return "redirect:sucess";
		}
	}
	
	//following 2 methods are used for loging proccesing 
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLogin(ModelMap model,HttpSession session)
	{
		 if(session.getAttribute("employee")==null) {
			 model.put("employeeData", new Employee());
			 return "login/login";
		 }
		 else
		 {
			 return "redirect:success";
		 }
	}
	
	//this method process the login form and authenticate customer if login is valid
	
	public String doLogin(ModelMap model,@ModelAttribute("employeeData")Employee employee,HttpSession session)
	{
		if(employee.getE_loginId()!=null&&employee.getE_password()!=null &&session.getAttribute("employee")==null)
		{
			employee=employeeService.loginEmployee(employee);
			if(employee!=null)
			{
				session.setAttribute("employee", employee);
				return "redirect:success";
				
			} else
			 {
				 model.put("failed", "Login Failed");
				 return "login/login";
				 
			 } 
		}else
			 {
				 return "redirect:success";
			 }
		}
	
	}
	

