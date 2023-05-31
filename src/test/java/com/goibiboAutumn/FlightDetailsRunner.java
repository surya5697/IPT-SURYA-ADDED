package com.goibiboAutumn;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.baseClass.BaseClass;
import com.goibiboAutumnPom.GoibiboPom;


public class FlightDetailsRunner extends BaseClass {

	public static GoibiboPom gp;


	@BeforeClass
	public void browserLaunching(){
		browserLaunch("chrome");
		gp = new GoibiboPom(driver);
	}
	
	
	@BeforeMethod
	public void urlLaunch() {
		getUrl("https://www.goibibo.com/flights/air-MAA-IXM-20230604--4-0-0-E-D?");
		implicitlyWait(30);
		String actual = getTitle();		
		String expected = "Challenge Validation";
	    Assert.assertEquals(actual, expected);
	}
	
	@Test()
	public void clickTiming() { 
		
	jsScrollIntoView(gp.getBeforeSixAm());
	isDisplayed(gp.getBeforeSixAm());
	isSelected(gp.getBeforeSixAm());
	jsExecuteClick(gp.getBeforeSixAm());
	
	jsScrollIntoView(gp.getSixAmToTwelvePm());
	isDisplayed(gp.getSixAmToTwelvePm());
	isSelected(gp.getSixAmToTwelvePm());
	jsExecuteClick(gp.getSixAmToTwelvePm());
	
	jsScrollIntoView(gp.getTwelvePmTosixPm());
	isDisplayed(gp.getTwelvePmTosixPm());
	isSelected(gp.getTwelvePmTosixPm());
	jsExecuteClick(gp.getTwelvePmTosixPm());
	
	jsScrollIntoView(gp.getAfterSixPm());
	isDisplayed(gp.getAfterSixPm());
	isSelected(gp.getAfterSixPm());
	jsExecuteClick(gp.getAfterSixPm());
	
	
	jsScrollIntoView(gp.getViewFares());
	isDisplayed(gp.getViewFares());
	isSelected(gp.getViewFares());
	jsExecuteClick(gp.getViewFares());
	
	}
	
	@AfterMethod
	public void familyFare() {
		
		jsScrollIntoView(gp.getFamilyFare());
		isDisplayed(gp.getFamilyFare());
		isSelected(gp.getFamilyFare());
		jsExecuteClick(gp.getFamilyFare());
		
	}
	
	@AfterClass
	public void tearDown() {
		quit();
	}
	
	

	
	
	
	
	
}










