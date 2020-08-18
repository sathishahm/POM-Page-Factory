package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {   // pass this constructor  to test script varibale of driver
		
		this.driver = driver;
		PageFactory.initElements(driver, this);  // intialize the 
	}
	
	// Convert to PageFactory 
	@FindBy(id="input-email")
	private WebElement emailField;  // private meanse should not access the objects directly
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBuuton;
	
	
	/*private By emailField = By.id("input-email");  
	private By passwordField = By.id("input-password");
	private By loginBuuton = By.xpath("//input[@value='Login']"); */
	
	
	public WebElement emailField() {    // Encapsulation to call the methods in Main Class
		
		return emailField;
		 //return driver.findElement(emailField);
		 
	 }
	
	public WebElement passwordField() {
		return passwordField;
		 
		// return driver.findElement(passwordField);
		 
	 }
	
	public WebElement loginBuuton() {
		 
		return loginBuuton;
		// return driver.findElement(loginBuuton);
		 
	 }



}

 