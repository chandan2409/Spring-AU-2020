package com.au.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
empbusinesslogic emplogic=new empbusinesslogic();
Employee emp=new Employee();

@Test
public void testCalculator()
{
	emp.setAge(20);
	emp.setMonthlysalary(8000);
	emp.setName("chandan");
	double appraisal=emplogic.calculateAppraisal(emp);
	assertEquals(500, appraisal,0.0);
}
@Test
public void testannualCalculator()
{
	emp.setAge(20);
	emp.setMonthlysalary(8000);
	emp.setName("chandan");
	double yearly=emplogic.calculateYearlySalary(emp);
	assertEquals(96000, yearly,0.0);

}
}
