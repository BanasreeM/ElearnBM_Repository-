package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME); // ADDED LINE 35 TO 40 HERE 
		loginPOM = new LoginPOM(driver);  // its invoking page object model file
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		//screenShot.captureScreenshot("Login Page");
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
	driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);  // its invoking page object model file
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl); 
	} */
	
	
  /* @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit(); 
	} */
	

	/* ELTC_001 TO verify whether application allows user to get registered as Student */
	@Test(priority=1, enabled=false)
	public void StudentRegister() { 
		
		loginPOM.StudentSignUpLinkClick();
		loginPOM.REnterFirstName("AaA");
		loginPOM.REnterLastName("ZzZ");
		loginPOM.REnterEmail("AAazZZ@gmail.com");
		loginPOM.REnterUserName("AAZZ2");
		loginPOM.RPassword("AAzz@222");
		loginPOM.RconfirmPassword("AAzz@222");
		loginPOM.RPhone("123999997");
		//loginPOM.RLanguage("English");
		loginPOM.RCode("222");
		loginPOM.RskypeID("2222");
		loginPOM.RLinkedInURL("AAazZZ");
		loginPOM.clickRegisterBtn(); 
		//LoginPOM.HomePageLinkClick();
		
		screenShot.captureScreenShot("First");
	}
	
	/*ELTC_002 To verify whether application allows student to get logged in by entering valid credentials*/
	/*ELTC_003 To verify whether application allows user to change the password in Edit Profile page*/
	@Test(priority=2, enabled =true)
	public void validLoginTest() {
		loginPOM.sendUserName("ABA1");
		loginPOM.sendPassword("ABAbba@333");
		loginPOM.clickLoginBtn(); 
		loginPOM.EditProfileLinkClick();
		loginPOM.OldPassword("ABAbba@123");
		loginPOM.NewPassword("ABAbba@333");
		loginPOM.NewconfirmPassword("ABAbba@111");
		loginPOM.SaveSettingBtnClick();
		screenShot.captureScreenShot("First");
	}
		
}

