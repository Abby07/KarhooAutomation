package com.Karhoo_Test;

import org.testng.annotations.Test;

public class TestClass extends BrowserClass_Karhoo{
	
	@Test
	public void testClass() throws InterruptedException{
		
		HomePage_Karhoo homePage = new HomePage_Karhoo(driver);
		homePage.KarhooTeamTab();
		
		TeamPage teamPage = new TeamPage(driver);
		teamPage.applyBtn();
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.displayMessage();

}
}
