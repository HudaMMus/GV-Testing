package Test;

import DriveDef.chrome;
import PageModel.LandingPage;
import PageModel.LoginPage;
import PageModel.Registration;
import PageModel.socialReg;


public class BaseTest {
	public chrome ChromeDriver = new chrome();
	public LoginPage login = new LoginPage(ChromeDriver.driver);
	public Registration Reg = new Registration (ChromeDriver.driver);
	public socialReg sReg = new socialReg (ChromeDriver.driver);
	public LandingPage landP = new LandingPage (ChromeDriver.driver);
}
