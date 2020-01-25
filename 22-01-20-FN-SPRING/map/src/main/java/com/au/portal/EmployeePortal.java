package com.au.portal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.au.models.Employee;
public class EmployeePortal {
	private Map<Integer,Employee> employee;

	public EmployeePortal(Map<Integer, Employee> employee) {
		this.employee = employee;
	}

//	public Map<Integer, Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Map<Integer, Employee> employee) {
//		this.employee = employee;
//	}
	 public void printemployee(){
	        System.out.println(this.employee);
	    }
}
