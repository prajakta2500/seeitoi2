package seeitoi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import seeitoi.ForgotPasswordPage;
import seeitoi.LoginPage;
import seeitoi.MyAccount_Menu;
import seeitoi.RecordingPage;
import seeitoi.Generic;

public class LoginPage_TestScenario extends Generic{
	
	LoginPage lp;
	ForgotPasswordPage fpp;
	MyAccount_Menu mam;
	RecordingPage rp;
		
	@BeforeClass
	public void setup() throws MalformedURLException {		
		try {			
			fpp = new ForgotPasswordPage(driver);
			lp = new LoginPage(driver);
			mam = new MyAccount_Menu(driver);
			rp = new RecordingPage(driver);
					
			
			} catch (Exception e) {			
				e.printStackTrace();		
				
			}	}
	
	@Test(priority=0)
	public void testLoginValid() throws InterruptedException
	{
			
		//Verify login page title
	    String loginPageTitle = lp.getLoginPageTitle();
	    verifyText(loginPageTitle,"Welcome back to iTOi.");
//		Assert.assertTrue(loginPageTitle.contains("Welcome back to iTOi.")); //use assert equal
//		Assert.assertEquals(, loginPageTitle);
		System.out.println("Login Page Title is: Welcome back to iTOi");
		
		//login to the application
		lp.setUserName("14dec@mailinator.com");
		lp.setPassword("password");
		lp.loginClick();
		Thread.sleep(2000);
		//do not create object instead of that use homepage sarkhi method  Login_Page java class 
		
		//verify home page
        //String dashboardPageTitle = dashboard.getDashboardPageTitle();
		//Assert.assertTrue(dashboardPageTitle.contains("Dashboard")); //use assert equal
        //Assert.assertEquals("View Activity", dashboardPageTitle);
		
		String recordPageTitle = rp.getRecordingPageTitle();
		AssertJUnit.assertEquals("Recordings", recordPageTitle);
		System.out.println("After login user redirect to Recordings Page.");
				
		mam.my_account();
		mam.my_account_Logout();		
		
		AssertJUnit.assertEquals("Welcome back to iTOi.", loginPageTitle);
		System.out.println("On logout action user redirect to login page");
		
	}
	@Test(priority=0)
	public void forgotPassword_Validmail() throws InterruptedException{
			
		lp.forgetLinkClick();
		Thread.sleep(2000);
		String forgotPageTitle = fpp.getForgotPasswordTitle();
		AssertJUnit.assertEquals("Forgot your password?", forgotPageTitle);
		System.out.println("on click on forgot password link, user redirect to forgot password Page.");
				
		fpp.EnterEmail("13feb1@mailinator.com");
		fpp.resetButtonClick();
		
		String loginPageTitle = lp.getLoginPageTitle();
		AssertJUnit.assertEquals("Welcome back to iTOi.", loginPageTitle);
		System.out.println("Login Page Title is: Welcome back to iTOi");
		
		
		}
	
	public void changePassword() throws InterruptedException{
		MyAccount_Menu password = new MyAccount_Menu(driver);
		password.my_account();
		password.change_Password();
		password.change_Password();
		password.changePassword_TextField("password");
		password.newPassword_TextField("password");
		password.confirmPassword_TextField("password");
		password.changePasswordButton();
	}
	
}
