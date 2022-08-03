package com.login.loginReg.dao;

import com.login.loginReg.beans.Employee;

public interface EmployeeDao {
	
	
	public void saveEmployee(Employee employee);
	public Employee loginEmployee(Employee employee);
	

}
