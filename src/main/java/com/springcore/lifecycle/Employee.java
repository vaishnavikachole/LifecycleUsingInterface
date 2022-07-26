package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	private String employeeDepartment;

	public Employee() {
		super();
	
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		System.out.println("setting employee department");
		this.employeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [employeeDepartment=" + employeeDepartment + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("init method");
	}

	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}
	
	

}
