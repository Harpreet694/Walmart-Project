package com.walmart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.walmart.qa.util.Testutil;

public class Testbase {
	 public static WebDriver driver; //making them static means we can use them in other classes too
		public static Properties prop; // static can be used with classname
		
		public Testbase() {
			try {
				prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Walmart\\src\\main\\java\\com\\walmart\\qa\\config\\config.properties");
			prop.load(file);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();	
		}
		}
		
		//step 2
		public static void initiate() {
			
		//read properties from config file
			String Browsername=prop.getProperty("browser");
			if (Browsername.equals("FireFox") )
					{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\sele\\geckodriver.exe");
		driver=new FirefoxDriver();
			
			driver.manage().window().maximize(); //we will specify common features
			driver.manage().timeouts().pageLoadTimeout(Testutil.Page_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutil.implict_wait, TimeUnit.SECONDS);//time can be changes according to page, so we will put static variable in testutil.java class
	//time can be changes according to page, so we will put static variable in testutil.java class
			driver.get(prop.getProperty("url")); //prop is defined at global level so we can use it anywhere
	                
					}
		}
	}


