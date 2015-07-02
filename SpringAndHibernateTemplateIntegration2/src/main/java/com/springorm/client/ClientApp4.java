package com.springorm.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDAO;
import com.springorm.pojo.Employee;

public class ClientApp4 
{
    public static void main( String[] args )
    {
    	
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config/spring-config.xml");
        EmployeeDAO dao = context.getBean("employeeDao",EmployeeDAO.class);
        
        Employee employee = dao.getEmployee(1);
        
        System.out.println("Employee Details : ");
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getSalary());
        
    }
}
