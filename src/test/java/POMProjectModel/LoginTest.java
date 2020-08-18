package POMProjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	
	WebDriver driver;

	@Test
	public void LogIn() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
	LoginPage lp = new LoginPage(driver);
	lp.emailField().sendKeys("arun.selenium@gmail.com");
	lp.passwordField().sendKeys("Second@123");
	Thread.sleep(3000);
	lp.loginBuuton().click();
	
	MyAccountPage myaccountpage = new  MyAccountPage(driver);
	
	Assert.assertTrue(myaccountpage.accountBreadCrumb().isDisplayed());

		
	}
	
	@AfterMethod

	public void closure() {
		driver.close();
	}

}
