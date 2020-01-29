package com.au.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Testing {
	@Test
	public void testString()
	{
		String abc="This is a String";
		assertEquals("This is a String", abc);
	}

}
