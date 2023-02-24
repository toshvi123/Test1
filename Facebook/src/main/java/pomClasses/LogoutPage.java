package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage 
{
	//Variable : WebElement :  logout Page
	
		 @FindBy (xpath = "(//div[@role='button'])[2]")
		   private WebElement option  ;
		
		 @FindBy (xpath = "(//span[@dir='auto'])[4]")
		   private WebElement logout  ;
		
		 @FindBy (xpath = "//div[@aria-label='Log Out']")
		   private WebElement logout1  ;
		 
		 
		 
		  private WebDriver driver ;
		   private Actions action ;
		   private WebDriverWait wait ;
		  private JavascriptExecutor  javascriptExecutor;
		
		//Constructor : Initialization of WebElement : logout page 
		 
		 public  LogoutPage (WebDriver driver)
		  {
			  PageFactory.initElements(driver, this);
			  this.driver = driver ; 
			  action = new Actions (this.driver);
			  wait = new WebDriverWait (driver, 20);
			  javascriptExecutor  = (JavascriptExecutor)driver;
		  }
		 
		//Methods : Action on WebElement : Login Or Sign Up Page
		  
		  public void selectoption()
		  {
			  
			  option.click();
		  }
		  
		  public void selectlogout()
		  {
			 
			  logout.click();
		  }
		  
		  public void selectlogout1()
		  {
			 
			  logout1.click();
		  }
		 
		 
		 
}




