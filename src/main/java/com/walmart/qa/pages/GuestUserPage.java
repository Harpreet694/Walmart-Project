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

public class GuestUserPage extends Testbase

{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//input[contains(@class,'e1xoeh2i1 css-ymj5ct eesbt950')]")
	WebElement Search;
	
	@FindBy(xpath="//button[contains(@class,'css-1pgwcoa e1xoeh2i2')]")
	WebElement Searchagain;
	
	@FindBy(xpath="//li[contains(@class,'rating')]")
	WebElement rating;
	@FindBy(id="rm-CustomerRating")
	WebElement customerrating;
	@FindBy(xpath="//div[contains(@class,'stars rating-filter-stars rating-2-stars rating-1-star')]")
			WebElement twostarratings;
	@FindBy(xpath="//select[contains(@class,'page-select')]")
	WebElement page;
	@FindBy(xpath="//option[contains(text(),' 181 - 240 ')]")
	WebElement pagerange;
	public  GuestUserPage() 
	
	{
		PageFactory.initElements(driver, this);
	}

	public void searchwithdescription(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
	}
	

	public void searchitem(String item)
	{
		
		Search.sendKeys(item);
		Searchagain.click();
		rating.click();
		js.executeScript("window.scrollBy(0,500)");
		customerrating.click();
		twostarratings.click();
	
		}
	public void sortingbasedonrating(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();
		rating.click();
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void selectpage(String item)
	{
		Search.sendKeys(item);
		Searchagain.click();

		js.executeScript("window.scrollBy(0,7000)");
		page.click();
		pagerange.click();
		driver.navigate().refresh();
		
	}
	public void screenShort() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver
		FileUtils.copyFile(scrFile, new File("D:/Guestuserpage1.png")); //Add throw declaration

	}
	
	
	
	
	}
