package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	
	public void doLogin()
	{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("signin")).click();
				
	}
	
	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
	}

}
