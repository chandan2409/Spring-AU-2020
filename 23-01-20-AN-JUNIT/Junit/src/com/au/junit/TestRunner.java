package com.au.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(AllTests.class);
		for(Failure fail: result.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println("Result:"+result.wasSuccessful());
		System.out.println("Result:"+result.getRunCount());
	}

}
