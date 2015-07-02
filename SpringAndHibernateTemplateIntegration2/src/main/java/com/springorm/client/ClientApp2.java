package com.springorm.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDAO;
import com.springorm.pojo.Employee;

public class ClientApp2 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config/spring-config.xml");
        EmployeeDAO dao = context.getBean("employeeDao",EmployeeDAO.class);
        
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Pavan M");
        employee.setSalary(75000);
        
        dao.updateEmployee(employee);
        
        System.out.println("Employee Updated Successfully...!!!");
    }
}
