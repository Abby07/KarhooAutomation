package com.Karhoo_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserClass_Karhoo {
	
static WebDriver driver;
	
	@BeforeClass
	
	public void browserClass() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","/Users/Abiola/SeleniumSRC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://flit.tech/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='topNav']//a[@title='About']/span[text()='About']")).click();
	}
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();

}
}



