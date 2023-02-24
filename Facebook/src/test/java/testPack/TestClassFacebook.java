package testPack; 

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.LogoutPage;
import pomClasses.SignUpPage;


public class TestClassFacebook 
{
	WebDriver driverTest ;
	LoginOrSignUpPage  loginOrSignUpPage ;
	 SignUpPage signUpPage;
	 LogoutPage  logoutPage;
	
	@Parameters ("browser")
	@BeforeTest
	public void Browserlaunch(String browserName)
	{
		System.out.println("browserName");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\software testing notes\\Atomation\\chromedriver.exe");
				  driverTest = new ChromeDriver();
				  driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\software testing notes\\Atomation\\geckodriver.exe");
				  driverTest = new FirefoxDriver();
				  driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
	}

	@BeforeClass
	
	public void createPOMobjects()
	{
		LoginOrSignUpPage  loginOrSignUpPage = new  LoginOrSignUpPage(driverTest);
		 SignUpPage signUpPage = new SignUpPage(driverTest);
		 LogoutPage  logoutPage = new LogoutPage(driverTest);
	}
	
	@BeforeMethod
	
	public void url()
	{
		driverTest.get("https://www.facebook.com");
		
		LoginOrSignUpPage  loginOrSignUpPage = new  LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.userName();
		loginOrSignUpPage.sendPassword();
		loginOrSignUpPage.cretacc();		
		
			
		System.out.println("Before Method");
	}

	
	@Test (priority=1)
	public void Gotosignin()
	{
		 SignUpPage signUpPage = new SignUpPage(driverTest);
			
			signUpPage.selectFirstname();
			signUpPage.selectLastname();
			signUpPage.selectMobileno();
			signUpPage.selectPassword();
			signUpPage.selectDay();
			signUpPage.selectMonth();
			signUpPage.selectYear();
			signUpPage.selectFemale();
		//	signUpPage.clickOnterms();
		//	signUpPage.clickOncookie();
		//	signUpPage.clickOnprivacy();
			signUpPage.ClickOnSubmitButton();
		
			System.out.println("Test");
	}
	
@Test
	
	public void Gotologin() 
	{
	    LogoutPage  logoutPage = new LogoutPage(driverTest);
	
	   logoutPage.selectoption();
	   logoutPage.selectlogout();  
	    logoutPage.selectlogout1();
		System.out.println("Test");
	}

	@AfterMethod 
	
	public void AfterMethod()
	{
		
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void clearPOMObjects()
	{
		loginOrSignUpPage = null;
		signUpPage = null;
		logoutPage = null;
	}
	@AfterTest
	
	public void closedBrowser() 
	{
		driverTest.close();
		driverTest = null;
		
		System.gc();   // garbage collector
	}
	
}

    