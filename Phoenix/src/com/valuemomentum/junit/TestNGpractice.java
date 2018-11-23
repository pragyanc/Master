package com.valuemomentum.junit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice
{
	
	@BeforeSuite
	public void login()
	{
		System.out.println("Login validation");
	}
	@BeforeClass
	public void home()
	{
		System.out.println("enter username");
	}
	@BeforeTest
	public void firstPage()
	{
		System.out.println("firstPage");
	}
	@AfterSuite
	public void secondPage()
	{
		System.out.println("secondPage");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void testt()
	{
		System.out.println("testt");
	}
	@Test
	public void testtt()
	{
		System.out.println("testtt");
	}
	@Test
	public void testttt()
	{
		System.out.println("testttt");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	

}
