import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Boxsample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.navigate().to("https://cnn.com");
		///html/body/div[7]/section[1]/div[2]/div/div[2]
		
		WebElement box=driver1.findElement(By.xpath("/html/body/div[6]/section[1]/div[2]/div/div[2]"));
		
		List<WebElement> links=box.findElements(By.tagName("a"));
		System.out.println("No. of links in the Box: " + links.size());
		
		for(int i=1;i<links.size();i++)
		{
			System.out.println("Textof the link -- "+links.get(i).getText());
			/*links.get(i).click();
			System.out.println(driver1.getTitle());
			driver1.get("http:/cnn.com");
			System.out.println("-----------------------");
			box= driver1.findElement(By.xpath("/html/body/div[7]/section[1]/div[2]/div/div[2]"));
			links=box.findElements(By.tagName("a"));*/
			
			
		}
		
	}

}
