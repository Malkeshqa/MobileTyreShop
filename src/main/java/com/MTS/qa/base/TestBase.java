package com.MTS.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MTS.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

// Create Constructor
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"E:\\Test\\MobileTyreShop\\src\\main\\java\\com\\MTS\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Test\\MobileTyreShop\\browserdriver\\chromedriver74\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Test\\MobileTyreShop\\browserdriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"E:\\Selenium\\MiraSafety\\browserdriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
