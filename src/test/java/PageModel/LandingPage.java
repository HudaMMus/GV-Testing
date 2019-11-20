package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='sidebar']/uL/Li[1]")
	public WebElement Videos;
	

	@FindBy(xpath="//*[@id='dataTable:0:actionBtns']/div[1]/button/i")
	public WebElement Publishbtn;
	
	
	@FindBy(xpath= "//*[@id='PublishAccordion_3921']/div[1]/div[1]/h4/a")
	public WebElement fbpublish;
}
//*[@id="PublishAccordion_3924"]/div[1]
