package com.accolite.au.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.accolite.au.models.Employees;

@Component
public class EmployeeManager {


public Employees getEmployeeById(Integer employeeId)
{
	System.out.println("Method getEmployeesById() method called");
	return new Employees();
}

public List<Employees>getAllEmployees(){
	List<Employees> all_employees=new ArrayList<Employees>();
	String pos[]= {"Manager","Assistant Manager","Developer","Tester"};
	String name[]= {"Babu","Chandan","Anish","Chibi"};
	for(int i=0;i<4;i++)
	{
		all_employees.add(new Employees(i,name[i],pos[i]));
	}
	System.out.println(all_employees);
	return all_employees;
}

public void createEmployee(Employees employee)
{
	System.out.println("Method CreateEmployee() called");
}
public void deleteEmployee(Employees employee)
{
	System.out.println("Method DeleteEmployee() called");
}
public void updateEmployee(Employees employee)
{
	System.out.println("Method updated Employee() called");
}

}
