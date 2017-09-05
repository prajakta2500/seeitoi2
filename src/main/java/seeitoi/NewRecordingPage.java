package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRecordingPage {
	
	WebDriver driver=null;

	@FindBy(xpath = "//u[contains(text(),'New Recording')]")
	WebElement newrecordingPageHeader;

}
