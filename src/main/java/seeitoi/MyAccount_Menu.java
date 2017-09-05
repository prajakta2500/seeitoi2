package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Menu {
	
	WebDriver driver=null;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	WebElement myAccount;
	@FindBy(xpath = "(//i[@class='fa fa-lock'])")
	WebElement changePassword;
	@FindBy(xpath="(//i[@class='fa fa-sign-out'])")
	WebElement logout;
	@FindBy(xpath="(//i[@class='fa fa-sign-in'])")
	WebElement youTubeLogin;
	@FindBy(xpath="(//i[@class='fa fa-sign-in'])")
	WebElement youTube_Login;
	@FindBy(xpath="(//i[@class='fa fa-youtube'])")
	WebElement youTubeLogout;
	@FindBy(xpath="(//input[@id='user_current_password'])")
	WebElement currentPassword;	
	@FindBy(xpath="(//input[@id='user_password'])")
	WebElement newPassword;	
	@FindBy(xpath="(//input[@id='user_password_confirmation'])")
	WebElement confirmPassword;	
	@FindBy(xpath="(//input[@class='btn btn-primary'])")
	WebElement changePasswordBtn;	
	
		
	// Initialized the element
	public MyAccount_Menu(WebDriver driver) {
	this.driver = driver;
	// This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
    }
		
	// Click on My Account
	public void my_account() {
		myAccount.click();
	}
	
	// Click on Change Password
	public void change_Password() {
		changePassword.click();
	}
	
	// Enter text change password
	public void changePassword_TextField(String Current_Password) {
		currentPassword.sendKeys(Current_Password);
	}
	
	// Enter text new password
	public void newPassword_TextField(String New_Password) {
		newPassword.sendKeys(New_Password);
	}
	// Enter text confirm password
	public void confirmPassword_TextField(String Confirm_Password) {
		confirmPassword.sendKeys(Confirm_Password);
	}
	
	// Click on Change password button
	public void changePasswordButton() {
		changePasswordBtn.click();
	}

	// Click on My Account
	public void my_account_Logout() {
	logout.click();
		}
		
	
}
