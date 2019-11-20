package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class NewTest extends BaseTest{	
	
  @BeforeMethod
  public void beforeMethod() throws Throwable {
	 ChromeDriver.navigate("https://gvtesting.gv-one.com/"); 
     }
  
  @Test (testName="Publish with Facebook" , enabled = true)
  public void PublishFace() throws Throwable {
	  login.Emailtxt.sendKeys("nhassan@arkdev.net");
	  login.Passtxt.sendKeys("123456");
	  login.Loginbtn.click();
	  ChromeDriver.W2();
	  landP.Videos.click();
	  landP.Publishbtn.click();
	  ChromeDriver.iframe3publish();
	  landP.fbpublish.click(); 
  }
  
  @Test (testName="Registraion with Facebook" , enabled = false)
  public void regFB() throws Throwable {
	  ChromeDriver.W1();
	  ChromeDriver.iframe2facebook();
	  sReg.fbLogBtn.click();
	  ChromeDriver.iframe1facebook();
	  sReg.fbMail.sendKeys("hmostafa@arkdev.net");
	  sReg.fbpass.sendKeys("sahem123456");
	  sReg.facebookbtn.click();
  }
  
 @Test (testName="Registraion with Google" ,enabled = false)
  public void regGOOG() throws Throwable {
	 sReg.googBtn.click();
	 ChromeDriver.iframe2google();
	 sReg.googMail.sendKeys("arkdevtesting@gmail.com");
	 sReg.next1Btn.click();
	 ChromeDriver.iframe2google();
	 sReg.googpass.sendKeys("arkdevtesting@123");
	 sReg.next2Btn.click();
	 
  }
  @Test (testName="Invalid Login - Empty Fields" ,enabled = false)
  public void LoginFail() {
	 login.Emailtxt.sendKeys(" ");
	  login.Passtxt.sendKeys("");
	  login.Loginbtn.click();
	  ChromeDriver.assertion1("Please enter password.");
  }
  
  @Test (testName="valid Login" ,enabled = false)
  public void LoginPass() {
	 login.Emailtxt.sendKeys("nhassan@arkdev.net");
	  login.Passtxt.sendKeys("123456");
	  login.Loginbtn.click();
  }
  
  @Test (testName="Invalid Registraion - Password error" , enabled = false)
  public void registrationFail() {
	 Reg.SignupLink.click();
	 Reg.Firstname.sendKeys("huda");
	 Reg.Lastname.sendKeys("m");
	 Reg.Email.sendKeys("hmostafa@arkdev.net");
	 Reg.Pass.sendKeys("123456");
	 Reg.Confirmpass.sendKeys("123455");
	 Reg.Group.click();
	 Reg.Terms.click();
	 Reg.SignupBtn.click();
	 ChromeDriver.assertion1("Confirm password should match the password."); 
  }
  
  @Test (testName="Valid Registraion", enabled = false)
  public void registrationPass() { 	
	     Reg.SignupLink.click();
		 Reg.Firstname.sendKeys("huda");
		 Reg.Lastname.sendKeys("m");
	     Reg.Email.sendKeys("huda.mohammad.91@gmail.com");
		 Reg.Pass.sendKeys("123456");
		 Reg.Confirmpass.sendKeys("123456");
		 Reg.Group.click();
		 Reg.Terms.click();
		 Reg.SignupBtn.click();
		 ChromeDriver.assertion2("There are no requests found.");
  }
  
  @AfterTest (enabled = false)
  public void afterTest() {
		  ChromeDriver.quit();  
  }
  
}
