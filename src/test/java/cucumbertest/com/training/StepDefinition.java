package cucumbertest.com.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver = null;

	@Given("^I am on Facebook login page$")
	public void goToFacebook() {
		System.setProperty("webdriver.chrome.driver","C:/Application/chromedriver.exe");
        driver= new ChromeDriver();   
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.google.co.uk/?gfe_rd=cr&ei=B1-mVd7WHeH88weW-IioCA&gws_rd=ssl");
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
		driver.findElement(By.id("pass")).sendKeys(arg1);
		driver.findElement(By.id("u_0_s")).click();
	}

	@Then("^Login should fail$")
	public void checkFail() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test1 Pass");
		} else

		{
			System.out.println("Test1 Failed");
		}
		driver.close();
	}

	@Then("^Relogin option should be available$")
	public void checkRelogin() throws Exception {
		Thread.sleep(100);
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com")) {
			System.out.println("Test2 Pass");
			
		} else

		{
			System.out.println("Test2 Failed");
		}
		driver.close();
	}
}
