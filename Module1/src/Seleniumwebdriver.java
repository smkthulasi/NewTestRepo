import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumwebdriver {

	public static void main(String[] args) {
		System.out.println("Testing Java program");

		WebDriver driver1;

		System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver1 = new FirefoxDriver();

		// System.setProperty("webdriver.chrome.driver","C:\\sarala\\java\\backup\\chromedriver.exe");
		// driver1= new ChromeDriver();
		
		// driver1.get("http://www.google.com/");

		driver1.get("https://login.salesforce.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver1;
		jse.executeScript("document.getElementById('username').value='assetstaff2017@gmail.com';");
		jse.executeScript("document.getElementById('password').value='password25';");

		/* WebElement e1 = driver1.findElement(By.name("username"));
		 * driver1.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		 * 
		 * driver1.findElement(By.id("username")).sendKeys("sedfdwefww");
		 * WebElement e2=driver1.findElement(By.id("password"));
		 * e2.sendKeys("password25");
		 */

		WebElement e3 = driver1.findElement(By.id("Login"));
		e3.click();

	}

}
