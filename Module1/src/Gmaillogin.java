import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;


public class Gmaillogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.navigate().to("https://gmail.com");
//	
		JavascriptExecutor exe1= (JavascriptExecutor) driver1;
		exe1.executeScript("document.getElementById('identifierId').value='assetstaff2017@gmail.com';");
//		
		//driver1.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		System.out.println("Before Click call");
		driver1.findElement(By.className("CwaK9")).click();
//		System.out.println("AFTER Click call");
//		//*[@id="password"]
//		//driver1.findElement(By.xpath("//*[@id='password']")).sendKeys("werwerW");
//			
		//exe1.executeScript("document.getElementByClassName('password').value='passwordstaff';");
		 WebElement password = driver1.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
	exe1.executeScript("document.getElementById('password').value='passwordstaff';");
//		
//		System.out.println("After password call");
	//	driver1.findElement(By.className("CwaK9")).clear();
//		driver1.findElement(By.className("CwaK9")).click();
		
		
//		WebDriver driver = new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    String url = "https://accounts.google.com/signin";
//	    driver.get(url);
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//	    WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
//	    email_phone.sendKeys("assetstaff2017@gmail.com");
//	    
//	    driver.findElement(By.id("identifierNext")).click();
//	    
//	    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//	    WebDriverWait wait = new WebDriverWait(driver, 20);
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(password));
//	    
//	    password.sendKeys("your_password");
//	    driver.findElement(By.id("passwordNext")).click();; 
	}

}
