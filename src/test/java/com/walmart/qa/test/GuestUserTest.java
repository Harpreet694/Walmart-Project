package com.walmart.qa.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Testbase;
import com.walmart.qa.pages.GuestUserPage;


public class GuestUserTest extends Testbase
{
	GuestUserPage s;      // object of contactus page 
	public GuestUserTest()
	{
	   super();
	}
	@BeforeMethod
	public void setup()
	{
		
		initiate();
		s=new GuestUserPage();    //constrcutor of contactus page 
	}
	
	@Test(priority=1)
	public void enteritem()
	{
		s.searchitem("printer");
}
	@Test(priority=2)
	public void searchwithdescriptiotext() throws IOException
	{
		s.searchwithdescription("Nature valley peanut");
		s.screenShort();
	}
	
	
	@Test(priority=3)
	public void searchwithpartialtext() throws IOException
	{
		s.searchwithdescription("peanu");
		s.screenShort();
	}
	
	@Test(priority=4)
	public void searchwithitemnumber() throws IOException
	{
		s.searchwithdescription("30440896");
		s.screenShort();
	}
	@Test(priority=5)
	public void searchwithpartialitemnumber() throws IOException
	{
		s.searchwithdescription("3044");
		s.screenShort();
	}
	
	@Test(priority=6)
	public void searchwithpartialcatogoryname() throws IOException
	{
		s.searchwithdescription("groc");
		s.screenShort();
	}
	@Test(priority=6)
	public void Sortingbasedonratings() throws IOException
	{
		s.sortingbasedonrating("printer");
		s.screenShort();
		
	}
	
	@Test(priority=6)
	public void pagerange() throws IOException
	{
		
		s.selectpage("printer");
		s.screenShort();
		
	}
	@Test(priority=6)
	public void Filteringandsorting() throws IOException
	{
		s.searchitem("printer");
		
		s.screenShort();
	}
	
	
}








