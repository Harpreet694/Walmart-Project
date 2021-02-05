package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.Testbase;

public class SignInPage extends Testbase
{
	
	@FindBy(xpath="//span[contains(text(),'My account')]")
	WebElement SignInlink;
	@FindBy(id="username")
	WebElement Emailaddress;
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement Signinbutton;
	

public SignInPage() 
{
	PageFactory.initElements(driver, this);
}



public void Validdatasignin(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
}


}
