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
	}

	@BeforeMethod
	public void setUp() throws Exception {
	/*	driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);  // its invoking page object model file
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl); */
	}
	
/*	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit(); 
	} */
	
	/* ELTC_001 TO verify whether application allows user to get registered as Student */
	@Test(priority=1, enabled=true)
	public void StudentRegister() { 
		
		loginPOM.StudentSignUpLinkClick();
		loginPOM.REnterFirstName("A");
		loginPOM.REnterLastName("Z");
		loginPOM.REnterEmail("AZ@gmail.com");
		loginPOM.REnterUserName("AZ1");
		loginPOM.sendPassword("Az@123");
		loginPOM.confirmPassword("Az@123");
		loginPOM.RPhone("123999999");
		//loginPOM.RLanguage("English");
		loginPOM.RCode("123");
		loginPOM.RskypeID("123");
		loginPOM.RLinkedInURL("AAAA");
		loginPOM.clickRegisterBtn(); 
		//LoginPOM.rBtn();
		
		screenShot.captureScreenShot("First");
	
	}
	
	
	
	/*ELTC_002 To verify whether application allows student to get logged in by entering valid credentials*/
	@Test(priority=2)
	public void validLoginTest() {
		loginPOM.sendUserName("ABA1");
		loginPOM.sendPassword("ABAbba@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	
	/*ELTC_003 To verify whether application allows user to change the password in Edit Profile page*/
	
/*	@Test(priority=3)
	public void pwdreset(){
		loginPOM.sendUserName("ABA1");
		loginPOM.sendPassword("ABAbba@1");
		loginPOM.clickLoginBtn(); 
		//loginPOM.changepwd();
		loginPOM.newPwd("ABAbba@123");
		loginPOM.pwdConfirm("ABAbba@123");
		loginPOM.submit();
		loginPOM.pwdSuccessMsg();
		screenShot.captureScreenShot("First");
		
	} */
	
}

