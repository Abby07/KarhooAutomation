package com.Karhoo_Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {
	WebDriver driver;
	//String text;
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	//@FindBy(xpath = "//a[@href='/jobs']/img[@alt='Flit Technologies Ltd logo']")public WebElement message;
	
	public void displayMessage() throws InterruptedException{
		
		String parentHandle =driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		Set<String> handles = driver.getWindowHandles();
		for (String handle: handles){
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				
		String text = driver.findElement(By.xpath("//div[@id='resultDiv']//h2[.='Current Openings']")).getText();
			
		System.out.println(text);
		Assert.assertEquals("Current Openings", text);
			driver.close();
		break;
			}
		}
		
		
		
	}
}
