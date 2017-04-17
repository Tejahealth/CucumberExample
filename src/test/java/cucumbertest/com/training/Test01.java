package cucumbertest.com.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:/Application/chromedriver.exe");
        driver= new ChromeDriver();   
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.google.co.uk/?gfe_rd=cr&ei=B1-mVd7WHeH88weW-IioCA&gws_rd=ssl");
		driver.quit();
	}

}
