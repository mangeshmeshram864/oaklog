package com.login.loginReg.validation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.login.loginReg.beans.Employee;

public class EmployeeValidation implements Validator{

	public boolean supports(Class<?> argo) {
		// TODO Auto-generated method stub
		return Employee.class.equals(argo);
	}

	public void validate(Object target, Errors errors) {
		
		
	}

	
	

	
	
	
	
}
