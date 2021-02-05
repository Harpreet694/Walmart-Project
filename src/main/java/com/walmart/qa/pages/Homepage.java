package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walmart.qa.base.Testbase;

public class Homepage extends Testbase
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//span[contains(text(),'My account')]")
	WebElement SignInlink;
	@FindBy(id="username")
	WebElement Emailaddress;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(xpath="//span[contains(@class,'css-hl2cc3 evkjyb03')]")
	WebElement link;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement Signinbutton;
	@FindBy(xpath="//a[contains(text(),'Order History')]")
	WebElement viewallorders;
	@FindBy(linkText="My Recommendations")
	WebElement Myrecommendationslink;
	@FindBy(linkText="My Subscriptions")
	WebElement Mysubscriptionlink;
	@FindBy(linkText="Personal Settings")
	WebElement Mypersonalsettingslink;
	@FindBy(xpath="//span[contains(@class,'arrow-link')]")
	WebElement Editbutton;
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(name="postalCode")
	WebElement postalcode;
	@FindBy(id="update-details-btn")
	WebElement savebutton;
	@FindBy(xpath="//*[@id=\"set-edit-email\"]")
	WebElement addressEditbutton;
	@FindBy(name="email")
	WebElement emailaddress;
	@FindBy(name="password")
	WebElement currentpassword;
	@FindBy(id="update-email-btn")
	WebElement saveemailidbutton;
	@FindBy(xpath="//*[@id=\"set-edit-password\"]")
	WebElement passwordEditbutton;
	@FindBy(name="oldPassword")
	WebElement oldpassword;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement newpassword;
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	@FindBy(id="update-passwd-btn")
	WebElement savepasswordbutton;	
	//for language
	@FindBy(id="set-edit-language")
	WebElement Editlanuagebutton;
	@FindBy(xpath="//span[contains(@class,'indent')]")
	WebElement radibutton;
	@FindBy(id="update-language-btn")
	WebElement savelanguagebutton;
	//for creditcard
	@FindBy(linkText="Credit Cards")
	WebElement creditcardlink;
	@FindBy(xpath="//button[contains(text(),'Add new credit card')]")
	WebElement addnewcard;
	//for Addresses tab
	@FindBy(linkText="Addresses")
	WebElement Addresslink;
	@FindBy(xpath="//*[@id=\"shipping-first-name\"]")
	WebElement shippingfirstname;
	@FindBy(id="shipping-last-name")
	WebElement shippinglastname;
	@FindBy(id="shipping-address1")
	WebElement shippingaddress;
	@FindBy(id="shipping-city")
	WebElement shippingcity;
	@FindBy(id="provinces")
	WebElement shippingprovince;
	@FindBy(xpath="//input[@id='shipping-postal-code']")
	WebElement postalcode1;
	@FindBy(id="shipping-phone")
	WebElement shippingphonenumber;
	@FindBy(xpath="//*[@id=\"save-address-btn\"]")
	WebElement saveaddebutton;
public Homepage() 
{
	PageFactory.initElements(driver, this);
}
public void Validdatasignin(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	viewallorders.click();
}
public void vieworderhistory(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	viewallorders.click();
}

public void recommendations(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Myrecommendationslink.click();
	js.executeScript("window.scrollBy(0,500)");
}
public void subscription(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Mysubscriptionlink.click();

}
public void personalsetting(String validemail,String Pass, String fname,String lname, String postal)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Mypersonalsettingslink.click();
	Editbutton.click();
	firstname.clear();
	firstname.sendKeys(fname);
	lastname.clear();
	lastname.sendKeys(lname);
	postalcode.clear();
	postalcode.sendKeys(postal);
	js.executeScript("window.scrollBy(0,500)");
	savebutton.click();
	}

public void emailaddresschange(String validemail,String Pass, String newemail,String pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Mypersonalsettingslink.click();
	js.executeScript("window.scrollBy(0,1000)");
	addressEditbutton.click();
	emailaddress.clear();
	emailaddress.sendKeys(newemail);
	currentpassword.sendKeys(pass);
	saveemailidbutton.click();		
}

public void changepassword(String validemail,String Pass,String oldpass ,String newpasswords,String confirm)
{

	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Mypersonalsettingslink.click();
	js.executeScript("window.scrollBy(0,600)");
	passwordEditbutton.click();
	oldpassword.sendKeys(oldpass);
	newpassword.sendKeys(newpasswords);
	confirmpassword.sendKeys(confirm);
	savepasswordbutton.click();
	}

public void changelanguage(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	Mypersonalsettingslink.click();
	js.executeScript("window.scrollBy(0,800)");
	Editlanuagebutton.click();
	radibutton.click();
	savelanguagebutton.click();
}

public void addnewcreditcard(String validemail,String Pass)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	js.executeScript("window.scrollBy(0,500)");
	creditcardlink.click();
	addnewcard.click();
}
public void addnewaddress(String validemail,String Pass,String firstname, String lname, String address, String city, String phone,String postal)
{
	SignInlink.click();
	Emailaddress.sendKeys(validemail);
	Password.sendKeys(Pass);
	Signinbutton.click();
	link.click();
	js.executeScript("window.scrollBy(0,500)");
	Addresslink.click();
	shippingfirstname.sendKeys(firstname);
	shippinglastname.sendKeys(lname);
	shippingaddress.sendKeys(address);
	js.executeScript("window.scrollBy(0,400)");
	shippingcity.sendKeys(city);
	Select obj=new Select(shippingprovince);
	obj.selectByVisibleText("Ontario");
	postalcode1.sendKeys(postal);
	shippingphonenumber.sendKeys(phone);
	js.executeScript("window.scrollBy(0,300)");
	saveaddebutton.click();
}

}
