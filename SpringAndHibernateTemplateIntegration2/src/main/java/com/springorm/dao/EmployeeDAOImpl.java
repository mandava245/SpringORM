package com.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springorm.pojo.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int registerEmployee(Employee employee) {

		int count = (Integer) hibernateTemplate.save(employee);
		
		return count;
	}

	public void updateEmployee(Employee employee) {
		
		hibernateTemplate.update(employee);
		
	}

	public void deleteEmployee(int employeeId) {
		
		Employee employee = getEmployee(employeeId);
		
		hibernateTemplate.delete(employee);
		
	}

	public Employee getEmployee(int employeeId) {
		
		Employee employee = hibernateTemplate.get(Employee.class, employeeId);
		
		return employee;
	}

}
