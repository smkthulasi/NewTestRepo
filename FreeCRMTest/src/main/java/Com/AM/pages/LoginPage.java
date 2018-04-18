package Com.AM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Com.AM.Base.TestBase;

public class LoginPage extends TestBase{

	//define pagefactory or object repository in login page.
	@FindBy(name="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="rememberUn")
	WebElement remember;
	@FindBy(id="Login")
	WebElement login;
	@FindBy(id="logo")
	WebElement logo;
	
	
	// Initialize the webelements
	// creating constructor
	public LoginPage(){
		PageFactory.initElements(driver, this);//this is current class object
		
	}
	
	//Actions
	public String validatepagetitle(){
		return driver.getTitle();
	}
	public boolean validatelogo(){
		return logo.isDisplayed();
	}
	
	public Homepage validatelogin(String uname, String pwd){
		username.sendKeys(uname);
		password.sendKeys(pwd);
		remember.click();
		login.click();
		
		return new Homepage();
	}


}

