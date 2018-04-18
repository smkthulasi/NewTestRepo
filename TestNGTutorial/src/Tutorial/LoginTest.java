package Tutorial;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProvider="getdata")
	public void DoLoginTest(String username, String password){
		
		

		System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");

			
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		System.out.println("username" + username);
		System.out.println("password" + password);
		jse.executeScript("document.getElementById('username').value='"+username+"';");
		jse.executeScript("document.getElementById('password').value='"+password+"';");

		WebElement e3 = driver.findElement(By.id("Login"));
		e3.click();
		
		driver.close();
	}

	@DataProvider
	public Object[][] getdata() throws BiffException, IOException{
		Object[][] data= new DataDriven().Getinput();
		
		/*
		//Object[][] data= new Object[4][2];

		//1st row	
			data[0][0]= "U1";
			data[0][1]="P1";
			
		//2nd row
			data[1][0]= "U2";
			data[1][1]="P2";
			
		//3rd row
			data[2][0]= "U3";
			data[2][1]="P3";
			
		//4th row
			data[3][0]= "U4";
			data[3][1]="P4";
	*/		
			return data;
	
	}
		
	
}
