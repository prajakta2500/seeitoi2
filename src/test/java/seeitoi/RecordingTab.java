package seeitoi;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class RecordingTab extends Generic{
	
	RecordingPage recording;
	
	@Test(priority=0)
	public void createRecording() throws InterruptedException{
		// Create Object
		RecordingPage recording	= new RecordingPage(driver);
		
		// click on recording tab
		recording.recordingTabClick();
		Thread.sleep(2000);
		recording.newRecordingButtonClick();
		
		recording.enterTitle("Enter Title123");
		recording.saveButtonClick();
	}
	public void editRecording() throws InterruptedException{
		
		recording.editRecordingTabClick();
		recording.enterTitle("Edit Title123");
		recording.enterScript("Enter Script");
		recording.saveManageMediaBtnButtonClick();
		//recording.saveButtonClick();
		
	}
	
	public void playRecordingIcon() throws InterruptedException{
		recording.playRecordingClick();
		recording.playRecordIconClick();
	}
	
	public void deleteRecording() throws InterruptedException{
		recording.deleteRecordingIconClick();
		
	}
	
	public void downloadRecording() throws InterruptedException{
		recording.downloadRecordingIconClick();
	}
	public void shareRecording_CopyMail() throws InterruptedException{
		recording.ShareIconClick();
		recording.Share_CopyLinkClick();
		
		Alert alert = driver.switchTo().alert();
		//Assert.assertEquals("qa.seeitoi.com says:", alert.getText());
		alert.accept();
		// ********************* how to write - paste copied recording on new window
		Actions newTab = new Actions(driver);
		//newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT)
	}
	public void shareRecording_Mail() throws InterruptedException{
		recording.ShareIconClick();
		recording.Share_MailIconClick();
		recording.EnterTo_ShareMail("prajakta.magar@synerzip.com");
		recording.EnterSub_ShareMail("Share Recording - Mail - Web Portal");
		recording.SendBtn_ShareMail();
	}
	
	public void shareRecording_Facebook() throws InterruptedException{
		recording.Share_FacebookIconClick();
	
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		    // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		    System.out.println(driver.getTitle());
		}
		recording.Share_PostToFacebookClick();
		
	}
	
	public void shareRecording_Twitter() throws InterruptedException{
		recording.Share_TwitterIconClick();
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		    // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		    System.out.println(driver.getTitle());
		}
		recording.Share_TweetBtnClick();
	}
	
	public void shareRecording_YouTUbe() throws InterruptedException{
		
	}
	
}
