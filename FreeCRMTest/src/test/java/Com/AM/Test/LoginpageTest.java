package Com.AM.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.AM.Base.TestBase;
import Com.AM.pages.Homepage;
import Com.AM.pages.LoginPage;

public class LoginpageTest extends TestBase {
	LoginPage login;
	Homepage homepage;
	
	//Pushpa added here code here
	//create constructor
	public LoginpageTest(){
		super();//super is a keyword to call parent class constructor.
	}
	//Pushpa updated 2nd time for pushing new codein Github
	@BeforeMethod
	public void setup()throws Exception{
		System.out.println("Step 1: Before calling initialize method");
		Initialize();
		System.out.println("Step 2: Before calling Login page call");
		login = new LoginPage();
	}
	@Test(priority=1)
	public void pagetilteTest(){
		String Title = login.validatepagetitle();
		Assert.assertEquals(Title,"Login | Salesforce");
	}
	@Test(priority=2)
	public void validatelogoTest(){
		boolean flag= login.validatelogo();
		Assert.assertTrue(flag);
	}
	/*@Test(priority=3)
	public void LoginTest(){
		homepage = login.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	@AfterMethod
	public void tearDown()throws Exception{
		System.out.println("After method");
		driver.quit();
	}
	
	
}
