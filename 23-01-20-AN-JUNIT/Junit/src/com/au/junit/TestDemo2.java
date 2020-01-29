package com.au.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo2 {
	@Test
	public void testAdd()
	{
		String str="chandan";
		assertEquals("chandan",str);
	}

	@Test
	public void testAdd1()
	{
		int a=10;
		int b=12;
		assertEquals(a+b, 22);
	}
}
