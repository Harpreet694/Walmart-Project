package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Testbase;
import com.walmart.qa.pages.Createaccount;



public class Createaccountpage extends Testbase
{

	Createaccount c;      // object of contactus page 
public Createaccountpage()
{
   super();
}
@BeforeMethod
public void setup()
{
	
	initiate();
	c=new Createaccount();    //constrcutor of contactus page 
}

//   First Name Field Test cases
@Test(priority=1)
public void FNcharactersonly()
{
	c.enterfirstname("Harpreet");
}
@Test(priority=2)
public void FNshouldnotacceptnumericvalues()
{
	c.enterfirstname("1111111111");
	Assert.assertEquals( "Please enter a valid first name.", "Please enter a valid first name.");
}

@Test(priority=3)
public void FNEnterspecialcharactersvalues()
{
	c.enterfirstname("@#$$$$$$");
	Assert.assertEquals("Please enter a valid first name.", "Please enter a valid first name." );
}
@Test(priority=4)
public void FNshouldnotacceptalphanumericsvalues()
{
	c.enterfirstname("12er*");
	Assert.assertEquals("Please enter a valid first name.", "Please enter a valid first name." );
	
}

@Test(priority=5)
public void Minmumtwocharactersshouldbethere()
{
	c.enterfirstname("La");
	
	
}
@Test(priority=6)
public void Onlyonecharactervalueshouldnotbeallowed()
{
	c.enterfirstname("L");
	Assert.assertEquals("Please enter a valid first name.", "Please enter a valid first name." );
	
}

// Last Name Field Test Cases



@Test(priority=7)
public void lastnameshouldacceptcharactersonly()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
}
	
@Test(priority=8)
public void lastnameshouldnotacceptnumericvalues()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("12345");
	Assert.assertEquals("Please enter a valid last name.", "Please enter a valid last name." );
}
@Test(priority=9)
public void lastnameshouldnotacceptspecialcharactersvalues()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("@#$%^&");
	Assert.assertEquals("Please enter a valid last name.", "Please enter a valid last name." );
}
@Test(priority=10)
public void lastnameshouldnotacceptalphanumericvalues()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("alko1234");
	Assert.assertEquals("Please enter a valid last name.", "Please enter a valid last name." );
}
@Test(priority=11)
public void lastnamemustbeminimumoftwocharacters()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("al");
	Assert.assertEquals("Please enter a valid last name.", "Please enter a valid last name." );
}
@Test(priority=12)
public void Onlyonecharactervalueisnotalowed()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("A");
	Assert.assertEquals("Please enter a valid last name.", "Please enter a valid last name." );
}
@Test(priority=13)
public void Lastnamecannotbeblank()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("");
	Assert.assertEquals("Please enter your last name.", "Please enter your last name." );
}

//Test cases for Phone number Field 

@Test(priority=14)
public void Noerrormessageifleftblank()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("");

}
@Test(priority=15)
public void shouldnotallowedmorethan10characters()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("40399352371");
	Assert.assertEquals("Please enter a valid phone number.", "Please enter a valid phone number." );

}
@Test(priority=16)
public void shouldnotacceptcharacters()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("aaaaaaaaaa");
	Assert.assertEquals("Please enter a valid phone number.", "Please enter a valid phone number." );

}
@Test(priority=17)
public void shouldnotacceptalphanumericvalues()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("aaaa123456");
	Assert.assertEquals("Please enter a valid phone number.", "Please enter a valid phone number." );

}

// Test cases For Email address Field
@Test(priority=18)
public void Emailaddressshouldacceptalphanumericcharacters()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk9010000@gmail.com");
}

@Test(priority=19)
public void Emailaddressshouldnotbeblank()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("");
	Assert.assertEquals("Please enter a valid email address.", "Please enter a valid email address." );
}

@Test(priority=20)
public void Emailaddressshouldnotacceptblankspace()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk             90@nm.com");
	Assert.assertEquals("Please enter a valid email address.", "Please enter a valid email address." );
}

//Test cases for Password field
@Test(priority=21)
public void lengthofpasswordshouldbeminimumof6characters()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("hk90");
	Assert.assertEquals("Your password must be at least 6 characters long.", "Your password must be at least 6 characters long." );
}

@Test(priority=22)
public void passwordfieldshouldnotbeblank()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("");
	Assert.assertEquals("Password is a required field.", "Password is a required field." );
}
@Test(priority=23)
public void passwordfieldshouldacceptnumbersonly()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("12345789");
	}
@Test(priority=24)
public void passwordfieldshouldacceptcharacterssonly()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("pinemillasdfe");
	}
@Test(priority=25)
public void passwordfieldshouldacceptspecialcharacterssonly()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("!@#$%^&");
	}
@Test(priority=26)
public void passwordfieldshouldacceptcombinationofchanumbersandspecialchar()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("Pin123@#$");
	}
@Test(priority=27)
public void clickonshowbutton()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("Pin123@#$");
	Assert.assertEquals("Password Strength: strong", "Password Strength: strong" );
	}
@Test(priority=28)
public void combinationofcharactersnumbersandspecialchashouldshowpasswordasstrong()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("Pin123@#$");
	Assert.assertEquals("Password Strength: strong", "Password Strength: strong" );
	}
@Test(priority=29)
public void combinationofcharactersandnumbersshouldshowasmoderate()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("Pin123");
	Assert.assertEquals("Password Strength: moderate", "Password Strength: moderate" );
	}
@Test(priority=30)
public void combinationofcharactersandspeialcharacterssshouldshowasmoderate()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("Pin@#@#");
	Assert.assertEquals("Password Strength: moderate", "Password Strength: strong" );
	}
@Test(priority=31)
public void onlyspecialchashouldweek()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("!@#$%^&");
	Assert.assertEquals("Password Strength: weak", "Password Strength: moderate" );
	}
@Test(priority=32)
public void shouldacceptcasesenstivevalues()
{
	c.enterfirstname("Harpreet");
	c.enterlastname("Kaur");
	c.enterphonenumber("4039935237");
	c.entervalidemail("hk90@nm.com");
	c.entervalidpassword("PinemiLL");
	
	}
@Test(priority=33)
public void entervalidinformationtocreateaccount()
{
	c.Enterdata("Harpreet","kaur","4039935237","hk309@gmail.com","Pinemill123");


	
}
@AfterMethod
public void teardown()
{
	driver.quit();
}


}

