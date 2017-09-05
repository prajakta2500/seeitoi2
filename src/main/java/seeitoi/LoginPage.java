package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver=null;

	@FindBy(xpath = "//input[@id='user_email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement password;
	@FindBy(xpath = "//div[@class='form-group']")
	WebElement login;
	@FindBy(xpath = "//h3[contains(text(),'Welcome back to iTOi.')]")
	WebElement titletext;
	@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
	WebElement forgot_password;
	@FindBy(xpath = "//small[contains(text(),'Remember me')]")
	WebElement rememberMe;
	@FindBy(xpath = "//a[contains(text(),'Create an Account!')]")
	WebElement CreateAccount;
	
	

	// Initialized the element
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	// Set username in textbox
	public void setUserName(String userName) {
		username.sendKeys(userName);
	}

	// Set Password in textbox
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}

	// Click on login button
	public DashboardPage loginClick() {
		login.click();
		return null;

	}

	// Get the title of login page
	public String getLoginPageTitle() {
		return titletext.getText();
	}
	
	//Click on forgot password link
	public ForgotPasswordPage forgetLinkClick(){
		forgot_password.click();
		return null;
	}
	
}
