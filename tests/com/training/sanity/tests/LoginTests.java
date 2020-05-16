package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
	@Test(priority=10, enabled=false)
	public void studentRegister() { 
		
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

	@Test(priority=1, enabled =true)
	public void validLoginTest() {
		loginPOM.sendUserName("admin"); // teacher uname:TechR  , STIDENT: ABA1
		loginPOM.sendPassword("admin@123"); //teacher Pass: TechR@123  , STUDENT:ABAbba@333
		loginPOM.clickLoginBtn(); 
	
		/*ELTC_003 To verify whether application allows user to change the password in Edit Profile page*/
	//	loginPOM.EditProfileLinkClick();
	//	loginPOM.OldPassword("ABAbba@123");
	//	loginPOM.NewPassword("ABAbba@333");
	//	loginPOM.NewconfirmPassword("ABAbba@111");
	//	loginPOM.SaveSettingBtnClick();
	screenShot.captureScreenShot("First");
	}
		
	/* ELTC_031 To verify whether application allows teacher to create a course, add description, objective & Topics */
	@Test(priority=2, enabled =false) 
	public void techCreateCourse() throws AWTException, InterruptedException {
		loginPOM.cHome();
     loginPOM.clickCreateCourseLink();
     loginPOM.enterCourseTitle("MusicMusic4");
     loginPOM.cAdvance();
   loginPOM.selectCategory();
   Robot robo= new Robot();
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_ENTER);
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_ENTER);
   robo.keyRelease(KeyEvent.VK_DOWN);
   robo.keyRelease(KeyEvent.VK_ENTER);
   Thread.sleep(1000); 
   loginPOM.enterCode("4567");
   loginPOM.selectDemoContent();
   loginPOM.clickCreateCourseBtn();
   Thread.sleep(1000); 
   loginPOM.clickIntro();
  loginPOM.enterIntro("Music");
   
   /*loginPOM.enterTeacher("Tech"); //??
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_ENTER);
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_ENTER);
   robo.keyRelease(KeyEvent.VK_DOWN);
   robo.keyRelease(KeyEvent.VK_ENTER);
     loginPOM.enterDepartment("AA");
     loginPOM.enterDepartmentURL("AA");
    // loginPOM.selectCourseLanguage();
      //??
      robo.keyPress(KeyEvent.VK_ENTER);
   robo.keyPress(KeyEvent.VK_DOWN);
   robo.keyPress(KeyEvent.VK_ENTER);
 // loginPOM.enterCourseTemplate("sel");
   robo.keyRelease(KeyEvent.VK_DOWN);
   robo.keyRelease(KeyEvent.VK_ENTER);
   Thread.sleep(5000);
   
     //loginPOM.selectCourseAccess();
     //loginPOM.selectSubscription();
    // loginPOM.selectUnsubscription();
     loginPOM.enterDiskSpace("90");
     loginPOM.selectSpecialCourse();
    // loginPOM.enterTag("AAA"); //??
     loginPOM.enterVideoURL("A");
       */
	
}
	/*ELTC_033 TO verify whether application allows teacher to add assessment as online activity & Attach certificate */
	@Test(priority=3, enabled =false) 
	public void techReviewAssignment() throws AWTException, InterruptedException {
     loginPOM.clickMyCoursesLink();
     loginPOM.clickSeleniumLink();
     loginPOM.clickAssesmenticon();
     loginPOM.clickOnlineActivity(); 
      // enter and select from dropdown
     loginPOM.chooseTypeActivity(); //
     Robot robo= new Robot();
     robo.keyPress(KeyEvent.VK_DOWN);
     robo.keyPress(KeyEvent.VK_ENTER);
     robo.keyPress(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     robo.keyRelease(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_ENTER);
     /*loginPOM.chooseActivityAccess();// enter and select from dropdown
     robo.keyPress(KeyEvent.VK_DOWN);
     
     robo.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(1000);
     robo.keyRelease(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_ENTER); */
     
  /*loginPOM.cselAsses();     
     robo.keyPress(KeyEvent.VK_DOWN);
      robo.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(1000);
     robo.keyRelease(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_DOWN); */
      
  //Select sel= new Select (dayDropDown);
   //  sel.selectByValue("1");
    
   //div[contains(text(),'Default')]
     loginPOM.weight("50");
     loginPOM.clickAddToAssesment();
   //  robo.keyPress(KeyEvent.VK_DOWN);
    // robo.keyPress(KeyEvent.VK_ENTER);
   //  Thread.sleep(1000);
  //   robo.keyRelease(KeyEvent.VK_DOWN);
  //   robo.keyRelease(KeyEvent.VK_ENTER);
    
    loginPOM.clickEdit();
     loginPOM.checkBoxVisible();
     loginPOM.clickEditLink();
     loginPOM.clickAttachCertificate(); 
}


/* ELTC_032 To verify whether application allows teacher to create a Test*/
	@Test(priority=4, enabled =true) 
	public void techCreateTest() {
		loginPOM.clickmyCourse();
		loginPOM.clickAutoBM();
		loginPOM.clicktest();
		loginPOM.cltest();
		loginPOM.etestname("lalala");
		loginPOM.clickAdvset();
	//	loginPOM.eContext("testing");
	//	loginPOM.clickFeedback();
	//	loginPOM.eTestTime();
	//	loginPOM.clickDate();
		//loginPOM.ePassPer("");
		loginPOM.clickProceed();
		loginPOM.clickMul();
		loginPOM.eFques("try");
		loginPOM.eOptone("a");
		loginPOM.eOpttwo("b");
		loginPOM.eOptthree("c");
		loginPOM.eOptfour("d");
	    loginPOM.clicksubmit();
		loginPOM.clickPreview();
		loginPOM.clickStartTest();
		loginPOM.clickChoice1();
		
		loginPOM.clickEndTest();
	}
	}
	