package com.training.pom;

import org.openqa.selenium.By;
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
	//*********Login with Valid user ID and PASSWORD *******//
	@FindBy(id="login")
	private WebElement userName; 
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="form-login_submitAuth") // updated exact locator
	private WebElement loginBtn;
  //**************************************Click on Edit Profile after student Login *****************************************
    @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/auth/profile.php']") 
    private WebElement editProfile;
	//******************************ELTC_031 WebElement Create Course ************************************************//     
    //@FindBy(xpath="//a[@href=\'http://elearning.upskills.in/index.php']")
    @FindBy(xpath="//a[contains(text(),'Homepage')]")
    private WebElement home;
    //@FindBy(xpath="//a[@href=\'course_add.php']")
    @FindBy(partialLinkText="Create a course")
     private WebElement cCreateCourseLink;
     //@FindBy(id="update_course_title")
    @FindBy(id="title")
     private WebElement eCourseTitle;
    @FindBy(id="advanced_params")
    private WebElement advance;
    @FindBy(className="filter-option-inner-inner") 
    private WebElement selCategory;
    @FindBy(id="add_course_wanted_code")
    private WebElement eCode;
    //@FindBy(xpath="//label[contains(text(),'Fill with demo content')]")
     @FindBy(xpath="//label[contains(text(),'Fill with demo content')]")
    private WebElement selDemoContent;
    // @FindBy(className=" btn btn-primary")
     @FindBy(id="add_course_submit")
     private WebElement cCreateCourseBtn;  
     @FindBy(className="fa fa-pencil")
     private WebElement cIntro;
     @FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']") //??
     private WebElement eIntro;
    ///////////////////////////////////////////////////////////
     @FindBy(className="select2-selection__rendered") //??
     private WebElement eTeacher;
     @FindBy(id="department_name")
     private WebElement eDepartment;
     @FindBy(id="department_url")
     private WebElement eDepartmentURL;
     @FindBy(id=" update_course_course_language") // dropdown slection
     private WebElement selCourseLanguage;
    // @FindBy(xpath="//span[@id='select2-update_course_course_template-container']") 
    // @FindBy(id="select2-update_course_course_template-container")
    // @FindBy(className="select2-selection__rendered") //??
    
     //private WebElement eCourseTemplate;
     //@FindBy(name="exemplary_content") // CheckBox
       
     @FindBy(id="update_course_qf_group_1")  
     private WebElement selCourseAccess;
     @FindBy(id="update_course_qf_group_2") 
     private WebElement selSubscription;
     @FindBy(id="update_course_qf_group_3")
     private WebElement selUnsubscription;
     @FindBy(id="disk_quota")
     private WebElement eDiskSpace;
     //@FindBy(id="update_course_extra_special_course") // CheckBox  slection
     @FindBy(xpath="//label[contains(text(),'Yes')]")
     private WebElement selSpecialCourse;
     @FindBy(id="extra_tags")  // ??
     private WebElement eTag;
     @FindBy(id="extra_video_url")
     private WebElement eVideoURL;
  
     @FindBy(id="Attach certificate")
     private WebElement cCertificate;
          ///////////////////////////////////////////////////////
     
	//****************************/*ELTC_033  TO verify whether application allows teacher to add assessment as online activity & Attach certificate ********//
    //@FindBy(xpath="//a[@href=\'http://elearning.upskills.in/user_portal.php?nosession=true']") 
     @FindBy(partialLinkText="My courses") 
     private WebElement myCourse;
     @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/courses/SEL1/index.php?id_session=6']") 
     private WebElement sel;
     //@FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/work/work.php?cidReq=SEL1&id_session=6&gidReq=0&gradebook=0&origin=]") 
     //@FindBy(partialLinkText="Assignments") 
     @FindBy(partialLinkText="Assessments")
     private WebElement assesment;
     //@FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/img/icons/32/new_online_evaluation.png']") 
    // @FindBy(partialLinkText="Add online activity")
     @FindBy(xpath="//img[@title= 'Add online activity']")
     private WebElement clickActivity;
    // @FindBy(css="filter-option-inner-inner")
     //@FindBy(partialLinkText="[Choose type of activity to assess]")
    // @FindBy(className="btn dropdown-toggle btn-default") 
     @FindBy(xpath="//div[contains(text(),'[Choose type of activity to assess]')]")
     private WebElement choosetype;
     @FindBy(id="add_link_select_link")
     private WebElement catoAccess;
     @FindBy(xpath="//div[contains(text(),'Default')]")
    // WebElement dayDropDown = driver.findElement(By.xpath("//div[contains(text(),'Default"));
     private WebElement aselAsses;
     
    // @FindBy(id="weight_mask")
     @FindBy(xpath="//input[@id='weight_mask']")
     //@FindBy(className="form-control")
     private WebElement eweight;
     
     @FindBy(id="add_link_submit")
  
     private WebElement cAddToAssesment;
     @FindBy(xpath="//a[@href=\'gradebook_edit_link.php?editlink=18&cidReq=SEL1&id_session=6&gidReq=0']")
     private WebElement cEdit;
    @FindBy(id="visible")
    private WebElement checkvisible ;
    @FindBy(id="edit_link_form_submit")
    private WebElement cEditLink;
    //*************************************** ELTC_032 To verify whether application allows teacher to create a Test**********//
    @FindBy(partialLinkText="My courses") 
    private WebElement myCours;
    //@FindBy(xpath="//a[@href=\'http://elearning.upskills.in/courses/123/index.php?id_session=0'") 
    @FindBy(xpath="//a[contains(text(),'Automation_BM')]")
    private WebElement autoBM;
    @FindBy(xpath ="//img[@id='toolimage_10959']")
    private WebElement test;
    @FindBy(xpath="//a[@href=\'http://elearning.upskills.in/main/exercise/exercise_admin.php?cidReq=123&id_session=0&gidReq=0&gradebook=0&origin=']")
    private WebElement ctest;
    @FindBy(id="exercise_title")
    private WebElement testname;
    @FindBy(id="advanced_params")
    private WebElement advset;
   // @FindBy(className="cke_editable cke_editable_themed cke_contents_ltr cke_show_border")
    @FindBy(xpath="//div[@id='cke_1_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement context;
    @FindBy (id="exerciseType_0")
    private WebElement feedback;
    @FindBy(id="qf_83b3a4")
    private WebElement testTime;
    @FindBy(id="start_time_alt_text")
    private WebElement cdate;
    @FindBy(id="pass_percentage")
    private WebElement epasspercent;
    @FindBy (id="exercise_admin_submitExercise")
    private WebElement cproceed;
    @FindBy(xpath="//section[@id='cm-content']//li[1]//div[1]//a[1]//img[1]") 
  
    private WebElement cmul ;
    @FindBy(id="question_admin_form_questionName")
    private WebElement enterfques;
   // @FindBy(className="cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")  // ??
   //@FindBy(xpath="//div[@id='cke_2_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
    
    //WebElement fElement = driver.findElement(By.xpath("//div[@id='cke_2_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']"));
    
    @FindBy(xpath="//div[@id='cke_2_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
    
    private WebElement answerText;
    //@FindBy(className="cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")
    @FindBy(css = "div[id=cke_2_contents]")
    private WebElement eoptone;
   //@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[1]']")
   //private WebElement eoptone;
    
    @FindBy(xpath="//div[@id='cke_4_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']") //??
    private WebElement eopttwo;
    @FindBy(className="cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")
    private WebElement ansText2;
    
    @FindBy(xpath="//div[@id='cke_6_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']") //??
    private WebElement ansText3;
    @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
    private WebElement eoptthree;
    
    @FindBy(xpath="//div[@id='cke_8_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']") //??
    private WebElement eoptfour;
    @FindBy(xpath="//html")
    private WebElement ansText4 ;
    
    @FindBy(id="submit-question")
    private WebElement csubmit;
    // two times enter 4 questions option
    @FindBy(xpath="//a[href=\'http://elearning.upskills.in/main/exercise/overview.php?cidReq=123&id_session=0&gidReq=0&gradebook=0&origin=&exerciseId=239&preview=1'")
    private WebElement cPreview;
    @FindBy(xpath="//ahref=\'http://elearning.upskills.in/main/exercise/exercise_submit.php?cidReq=123&id_session=0&gidReq=0&gradebook=0&origin=&exerciseId=239&learnpath_id=&learnpath_item_id=&learnpath_item_view_id=&preview=1")
    private WebElement cstartTest;
    @FindBy(id="choice-260-1")
    private WebElement cchoice1;
    @FindBy(className="Next question")
    private WebElement cnextBtn;
    @FindBy(partialLinkText ="End test")
    private WebElement cEndTest;
    
    
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
	 //**************************Password Edit *************************************************************//
    @FindBy(id="profile_password0")
		private WebElement oPassword;   
    @FindBy(id="password1")
 		private WebElement nPassword;   
    @FindBy(id="profile_password2")
 		private WebElement nConfirmPassword;
    
    @FindBy(id="profile_apply_change") // CLICK SAVE Setting button
		private WebElement saveSettingsBtn;	
    /*****************************************/
	public void StudentSignUpLinkClick() {
		this.rsignup.click();		
	}
//*************************************************************************/
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
   public void EditProfileLinkClick() {  //Click on Edit Profile after student Login 
 		this.editProfile.click();	
 	}     
   //**************************Password Edit *************************************************************//
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
    public void SaveSettingBtnClick() {
  	this.saveSettingsBtn.click(); 
  		} 	
//*************************ELTC_031  To verify whether application allows teacher to create a course, add description, objective & Topics **********************************//
   public void cHome() {
	   this.home.click();
   }
    public void clickCreateCourseLink() {
      	this.cCreateCourseLink.click(); 
       }
  
public void enterCourseTitle(String eCourseTitle) {
		this.eCourseTitle.clear();
		this.eCourseTitle.sendKeys(eCourseTitle);
	}
public void cAdvance() {
	this.advance.click();
}
public void selectCategory(){
                this.selCategory.click();
               // this.selCategory.sendKeys("selCategory");
        }
public void enterCode(String eCode){
    this.eCode.clear();
this.eCode.sendKeys(eCode); 
}
public void selectDemoContent(){
    this.selDemoContent.click();
}
public void clickCreateCourseBtn() {
	this.cCreateCourseBtn.click();	
}
public void clickIntro() {
	this.cIntro.click();
}
public void enterIntro(String eIntro) {
	this.eIntro.sendKeys(eIntro);
}

//////////////////////////////////////////////create course loginAdmin//////
public void enterTeacher(String eTeacher){
                this.eTeacher.click();
		this.eTeacher.sendKeys(eTeacher); //??
        }       
 public void enterDepartment(String eDepartment){
                this.eDepartment.clear();
		this.eDepartment.sendKeys(eDepartment);
        }
 public void enterDepartmentURL(String eDepartmentURL){
                this.eDepartmentURL.clear();
		this.eDepartmentURL.sendKeys(eDepartmentURL);
        }
public void selectCourseLanguage(){
                this.selCourseLanguage.sendKeys();
        }
/*public void enterCourseTemplate(String eCourseTemplate){
	            this.eCourseTemplate.click();
                this.eCourseTemplate.sendKeys("eCourseTemplate"); //??
        } */

public void selectCourseAccess(){
                this.selCourseAccess.click();
        }
public void selectSubscription(){
                this.selSubscription.click();
        }
public void selectUnsubscription(){
                this.selUnsubscription.click();
        }
public void enterDiskSpace(String eDiskSpace){
                this.eDiskSpace.clear();
		this.eDiskSpace.sendKeys(eDiskSpace);
}
public void selectSpecialCourse(){
                this.selSpecialCourse.click();
        }
public void enterTag(String eTag){
                this.eTag.sendKeys(eTag); //??
        }
public void enterVideoURL(String eVideoURL){
                this.eVideoURL.clear();
		this.eVideoURL.sendKeys(eVideoURL);
}

//************************************ELTC_033  TO verify whether application allows teacher to add assessment as online activity & Attach certificate ****************//    
public void clickMyCoursesLink() {
	this.myCourse.click();
	
} 
public void clickSeleniumLink() {
	this.sel.click();
	
}
public void clickAssesmenticon() {
	this.assesment.click();
}
public void clickOnlineActivity(){ 
	this.clickActivity.click();
}
public void chooseTypeActivity() {
	this.choosetype.click();
}

public void chooseActivityAccess() {
	this.catoAccess.click();
}
public void cselAsses() {
	this.aselAsses.click();

}
public void weight(String eweight) {
	this.eweight.clear();
	this.eweight.sendKeys("eweight");
}
public void clickAddToAssesment() {
	this.cAddToAssesment.click();
}
public void clickEdit() {
	this.cEdit.click();
}
public void checkBoxVisible() {
	this.checkvisible.click();
}
public void clickEditLink() {
	this.cEditLink.click();
}
 public void clickAttachCertificate() {
	 this.cCertificate.click();
 }
 /* ELTC_032 To verify whether application allows teacher to create a Test*/
 
 public void clickmyCourse() {
	 this.myCours.click();
 }
 public void clickAutoBM() {
	 this.autoBM.click();
 }
 public void clicktest() {
	 this.test.click();
 }
 public void cltest() {
	 this.ctest.click();
 } 
 public void etestname(String testname) {
	 this.testname.sendKeys("testname");
 }
 public void clickAdvset() {
	 this.advset.click();
 }
 public void eContext(String context) {
	 this.context.sendKeys("context");
 }
 public void clickFeedback() {
	 this.feedback.click();
 }
 public void eTestTime() {
	 this.testTime.sendKeys("testTime");
 }
 public void clickDate() {
	 this.cdate.click();
 }
 public void ePassPer(String epasspercentage) {
	 this.epasspercent.sendKeys("epasspercentage");
 }
 public void clickProceed() {
	 this.cproceed.click();
 }
 public void clickMul() {
	 this.cmul.click();
 }
 public void eFques(String enterfques) {
	 this.enterfques.sendKeys("enterFques");
 }
 public void eOptone(String eoptone) {
  //String fElememt = null;
//driver.switchTo().frame(fElememt);
	 driver.switchTo().frame(answerText);
	 this.eoptone.click();
    // this.eoptone.sendKeys("eoptone");
	// driver.switchTo().defaultContent();
  //this.eoptone.click();
  //this.eoptone.sendKeys("eoptone");
 }
 public void eOpttwo(String eopttwo) {
	 this.eopttwo.sendKeys("eopttwo");
 }
 public void eOptthree(String eoptthree) {
	 this.eoptthree.sendKeys("eoptthree");
 }
 public void eOptfour(String eoptfour) {
	 this.eoptfour.sendKeys("eoptfour");
 }
 public void clicksubmit() {
	 this.csubmit.click();
 }
 public void clickPreview() {
	 this.cPreview.click();
 }
 public void clickStartTest() {
	 this.cstartTest.click();
 }
 public void clickChoice1() {
	 this.cchoice1.click();
 }
 public void clickNextBtn() {
	 this.cnextBtn.click();
 }
 public void clickEndTest() {
	 this.cEndTest.click();
 }
 
 
 
}



