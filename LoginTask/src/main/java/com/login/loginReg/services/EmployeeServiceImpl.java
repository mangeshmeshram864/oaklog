package com.login.loginReg.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.login.loginReg.beans.Employee;
import com.login.loginReg.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void saveEmployee(Employee employee) {
	
		employeeDao.saveEmployee(employee);
		
	}

	public Employee loginEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.loginEmployee(employee);
	}

}
