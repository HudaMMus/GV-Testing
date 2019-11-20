package DriveDef;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class chrome {
	public WebDriver driver;
	public File file = new File ("F://Automation//2-Selenium Webdriver//Drivers//Chrome//chromedriver.exe");
	
	public chrome(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		this.driver = new ChromeDriver();
		
	}
	public void navigate(String URL) {
		this.driver.navigate().to(URL);
		
	}
	
	
	public void assertion1 (String ErrorMessage){
		WebDriverWait wait = new WebDriverWait(driver, 9);
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Register_Form']/div[5]/span[1]"))).getText();
		 String expected = ErrorMessage;
		assertEquals(actual,expected);
		
	}
	public void assertion2 (String ErrorMessage){
		WebDriverWait wait = new WebDriverWait(driver, 9);
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='requestVideos']/div/div/div[2]"))).getText();
		 String expected = ErrorMessage;
		assertEquals(actual,expected);
	}
	
	public void W2 (){
	 WebDriverWait wait = new WebDriverWait(driver, 1);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sidebar']")));
	}
	public void W1 (){
		 WebDriverWait wait = new WebDriverWait(driver, 6);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spinner']/div/span/iframe")));
	}
	 public void quit(){
		 this.driver.quit();
	}
	 
	 public void iframe1facebook() throws Throwable{
		 Thread.sleep(5000);
		    String parentWindow = driver.getWindowHandle();     
		    System.out.println("Parent Window ID is : " + parentWindow);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println(driver.getTitle());
		    }
		    WebDriverWait wait = new WebDriverWait(driver,5);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='facebook']/body")));    
	 }
	 
	 public void iframe2facebook() throws Throwable{
		    String parentWindow = driver.getWindowHandle();     
		    System.out.println("Parent Window ID is : " + parentWindow);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println(driver.getTitle());
		    }
		    WebDriverWait wait = new WebDriverWait(driver,3);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spinner']/div/span/iframe")));
		     
	 }
	 
	 public void iframe2google() throws Throwable{
		    String parentWindow = driver.getWindowHandle();     
		    System.out.println("Parent Window ID is : " + parentWindow);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println(driver.getTitle());
		    }
		    WebDriverWait wait = new WebDriverWait(driver,5);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='yDmH0d']/div[1]")));
	 }
	 
	 /*public void iframe3() throws Throwable{
		    String parentWindow = driver.getWindowHandle();     
		    System.out.println("Parent Window ID is : " + parentWindow);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println(driver.getTitle());
		    }
		    WebDriverWait wait = new WebDriverWait(driver,5);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CybotCookiebotDialog']")));
		     driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']")).click();*/
	
	 public void iframe3publish() throws Throwable{
		    String parentWindow = driver.getWindowHandle();     
		    System.out.println("Parent Window ID is : " + parentWindow);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println(driver.getTitle());
		    }
		    WebDriverWait wait = new WebDriverWait(driver,7);
		     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id='Publish_3921']/div/div"))));
	        }    
}



	 


