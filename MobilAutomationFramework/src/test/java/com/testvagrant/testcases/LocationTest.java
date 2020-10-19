package com.testvagrant.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.LocationPage;
import pages.HomePage;
import pages.FoodDetailsPage;

public class LocationTest extends TestBase {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void setup() throws IOException {
		driver = driverInitialize();
	}

	@Test(priority=1)
	public void SetLocationTest() {
		LocationPage locationPage = new LocationPage(driver);
		locationPage.clickOnSkipButton();
		locationPage.clickOnSetLocationButton();
		locationPage.EnterLocation("Bangalore");
		locationPage.selectLocation();
		locationPage.moveLocation();
		locationPage.clickOnConfirmLocation();

	}
	
	
	
	@Test(priority=2)
	public void GreatOffersTest() {
		
		HomePage homePage = new HomePage(driver);
		homePage.ClickFiler();
		homePage.ClickMoreFilters();
		homePage.ClickGreatOffers();
		homePage.ClickApplyButton();
	
	}
	@Test(priority=3)
	public void SelectFootItemTest() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.openSeeMore();
		homePage.selectfoodItem();
	}
	
	@Test(priority=4)
	public void FoodDropDownTest() {
		FoodDetailsPage fooddetails = new FoodDetailsPage(driver);
		fooddetails.setRating();
		fooddetails.clickDropdown();
		fooddetails.selectGoOut();
		fooddetails.ClickApply();
		
	}
	
	@Test(priority=3)
	public void MoreFiltersTest() {
		
	}

}
