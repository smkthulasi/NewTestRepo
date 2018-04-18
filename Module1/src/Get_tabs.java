import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Get_tabs {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.navigate().to("https://rediff.com");
		//*[@id="hm_top_navlink_div"]
		// 	/html/body/div[2]/div[8]/div[1]/a[1]/div

		String part1 = ".//*[@id='hm_top_navlink_div']/a[";
		String part2= "]/div";
		
		for(int i=1;i<8;i++)
		{
			String text=driver1.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			
		}
	}

	
}
