package seeitoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecordingPage {
	
	WebDriver driver=null;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
	WebElement recordingTab;	
	
	@FindBy(xpath = "//h3[contains(text(),'Recordings')]") 
	WebElement recordingPageTitle;
	
	@FindBy(xpath = "(//a[@class='btn btn-success'])")
	WebElement newRecordingButton;
	
	@FindBy(xpath = "//input[@id='recording_title']")
	WebElement newRecordingTitle_textField;	
	
	@FindBy(xpath = "//textarea[@id='recording_script']")
	WebElement newRecordingScript_textField;
	
	@FindBy(xpath = "//input[@id='background_music']")
	WebElement backgroundMusic_chooseFileOption;	
	
	@FindBy(xpath = "//input[@name='manage_media']")
	WebElement newRecording_saveManageMediaBtn;
	
	@FindBy(xpath = "//input[@name='commit']")
	WebElement newRecording_saveButton;	
	
	@FindBy(xpath = "//a[contains(text(),'Back')]")
	WebElement newRecording_backButton;	
	
	@FindBy (xpath="(//i[@class='fa fa-pencil'])[1]")
	WebElement editRecording;	
	
	@FindBy (xpath="(//i[@class='fa fa-youtube-play'])[1]")
	WebElement playRecording;	
	
	@FindBy (xpath="(//video[@controls='controls'])")
	WebElement playRecordIcon;	
	
	@FindBy (xpath="(//i[@class='fa fa-trash-o'])[1]")
	WebElement deleteRecording;
	
	@FindBy (xpath="(//i[@class='fa fa-cloud-download'])[1]")
	WebElement downloadRecording;
	
	@FindBy (xpath="(//i[@class='fa fa-share-alt'])[1]")
	WebElement shareIcon;
	
	@FindBy (xpath="(//a/img[@alt='Icon link'])")
	WebElement shareRec_CopyLink; 
	
	@FindBy (xpath="(//a/img[@alt='Icon mail'])")
	WebElement shareRec_MailIcon;
	
	@FindBy (xpath="(//div[@class='col-sm-11'])[1]")
	WebElement shareRec_MailTo;
	
	@FindBy (xpath="(//div[@class='col-sm-11'])[3]")
	WebElement shareRec_MailSubject;
	
	@FindBy (xpath="(//input[@id='send_mail'])")
	WebElement shareRec_MailSendButton;	
	
	@FindBy (xpath="(//a/img[@alt='Icon fb'])")
	WebElement shareRec_Facebook;	
	
	@FindBy (xpath="//span[contains(text(),'Post to Facebook')]")
	WebElement shareRec_PostToFacebook;	
	
	@FindBy (xpath="(//a/img[@alt='Icon twitter'])")
	WebElement shareRec_Twitter;
	
	@FindBy (xpath="(//input[@class='button selected submit'])")
	WebElement shareRec_TweetBtn;	
	
	@FindBy (xpath="(//a/img[@alt='Icon youtube'])")
	WebElement shareRec_YouTube;
	
		// Initialized the element
		public RecordingPage(WebDriver driver) {
			this.driver = driver;
			// This initElements method will create all WebElements
			PageFactory.initElements(driver, this);

		}
		
		// Click on recording tab
		public void recordingTabClick() {
			recordingTab.click();
		}
		
		// Get the title of recording page
		public String getRecordingPageTitle() {
			return recordingPageTitle.getText();
		}
		
		// Click on new recording button
		public void newRecordingButtonClick() {
			newRecordingButton.click();
		}
		
		// enter title
		public void enterTitle(String title) {
			newRecordingTitle_textField.sendKeys(title);
		}
		
		// enter script
		public void enterScript(String script) {
			newRecordingScript_textField.sendKeys(script);
		}
		
		// Click on new save button
		public void saveManageMediaBtnButtonClick() {
			newRecording_saveManageMediaBtn.click();
		}
				
		// Click on new save button
		public void saveButtonClick() {
			newRecording_saveButton.click();
		}
		
		//Click on edit recording icon
		public void editRecordingTabClick(){
			editRecording.click();
		}
		
		//Click on play recording icon
		public void playRecordingClick(){
			playRecording.click();
		}
		
		//Click on play recording icon
		public void playRecordIconClick(){
			playRecordIcon.click();
		}
		
		//Click on delete recording icon
		public void deleteRecordingIconClick(){
			deleteRecording.click();
		}
		//Click on download recording icon
		public void downloadRecordingIconClick(){
			downloadRecording.click();
		}
		
		//Click on download recording icon
		public void ShareIconClick(){
			shareIcon.click();
		}
		
		//Click on ShareRec copy link icon
		public void Share_CopyLinkClick(){
			shareRec_CopyLink.click();
		}
		
		//********* add method if require alert popup
		
		//Click on ShareRec Mail icon
		public void Share_MailIconClick(){
			shareRec_MailIcon.click();
		}
		
		//Click on ShareRec Mail icon
		public void EnterTo_ShareMail(String Enter_Mail){
			shareRec_MailTo.sendKeys(Enter_Mail);
		}
		
		//Click on ShareRec Mail icon
		public void EnterSub_ShareMail(String Enter_Subject){
			shareRec_MailSubject.sendKeys(Enter_Subject);
		}
		
		//Click on ShareRec Mail icon
		public void SendBtn_ShareMail(){
			shareRec_MailSendButton.click();
		}
		
		//Click on ShareRec facebook icon
		public void Share_FacebookIconClick(){
			shareRec_Facebook.click();
		}
		
		//Click on Post to facebook icon
		public void Share_PostToFacebookClick(){
			shareRec_PostToFacebook.click();
		}
		
		//Click on ShareRec Twitter icon
		public void Share_TwitterIconClick(){
			shareRec_Twitter.click();
		}
		
		//Click on Post to facebook icon
		public void Share_TweetBtnClick(){
			shareRec_TweetBtn.click();
		}
		
		//Click on ShareRec YouTube icon
		public void Share_YouTubeIconClick(){
			shareRec_YouTube.click();
		}		
				
}
