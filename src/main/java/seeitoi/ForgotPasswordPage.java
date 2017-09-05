package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	WebDriver driver=null;

	@FindBy(xpath = "//h3[contains(text(),'Forgot your password?')]")
	WebElement forgot_password_header;
	
	@FindBy(xpath = "//input[@id='user_email']")
	WebElement forgot_password_email;
	
	@FindBy(xpath = "//input[@value='Reset Password']")
	WebElement ResetPassword_Button;
	
	@FindBy(xpath = "//div[@class='form-group']/a")
	WebElement BackToLogin;
	
	
	
	    // Initialized the element
		public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

		}
		
		// Get the title of Forgot Password Page
		public String getForgotPasswordTitle() {
		return forgot_password_header.getText();
		}
				
		/*// Enter email id in forgot password text box
		public void EmailTextClear() {
		forgot_password_email_box.clear();
		}*/
		
		// Enter email id in forgot password text box
		public void EnterEmail(String email) {
		forgot_password_email.sendKeys(email);
		}
		
		// Click on reset password button
		public void resetButtonClick() {
		ResetPassword_Button.click();
	
		}

		
		
}
