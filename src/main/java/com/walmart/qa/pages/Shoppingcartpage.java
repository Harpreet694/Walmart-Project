package com.walmart.qa.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.Testbase;

public class Shoppingcartpage extends Testbase
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
	
	@FindBy(xpath="//input[contains(@class,'e1xoeh2i1 css-ymj5ct eesbt950')]")
	WebElement Search;
	
	@FindBy(xpath="//button[contains(@class,'css-1pgwcoa e1xoeh2i2')]")
	WebElement Searchagain;
	
	@FindBy(xpath="//div[contains(@class,'imgtile_title')]")
	WebElement selectprinter;
	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")

	WebElement Addtocart;
	
	@FindBy(xpath="//button[contains(text(),'+')]")

	WebElement Addtocart1;
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
	WebElement continueshopping;
	@FindBy(xpath="//button[contains(text(),'-')]")
	WebElement deleteoneitemfromcart;
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	WebElement checkbutton;
	@FindBy(xpath="//span[contains(text(),'X Remove')]")
	WebElement Remove;
	@FindBy(xpath="//a[contains(@class,'ei50f4d1 css-frpsc8 elkyjhv0')]")
WebElement itemdetails;
	@FindBy(name="search-form-input")
	WebElement printernameinsearchbar;
	
public  Shoppingcartpage() 
	
	{
		PageFactory.initElements(driver, this);
	}



	public void addoneitem(String item)
	{
		
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		
}
	
	public void addonemoreitem(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
	}
	
	public void increasenumberofitemsincart(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
	}
	
	public void addsameitemmultipletimes(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
		continueshopping.click();	
		Addtocart.click();
		
	}
	
	public void deleteoneitem (String item)
	
	{
	
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
		deleteoneitemfromcart.click();
		
		}
	
	public void deleteallitems(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
		checkbutton.click();
		Remove.click();
		
		
	}
	
	public void iemdetail(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	
		js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
		checkbutton.click();
		itemdetails.click();
		js.executeScript("window.scrollBy(0,700)");
	}
	
	public void closeandreopen( String item)
	{
		
		
		Search.sendKeys(item);
		Searchagain.click();
		selectprinter.click();
	js.executeScript("window.scrollBy(0,500)");
		Addtocart.click();
		Addtocart1.click();
		checkbutton.click();
		driver.close();
		initiate();
		
	}

	public void screenShort() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver
		FileUtils.copyFile(scrFile, new File("D:/Guestuserpage1.png")); //Add throw declaration

	}
	
}



