package com.Karhoo_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TeamPage {
	WebDriver driver;
	public TeamPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	////body[@class='flittech-red team-page teamPage']//a[@class='button main ga_event']
	@FindBy(xpath = "//body[@class='flittech-red team-page teamPage']//a[@class='button main ga_event']") 
	public WebElement apply;
	@FindBy(xpath = "//div[text()='Accept & Close']")public WebElement cookies;
	//@FindBy(xpath = "/html/body[@class='flittech-red team-page teamPage']/main/div[4]/div[@class='grid-container']//a[@href='https://karhoo.bamboohr.co.uk/jobs/']") 
	//public WebElement apply;

	
	public void applyBtn(){
		
		cookies.click();
		Actions action = new Actions(driver);
		action.moveToElement(apply);
		//action.moveToElement(tabName);
		action.click();
		action.perform();
		//apply.click();
	}

}
