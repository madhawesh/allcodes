package com.QUTrust2.com.QUTrust2;

import org.testng.annotations.Test;

public class clsexam2 {
	
	@Test(priority=1)
	
	public void fun1()
	{
		System.out.println("no1");
		
	}
@Test(priority=3)
	
	public void fun2()
	{
		System.out.println("no2");
		
	}
@Test(priority=2)

public void fun3()
{
	System.out.println("no3");
	
}
}
