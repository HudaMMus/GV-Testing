package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public WebDriver driver;
	
	public Registration (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='pages']/div/div/div/p[3]/a/span")
	public WebElement SignupLink;
	
	@FindBy(xpath="//*[@id='RegisterName']")
	public WebElement Firstname;
	
	@FindBy(xpath="//*[@id='lastName']")
	public WebElement Lastname;
	
	@FindBy (id="RegisterEmail")
	public WebElement Email;
	
	@FindBy(xpath="//*[@id='RegisterPassword']")
	public WebElement Pass;
	
	@FindBy(xpath="//*[@id='RegisterPasswordConfirm']")
	public WebElement Confirmpass;
	
	
	@FindBy(xpath="//*[@id='organization']/option[@value='190']")
	public WebElement Group;
	
	@FindBy(xpath="//*[@id='Register_Form']/div[7]/div/label/i")
	public WebElement Terms;
	
	@FindBy(xpath="//*[@id='registerBtn']")
	public WebElement SignupBtn;
	
	@FindBy(xpath="//*[@id='requestVideos']/div/div/div[2]")
	public WebElement text;	
	
}
