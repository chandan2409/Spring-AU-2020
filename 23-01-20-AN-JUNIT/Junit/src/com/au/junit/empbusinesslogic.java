package com.au.junit;

public class empbusinesslogic {
	 // Calculate the yearly salary of employee
	   public double calculateYearlySalary(Employee employeeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = employeeDetails.getMonthlysalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(Employee employeeDetails) {
	      double appraisal = 0;
			
	      if(employeeDetails.getMonthlysalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
}
