package seeitoi;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Generic {

	protected WebDriver driver;
	protected static Properties config = null;

	//@BeforeMethod
	 @BeforeSuite
	public void setUp() {
		initConfig();
		System.setProperty("webdriver.chrome.driver", config.getProperty("linux_chromeDriverPath"));
		driver = new ChromeDriver();
		/*driver = new FirefoxDriver();*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.seeitoi.com/users/sign_in");
		// LoginPage loginpage = new LoginPage(driver);
		// login to the application
		// loginpage.setUserName("14dec@mailinator.com");
		// loginpage.setPassword("password");
		// loginpage.loginClick();
		// go to the next page/home page
		// loginpage.loginClick();

	}

	/**
	 * Inits the config.
	 */
	   private static void initConfig() {
		if (config == null) {
			config = new Properties();
			FileInputStream ip = null;

			try {
				ip = new FileInputStream(System.getProperty("user.dir") + File.separator + "Config" + File.separator
						+ "config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void verifyText( String actual,String expected) throws InterruptedException {
		AssertJUnit.assertEquals(actual,expected);
	}
	/*
	 * public void LoginPage(WebDriver driver) // why we have to write this {
	 * this.driver = driver; //This initElements method will create all
	 * WebElements PageFactory.initElements(driver, this); }
	 */
	
  //@AfterMethod
	@AfterSuite  
	public void verifyOKAndLogout() {
		driver.quit();

	}

}
