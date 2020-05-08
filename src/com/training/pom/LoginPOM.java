package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	   
	
	//********************************SignUp Student***********************************************************//
	
	
	 @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/auth/inscription.php']") 
     private WebElement rsignup;
    
	@FindBy(id="registration_firstname")
	private WebElement rEnterFirstName;
	
	@FindBy(id="registration_lastname")
	private WebElement rEnterLastName;
	
	@FindBy(id="registration_email")
	private WebElement rEnteremail;
	
	@FindBy(id="username")
	private WebElement rEnteruserName; 
	
	@FindBy(id="pass1")
	private WebElement rPassword;
	
	@FindBy(id="pass2")
	private WebElement rConfirmPassword;
	
	@FindBy(id="registration_phone")
	private WebElement rPhone;
	
	@FindBy(id="registration_official_code")
	private WebElement rCode;
	
	@FindBy(id="extra_skype")
	private WebElement rSkypeId;
	  
	@FindBy(id="extra_linkedin_url")
	private WebElement rLinkedInUrl;

	@FindBy(id="registration_submit") 
	private WebElement rBtn;

	//@FindBy(id="registration_submit")  /for signup button
	//private WebElement rBtn;
	
	public void StudentSignUpLinkClick() {
		this.rsignup.click();
		
	}

	public void REnterFirstName(String rEnterFirstName) {
		this.rEnterFirstName.clear();
		this.rEnterFirstName.sendKeys(rEnterFirstName);
		
	}

	public void REnterLastName(String rEnterLastName) {
		this.rEnterLastName.clear();
		this.rEnterLastName.sendKeys(rEnterLastName);
	}

	public void REnterEmail(String rEnteremail) {
		this.rEnteremail.clear();
		this.rEnteremail.sendKeys(rEnteremail);
	}

	public void REnterUserName(String rEnteruserName) {
		this.rEnteruserName.clear();
		this.rEnteruserName.sendKeys(rEnteruserName); // we need to enter test data here ?
		
	}
	public void RPassword(String rPassword) {
		this.rPassword.clear();
		this.rPassword.sendKeys(rPassword);
	}
	public void RconfirmPassword(String rConfirmPassword) {
		this.rConfirmPassword.clear();
		this.rConfirmPassword.sendKeys(rConfirmPassword);
	}

	public void RPhone(String rPhone) {
		this.rPhone.clear();
		this.rPhone.sendKeys(rPhone);
		
	}

	public void RCode(String rCode) {
	this.rCode.clear();
	this.rCode.sendKeys(rCode);
	}
	
	public void RskypeID(String rSkypeId) {
		this.rSkypeId.clear();
		this.rSkypeId.sendKeys(rSkypeId);

	}

	public void RLinkedInURL(String rLinkedInUrl) {
		this.rLinkedInUrl.clear();
		this.rLinkedInUrl.sendKeys(rLinkedInUrl);
		
	}

	public void clickRegisterBtn() {
		this.rBtn.click();
		
	}
	
	//*********Login with Valid user ID and PASSWORD *******//
	
		@FindBy(id="login")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="form-login_submitAuth") // updated exact locator
		private WebElement loginBtn;
		
		  public void sendUserName(String userName) {
				this.userName.clear();
				this.userName.sendKeys(userName);
			}

			public void sendPassword(String password) {
				this.password.clear(); 
				this.password.sendKeys(password); 
			}

			public void clickLoginBtn() {
				this.loginBtn.click(); 
			} 
	
	//**************************************Click on Edit Profile after student Login *****************************************
     @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/auth/profile.php']") 
    private WebElement editProfile;
    
     public void EditProfileLinkClick() {
 		this.editProfile.click();
 		
 	} 
   /* @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/auth/profile.php']") //for homepage link
     private WebElement editProfil; */
     
   //****** Password Edit ***//
     
     @FindBy(id="profile_password0")
		private WebElement oPassword;
     
     @FindBy(id="password1")
  		private WebElement nPassword;
     
     @FindBy(id="profile_password2")
  		private WebElement nConfirmPassword;
     
     
     public void OldPassword(String oPassword) {
  		this.oPassword.clear();
  		this.oPassword.sendKeys(oPassword);
     }
  		
     public void NewPassword(String nPassword) {
 		this.nPassword.clear();
 		this.nPassword.sendKeys(nPassword);
 	}
 	public void NewconfirmPassword(String nConfirmPassword) {
 		this.nConfirmPassword.clear();
 		this.nConfirmPassword.sendKeys(nConfirmPassword);
     
 	}
  
     @FindBy(id="profile_apply_change") // CLICK SAVE Setting button
		private WebElement saveSettingsBtn;
     
    public void SaveSettingBtnClick() {
  	this.saveSettingsBtn.click(); 
  		} 	



	
}
