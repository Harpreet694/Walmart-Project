package com.walmart.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Testbase;
import com.walmart.qa.pages.Homepage;
import com.walmart.qa.pages.SignInPage;

public class HomePageTest  extends Testbase
{
	Homepage  s;      // object of contactus page 
	public  HomePageTest()
	{
	   super();
	}
	@BeforeMethod
	public void setup()
	{
		
		initiate();
		s=new Homepage ();    //constrcutor of contactus page 
	}
	
	@Test(priority=1)
	public void Entersignininfo()
	{
		s.Validdatasignin("molomhj90@gogo.com","Loveyou12");

	}
	
	@Test(priority=2)
	public void vieworderhistorytab()
	{
		s.vieworderhistory("molomhj90@gogo.com","Loveyou12");

	}
	
	@Test(priority=3)
	public void Myrecommendationstab()
	{
		s.recommendations("molomhj90@gogo.com","Loveyou12");

	}
	@Test(priority=4)
	public void Mysubscriptiotab()
	{
		s.subscription("molomhj90@gogo.com","Loveyou12");

	}
	@Test(priority=5)
	public void Mypersonalsettingtab()
	{
		s.personalsetting("molomhj90@gogo.com","Loveyou12","sukh","singh","L7A1Y7");

	}
	
	@Test(priority=6)
	public void updateemilaaddress()
	{
		s.emailaddresschange("11111111111111111111111111@gmail.com","Pinemill123","molomhj90@gogo.com","Pinemill123");

	}
	@Test(priority=7)
	public void updatepassword()
	{
		s.changepassword("molomhj90@gogo.com","123456789","123456789","Loveyou12","Loveyou12");

	}
	@Test(priority=8)
	public void changelanguage()
	{
		s.changelanguage("molomhj90@gogo.com","Loveyou12");

	}
	
	@Test(priority=9)
	public void addnewcreditcarddetails()
	{
		s.addnewcreditcard("molomhj90@gogo.com","Loveyou12");

	}
	@Test(priority=10)
	public void addshippingaddress()
	{
		s.addnewaddress("molomhj90@gogo.com","Loveyou12","Raman","kaur","7 weatherell dr","Brampton","4039935237","L7A1Y7");

	}
}
/*@AfterMethod
public void teardown()
{
	driver.quit();
}
}*/

