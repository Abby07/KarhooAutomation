package com.Karhoo_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Karhoo {
	
WebDriver driver;
String tabName;

	public HomePage_Karhoo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[@id='teams']//h5/a[@title='Join the Karhoo team']") public WebElement tabName;
	@FindBy(xpath="//div[@id='teams']//h5/a[@title='Join the Karhoo team']") public WebElement karhooTeam;
	
	public void KarhooTeamTab(){
		
		Actions action = new Actions(driver);
		action.moveToElement(karhooTeam);
		//action.moveToElement(tabName);
		action.click();
		action.perform();
	}
}
	
	
	
	
