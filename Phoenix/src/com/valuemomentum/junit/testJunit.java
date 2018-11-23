package com.valuemomentum.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testJunit {
	
	@Test
	public void test()
	{
		System.out.println("Hi");
	}
	@Before
	public void Open()
	{
		System.out.println("Open browser");
	}
	@After
	public void Close()
	{
		System.out.println("Close browser");
	}
	@Test
	public void test4()
	{
		System.out.println("Hi4");
	}
	@Test	
	public void test6()
	{
		System.out.println("Hi2");
	}
	
	@Test
	public void test5()
	{
		System.out.println("Hi1");
	}
	
	
}
