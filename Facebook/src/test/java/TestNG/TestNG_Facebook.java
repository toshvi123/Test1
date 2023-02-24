package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.LogoutPage;
import pomClasses.SignUpPage;

public class TestNG_Facebook 
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
/*	
	@Test
	
	public void Gotologin() 
	{
		
		System.out.println("Test");
	}
	
*/
	
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
