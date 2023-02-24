package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.LoginOrSignUpPage;
import pomClasses.LogoutPage;
import pomClasses.SignUpPage;

public class Assert 
{
WebDriver driverTest ;
	
	@BeforeClass
	
	public void Browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\software testing notes\\Atomation\\chromedriver.exe");
		
		  driverTest = new ChromeDriver();
		  driverTest.get("https://www.facebook.com");
		driverTest.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Before class");
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
	public void TestA()
	{
			System.out.println("TestA");
			
			String actualUrl = "https://www.facebook.com/" ;
			String expectedURl = "https://www.facebook.com/home" ;
			
			String actualTitle = "Facebook - log in or sign up" ;
			String expectedTitle = "Facebook - log in or sign up" ;
			
			String actualName = "Cancle" ;
			String expectedName = "Cancle123" ;
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualUrl, expectedURl,"Homepage URL is not found");
			soft.assertEquals(actualTitle, expectedTitle,"Homepage Title is Wrong");
			soft.assertEquals(actualName, expectedName,"Homepage Cancle is not found");
			soft.assertAll();
			
			System.out.println("Hello");
	}
	

	@AfterMethod 
	
	public void Gotologout()
	{

		// ArrayList<String> address1 =new ArrayList<String>(driverTest.getWindowHandles());
	  //    driverTest.switchTo().window(address1.get(1));
		//  System.out.println(driverTest.getCurrentUrl());
		  
		  LogoutPage  logoutPage = new LogoutPage(driverTest);
			
			logoutPage.selectoption();
			logoutPage.selectlogout();  
			logoutPage.selectlogout1();
		
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void Gotoswitch()
	{
		System.out.println("AfterClass");
		driverTest.quit();
	}
	
}

