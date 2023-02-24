package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage
{
	 @FindBy (xpath = "//a[text()='Forgotten password?']")
	   private WebElement forgotMassage ;
	   
	   @FindBy (xpath = "//input[@id='identify_email']")
	   private WebElement emailOrMobile ;
	   
	   
	   @FindBy (xpath = "//button[@id='did_submit']")
	   private WebElement search ;
	   
	   @FindBy (xpath = "//a[text()='Cancel']")
	   private WebElement cancel ;
	   
	   
	   
	   public ForgotPasswordPage (WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void getForgotWindowMesage() {
		   
		   String text = forgotMassage.getText();
		   System.out.println(text);
	   }
	   
	   public void sendPassword() {
		   emailOrMobile.sendKeys("123456789");
		   //mouse action
	   }
	   
	   public void clickOnCancle() {
		   cancel.click();
	   }
	   
	   public void clickOnSearchButton() {
		   search.click();
	   }
	   
	   
	}

