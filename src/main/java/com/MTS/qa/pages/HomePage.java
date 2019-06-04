package com.MTS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MTS.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//*[contains(@class,'top-phone')]")
	WebElement topPhone;

	@FindBy(xpath = "//*[contains(@class,'navbar-brand')]")
	WebElement mtslogo;

	@FindBy(xpath = "//*[contains(@class,'footer')]")
	WebElement footer;

	@FindBy(xpath = "/html/body/div[2]/nav/div/ul/li[1]/a")
	WebElement howitworks;

	@FindBy(xpath = "/html/body/div[2]/nav/div/ul/li[2]/a")
	WebElement orderandbookonline;

	@FindBy(xpath = "/html/body/div[2]/nav/div/ul/li[3]/a")
	WebElement puncturerepair;

	@FindBy(xpath = "/html/body/div[2]/nav/div/ul/li[4]/a")
	WebElement locationweservices;

	@FindBy(xpath = "/html/body/div[2]/nav/div/ul/li[5]/a")
	WebElement freequote;

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[1]")
	WebElement mobiletyresection;

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[2]")
	WebElement faqsection;

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[3]")
	WebElement popularbrandsection;

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[4]")
	WebElement contactussection;

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[5]/ul[1]")
	WebElement socialbutton;
	
	@FindBy(xpath = "//*[contains(@class,'fb')]")
	WebElement fbicon;
	
	@FindBy(xpath = "//*[contains(@class,'tw')]")
	WebElement gpicon;
	
	@FindBy(xpath = "//*[contains(@class,'yt')]")
	WebElement yticon;
	
	@FindBy(xpath = "//*[contains(@class,'gp')]")
	WebElement twicon;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validatePhoneDetail() {
		return topPhone.isDisplayed();
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public boolean validateHeader() {
		mtslogo.isDisplayed();
		orderandbookonline.isDisplayed();
		puncturerepair.isDisplayed();
		locationweservices.isDisplayed();
		return freequote.isDisplayed();

	}

	public boolean validateFooter() {
		mobiletyresection.isDisplayed();
		faqsection.isDisplayed();
		popularbrandsection.isDisplayed();
		contactussection.isDisplayed();
		 fbicon.isDisplayed();
		 gpicon.isDisplayed();
		 yticon.isDisplayed();
		 return twicon.isDisplayed();
	}

}
