package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage 
{
	//Variable : WebElement :  Sign Up Page
	
	 @FindBy (xpath = "//input[@name='firstname']")
	   private WebElement firstname  ;
	
	 @FindBy (xpath = "//input[@name='lastname']")
	   private WebElement lastname  ;
	
	 @FindBy (xpath = "//input[@name='reg_email__']")
	   private WebElement mobileno  ;
	
	 @FindBy (xpath = "//input[@name='reg_passwd__']")
	   private WebElement password  ;
	
	
	 @FindBy (xpath = "//select[@name='birthday_day']")
	   private WebElement dayofBirth  ;
	   
	   @FindBy (xpath = "//select[@name='birthday_month']")
	   private WebElement dayofMonth  ;
	   
	   @FindBy (xpath = "//select[@name='birthday_year']")
	   private WebElement dayofYear  ;
	  
	   @FindBy (xpath = "//label[text()='Female']")
	   private WebElement Female  ;
	   
	   @FindBy (xpath = "//button[text()='Sign Up']")
	   private WebElement SubmitButton ;
	   
	//   @FindBy (xpath = "//a[@id='terms-link']")
	//   private WebElement terms  ; 
	   
//	   @FindBy (xpath = "//a[@id='privacy-link']")
	//   private WebElement privacy  ;
	   
	   @FindBy (xpath = "//a[@id='cookie-use-link']")
	   private WebElement cookie  ;
	   
	   private WebDriver driver ;
	   private Actions action ;
	   private WebDriverWait wait ;
	  private JavascriptExecutor  javascriptExecutor;
	  
	 //Constructor : Initialization of WebElement : Login Or Sign Up Page
/*	  
  {
	  PageFactory.initElements(driver, this);
	  this.driver = driver ;
	  action = new Actions(this.driver);
	 // wait = new WebDriverwait (driverG, 20);
	  
  }
  */
  public  SignUpPage (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  this.driver = driver ; 
	  action = new Actions (this.driver);
	  wait = new WebDriverWait (driver, 20);
	  javascriptExecutor  = (JavascriptExecutor)driver;
  }
  
//Methods : Action on WebElement : Login Or Sign Up Page
  
  public void selectFirstname()
  {
	  
	  firstname.sendKeys("Toshvi");
  }
  
  public void selectLastname()
  {
	 
	  lastname.sendKeys("Chichmalkar");
  }
  
  public void selectMobileno()
  {
	 
	  mobileno.sendKeys("7385565225");
  }
  
  public void selectPassword()
  {
	 
	  password.sendKeys("Toshvi12");
  }
  
  
  public void selectDay()
  {
	  Select s = new Select (dayofBirth);
	  s.selectByIndex(11);
  }
  public void selectMonth()
  {
	  Select s = new Select (dayofMonth);
	  s.selectByVisibleText("May");
  }
  public void selectYear()
  {
	  Select s = new Select (dayofYear);
	  s.selectByValue("1998");
  }
  
  public void selectFemale()
  {
	 Female.click();
	  
  }
  
  public void ClickOnSubmitButton()
  {
	  SubmitButton.click();
	  
  }
  
  /*public void UserName()
  {
	  JavascriptExecutor  javascriptExecutor  = (JavascriptExecutor)driver;
	javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",userName);
	 
  }
  
  public void clickOnSubmitButton()
  {
	 Actions act = new Actions(driver);
	 action.moveToElement(SubmitButton).click().build().perform();
  }
  
  public void clickOnFemale()
  {
	 // Actions act = new Actions(driver);
	  action.moveToElement(Female).click().build().perform();
  }
  
  public void clickOnterms()
  {
	  WebDriverWait wait = new  WebDriverWait (driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(terms));
		 terms.click();
  }
  
  
  public void clickOnprivacy()
  {
	  WebDriverWait wait = new  WebDriverWait (driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(privacy));
		 privacy.click();
  }
  
  
  public void clickOncookie()
  {
	 WebDriverWait wait = new  WebDriverWait (driver, 20);
	 wait.until(ExpectedConditions.visibilityOf(cookie));
	 cookie.click();
  }
  
  */
  
  
  
  
  
}
