package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pomClasses.ForgotPasswordPage;
import pomClasses.LoginOrSignUpPage;
import pomClasses.LogoutPage;
import pomClasses.SignUpPage;



public class TestClass 
{
public static void main(String[] args)
{
	WebDriver driverTest ;
	System.setProperty("webdriver.chrome.driver","D:\\software testing notes\\Atomation\\chromedriver.exe");
	
	  driverTest = new ChromeDriver();
	
	driverTest.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driverTest.get("https://www.facebook.com");
	
	LoginOrSignUpPage  loginOrSignUpPage = new  LoginOrSignUpPage(driverTest);
	
	loginOrSignUpPage.userName();
	loginOrSignUpPage.sendPassword();
	loginOrSignUpPage.cretacc();
	//	loginOrSignUpPage.clickonLoginButton();
//	loginOrSignUpPage.clickonLoginButton();
//	loginOrSignUpPage.clickonForgotPassword();
	
//	ForgotPasswordPage  forgotPasswordPage =  new ForgotPasswordPage(driverTest);
	
//	forgotPasswordPage.sendPassword();
//	forgotPasswordPage.clickOnSearchButton();
	
	
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

	LogoutPage  logoutPage = new LogoutPage(driverTest);
	
	logoutPage.selectoption();
	logoutPage.selectlogout();
	logoutPage.selectlogout1();
	
	driverTest.quit();
}
}
