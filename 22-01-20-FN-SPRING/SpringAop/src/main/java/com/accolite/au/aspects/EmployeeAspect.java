package com.accolite.au.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.accolite.au.models.Employees;

@Aspect
public class EmployeeAspect {
	private long startTime ;
	private long endTime;

	@Before("execution(* com.accolite.au.services.EmployeeManager.getAllEmployees(..))")
	public void logbeforeV1(JoinPoint joinPoint)
	{
		startTime=System.currentTimeMillis();
		System.out.println(startTime);

		
	}
	@AfterReturning(pointcut = "execution(* com.accolite.au.services.EmployeeManager.getAllEmployees(..))",returning = "retVal")
	   public void afterReturningAdvice(JoinPoint jp, List<Employees> retVal){
		
		for(Employees e:retVal)
		{
		  System.out.print("\nEmpId : " + e.getEmpId());
	      System.out.print(" Name : " + e.getEmployeeName());
	      System.out.print(" Position : " + e.getPos());

	      
		}
		
	   }
	
	@After("execution(* com.accolite.au.services.EmployeeManager.getAllEmployees(..))")
	public void logAfterV1(JoinPoint joinPoint)
	{
		endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
	
}
