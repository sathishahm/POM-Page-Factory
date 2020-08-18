package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver driver;
		
	public MyAccountPage(WebDriver driver) {   // pass this constructor  to test script varibale of driver
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='breadcrumb']//a[text()='Account']")
	private WebElement accountBreadCrumb;
	
	//private By accountBreadCrumb = By.xpath("//*[@class='breadcrumb']//a[text()='Account']");

	public WebElement accountBreadCrumb() {
		return accountBreadCrumb;
	
		//return driver.findElement(accountBreadCrumb);
	}

}
  