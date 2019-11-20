package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="LoginEmail")
	public WebElement Emailtxt;
	
	@FindBy (id="LoginPassword")
	public WebElement Passtxt;
	
	@FindBy(id="edit-submit")
	public WebElement Loginbtn;
	
	@FindBy(xpath="//*[@id='user-login']/div[2]/span[1]")
	public WebElement MailValid;
	
}
