package com.valuemomentum.junit;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testTestNG {
	
	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
		Reporter.log("testCase1 starts");
		Reporter.log("testCase2 starts");
		Reporter.log("testCase3 starts");
		Reporter.log("testCase4 starts");
		Reporter.log("testCase5 starts");
	}
	@Test(priority=3)
	public void testCase2()
	{
		System.out.println("testCase2");
		Reporter.log("testCase2 starts");
	}
	@Test(priority=1,enabled=false)
	public void testCase3()
	{
		System.out.println("testCase3");
		Reporter.log("testCase2 starts");
	}
	@Test(priority=3)
	public void testCase4()
	{
		System.out.println("testCase4");
		Reporter.log("testCase4 starts");
	}
	@BeforeMethod
	public void Open()
	{
		System.out.println("Open browser");
		Reporter.log("Open browser");
	}
	@AfterMethod
	public void close()
	{
		System.out.println("end browser");
		Reporter.log("end browser");
	}
	@BeforeClass
	public void Open1()
	{
		System.out.println("Open1 browser");
		Reporter.log("Open1 browser");
	}
	@AfterClass
	public void close1()
	{
		System.out.println("end1 browser");
		Reporter.log("end1 browser");
	}
	@BeforeTest
	public void Report()
	{
		System.out.println("Report");
		Reporter.log("Report");
	}
	@AfterTest
	public void endReport()
	{
		System.out.println("endReport");
		Reporter.log("endReport");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
		Reporter.log("BeforeSuite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
		Reporter.log("AfterSuite");
	}
}
