package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest {
	
	/*
	 SoftAssert softa = new SoftAssert();
	
	@Test
	public void DoRegister(){
		String ExpectedTitle = "XXX";
		String ActualTitle = "YYY";
		System.out.println("A");
		softa.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("B");
		
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		//Assert.assertTrue(2>9, "Error occured");
		//Assert.assertTrue(isElementPresent(""), "Error message");
		softa.assertAll();
		// to directly fail a test
		//Assert.fail("Error message");
		
		*/
		
		
public WebDriver driver;

@Test(priority=1)
public void launchBrowser(){
	System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	driver= new FirefoxDriver();	
}

@Test(priority=3)
public void closeBrowser(){
	driver.close();
}

@Test(priority=2)
public void Gettitle(){
	driver.get("https://rediff.com");
	Assert.assertEquals("Rediff", driver.getTitle());
}

}
