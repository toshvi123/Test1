package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage
{
	//Variable : WebElement : Login or Sign Up Page
	
	   @FindBy (xpath = "//input[@id='email']")
	   private WebElement userName  ;
	   
	   @FindBy (xpath = "//input[@id='pass']")
	   private WebElement password  ;
		
	//   @FindBy (xpath = "//button[@name='login']")
	//   private WebElement loginButton  ;
		
	//   @FindBy (xpath = "//a[text()='Forgotten password?']")
	//   private WebElement forgotpaswordLink  ;
		
	   @FindBy (xpath = "(//a[@role='button'])[2]")
	   private WebElement creatacc  ;
	   
	
	   

		//Constructor : Initialization of WebElement : Login Or Sign Up Page
	   
		public LoginOrSignUpPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods : Action on WebElement : Login Or Sign Up Page
		
		public void userName() {
			userName.sendKeys("TOSHVI");
		}
		public void sendPassword() {
			 password.sendKeys("123456789");
		}
		
	//	public void clickonLoginButton() {
	//		loginButton.click();
			
	//	}
		
	//	public void clickonForgotPassword() {
	//		forgotpaswordLink.click();
	//	}
		public void cretacc() {
			creatacc.click();
		}
		
	/*	public void dayofBirth() {
			dayofBirth.sendKeys("12");
		}
		
		public void dayofMonth() {
		   dayofMonth.sendKeys("May");
		}
		
		public void dayofYear() {
			dayofYear.sendKeys("1998");
		}
	*/	
		
		
	}

	

