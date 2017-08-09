package com.QUTrust2.com.QUTrust2;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.PonClass;

public class Test1 extends BaseClass{
	@Test
	public void Validlogin()
	{
		PonClass obj1= new PonClass(driver);
		obj1.login("Samit.babbar@semusi.com", "samit@12");
		
	}
	
	@Test
	public void Validlogin2()
	{
		PonClass obj1= new PonClass(driver);
		obj1.login("Samit.babbar@semusi.com", "samit");
		//Assert.assertEquals(act1,"");
	}
	
	@Test
	public void Validlogin3()
	{
		PonClass obj1= new PonClass(driver);
		obj1.login("Samit.babbar@semusi", "samit");
		
	}

}
