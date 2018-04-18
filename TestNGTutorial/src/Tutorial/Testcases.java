package Tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases {
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("***Before Suite***");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("***After Suite***");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Its Before Test");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("Its After Test");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("---Before Method---");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("---After Method---");
	}
	
	@Test
	public void DoLogin(){
		System.out.println("Login function");
	}
	
	@Test
	public void GivePassword(){
		System.out.println("Give the password");
	}

	@Test
	public void DoLogout(){
		System.out.println("Logged out");
	}
}
