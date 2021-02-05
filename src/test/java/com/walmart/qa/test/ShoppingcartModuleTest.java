package com.walmart.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Testbase;

import com.walmart.qa.pages.Shoppingcartpage;

public class ShoppingcartModuleTest extends Testbase


{

	Shoppingcartpage s;      // object of contactus page 
	public ShoppingcartModuleTest()
	{
	   super();
	}
	@BeforeMethod
	public void setup()
	{
		
		initiate();
		s=new Shoppingcartpage();    //constrcutor of contactus page 
	}
	
	@Test(priority=1)
	public void addoneitemincart() throws IOException
	{
		s.increasenumberofitemsincart("printer");
		s.screenShort();
}

	@Test(priority=2)
	public void addonemoreitemincart() throws IOException
	{
		s.addonemoreitem("printer");
		s.screenShort();
}

	@Test(priority=3)
	public void addmultipleitemincart() throws IOException
	{
		s.addsameitemmultipletimes("printer");
		s.screenShort();
}
	
	@Test(priority=4)
	public void deleteoneitemfromcarts() throws IOException
	{
		s.deleteoneitem("printer");
		s.screenShort();
}
	

	@Test(priority=5)
	public void deleteallitemfromcarts() throws IOException
	{
		s.deleteallitems("printer");
		s.screenShort();
}
	

	@Test(priority=6)
	public void closeandopen()
	{
	s.closeandreopen("printer");
	
}
	
	
	
	
}
