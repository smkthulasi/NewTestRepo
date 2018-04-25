package Com.AM.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.AM.Util.TestUtil;
//trying to push to git repo- Pavithra
//
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream ip=new FileInputStream
					("C:/sarala/workspace/FreeCRMTest/src/main/java/Com/AM/Config/Config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void Initialize(){
		// initialize the browser
		/*String browsername = prop.getProperty("browser");
		System.out.println("browsername" + browsername);
		String url = prop.getProperty("url");
		System.out.println("url" + url);*/
		if(browsername.equals("FF")){
			System.setProperty
			("webdriver.gecko.driver","C:\\sarala\\java\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome")){
			System.out.println("browsername - inside chrome");
			System.setProperty 	("webdriver.chrome.driver","C:\\sarala\\java\\chromedriver.exe");
			driver=new ChromeDriver();
		} 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wati, TimeUnit.SECONDS);
		
	/*	try {
			System.out.println("url......." + prop.getProperty("url"));
		} catch (Exception e) {
			System.out.println("Inside exception");
			e.printStackTrace();
		}*/
		
		driver.get(prop.getProperty("url"));
		
	}
}
