package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	@FindBy(xpath = "//u[contains(text(),'View Activity')]")
	WebElement dashboard_header;

	// take view activity instead of dashboard for xpath
	// Initialized the element
	public DashboardPage(WebDriver driver) {
			this.driver = driver;
			// This initElements method will create all WebElements
			PageFactory.initElements(driver, this);

		}

	public String getDashboardPageTitle() {
		return dashboard_header.getText();
		
		
	}

}
