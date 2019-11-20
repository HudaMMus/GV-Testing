package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class socialReg {
public WebDriver driver;
	
	public socialReg (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//*[@id="spinner"]/i
	//*[@id='u_0_1']/div/table/tbody/tr/td[2]/div/div
	
	    @FindBy(xpath=("//*[@id='u_0_1']/div/table/tbody/tr/td[2]/div/div"))
	    public WebElement fbLogBtn;
	
		
		@FindBy(xpath=("//*[@id='email']"))
		public WebElement fbMail;
		
		@FindBy(xpath=("//*[@id='pass']"))
		public WebElement fbpass;
		
		
		@FindBy(id="u_0_0")
		public WebElement facebookbtn;
		
		@FindBy(xpath=("//*[@id='u_0_4']/div[2]/div[1]/div[1]/button"))
		public WebElement confirmBtn;
		
		@FindBy(xpath="//*[@id='login']/div[2]/p/a/img")
		public WebElement googBtn;
		
		@FindBy(xpath="//*[@id='identifierId']")
		public WebElement googMail;
		
		@FindBy(xpath=("//*[@id='identifierNext']/span/span"))
		public WebElement next1Btn;
		
		@FindBy(xpath=("//*[@id='password']/div[1]/div/div[1]/input"))
		public WebElement googpass;
		
		@FindBy(xpath=("//*[@id='passwordNext']/span"))
		public WebElement next2Btn;
		
}
