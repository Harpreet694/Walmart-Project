package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.Testbase;

public class Createaccount extends Testbase
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
@FindBy(id="firstName")
WebElement firstname;
@FindBy(id="lastName")
WebElement lastname;
@FindBy(id="phoneNumber")
WebElement phone;
@FindBy(id="email")
WebElement Email;
@FindBy(id="password")
WebElement password;

@FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[8]/div/div/label")
WebElement checkbox1;
@FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[9]/div/div/label")
WebElement checkbox2;
@FindBy(xpath="//span[contains(text(),'My account')]")
WebElement SignInlink;
@FindBy(linkText="Create account")
WebElement CreateAccount;
@FindBy(xpath="//span[contains(text(),'Show')]")
WebElement showbutton;
@FindBy(xpath="//button[contains(text(),'Create account')]")
WebElement createaccountbutton;

public Createaccount() 
{
	PageFactory.initElements(driver, this);
	
 
	    
}

public void Enterdata(String fname, String lname, String number, String emailaddress, String passwor)
{
	SignInlink.click();
	 CreateAccount.click();
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	phone.sendKeys(number);
	Email.sendKeys(emailaddress);
	password.sendKeys(passwor);
	checkbox1.click();
	checkbox2.click();
	createaccountbutton.click();
}
public void enterfirstname(String fname)
{
	SignInlink.click();
	 CreateAccount.click();
	firstname.sendKeys(fname);
	lastname.click();
}
public void enterlastname(String lname)
{
	lastname.sendKeys(lname);
	phone.click();
}
public void enterphonenumber(String number)
{
	phone.sendKeys(number);
	Email.click();
}
public void entervalidemail(String email)
{
	Email.sendKeys(email);
	password.click();
}
public void entervalidpassword(String pass) 
{
	password.sendKeys(pass);
	showbutton.click();
	js.executeScript("window.scrollBy(0,300)");
}
public void checkboxandsubmitbutton()
{
	checkbox1.click();
	checkbox2.click();
}


}













