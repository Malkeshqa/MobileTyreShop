package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MTS.qa.base.TestBase;
import com.MTS.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}

	@Test(priority = 1)
	public void validateTitleTest() {
		Assert.assertEquals(homepage.validateTitle(), "Mobile Tyre Service - New Car Tyres Fitting & Repair",
				"Title not matched");
	}

	@Test(priority = 2)
	public void homePageHeaderTest() {
		Assert.assertTrue(homepage.validatePhoneDetail());
		Assert.assertTrue(homepage.validateHeader());
	}

	@Test(priority = 3)
	public void homePageFooterTest() {
		Assert.assertTrue(homepage.validateFooter());
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
