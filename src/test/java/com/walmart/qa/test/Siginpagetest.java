package com.walmart.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Testbase;
import com.walmart.qa.pages.SignInPage;

public class Siginpagetest extends Testbase
{
	
	

		SignInPage s;      // object of contactus page 
	public  Siginpagetest()
	{
	   super();
	}
	@BeforeMethod
	public void setup()
	{
		
		initiate();
		s=new SignInPage();    //constrcutor of contactus page 
	}
	
	@Test
	public void Entersignininfo()
	{
		s.Validdatasignin("molomhj90@gogo.com","Loveyou12");

	
	
}
	
}