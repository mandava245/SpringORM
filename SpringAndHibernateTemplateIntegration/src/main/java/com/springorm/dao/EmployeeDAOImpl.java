package com.springorm.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springorm.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int createEmployee(Employee employee) {
		
		int count = (Integer) hibernateTemplate.save(employee);
		
		return count;
	}

}
