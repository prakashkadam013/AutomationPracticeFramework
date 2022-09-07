package com.vtechsolution.automationpractice.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	
	@BeforeTest
	public void SetupChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
