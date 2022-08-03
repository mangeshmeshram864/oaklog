package com.login.loginReg.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.login.loginReg.beans.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveEmployee(Employee employee) {
	
	    Session session=sessionFactory.openSession();
	    Transaction tx=session.beginTransaction();
	    
	    if(employee!=null)
	    {
	    	try {
	    		session.save(employee);
	    		tx.commit();
	    		session.close();
	    	}
	    	catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
	    }

	}

	public Employee loginEmployee(Employee employee) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="for com.login.loginReg.beans.Employee as e where e.e_email=? and e.e_password=?";
		
		try {
		   Query query=session.createQuery(hql);
		   query.setParameter(0,employee.getE_address());
		   query.setParameter(1, employee.getE_password());
		   
		   employee =(Employee)query.uniqueResult();
		   tx.commit();
		   session.close();
		   }
		catch(Exception e)
		{
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return employee;
	}

}
