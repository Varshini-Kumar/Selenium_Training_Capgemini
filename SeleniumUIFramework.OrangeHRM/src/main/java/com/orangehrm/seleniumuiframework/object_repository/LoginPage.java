package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    //username TextField
	@FindBy(name = "username")
	private WebElement userName;
	
    
	//Password TextField
	@FindBy(name = "password")
	private WebElement passWord;
    
	//Login Button
	@FindBy(css = "[type='submit']")
	private WebElement loginbtn;
    
	//Forgot Password
	@FindBy(xpath = "//p[.='Forgot your password? ']")
	private WebElement forgotPwd;
    
	//Linkedin link
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedinLink;
    
	//Facebook Link
	@FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebookLink;
    
	//Twitter Link 
	@FindBy(xpath = "//a[@href='https://twitter.com/orangehrm?lang=en']")
	private WebElement twitterLink;
    
	//Youtube Link
	@FindBy(xpath = "//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtubeLink;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String validUsername) {
		getUserName().sendKeys(validUsername);
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String validPassword) {
		getPassWord().sendKeys(validPassword);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void clickLoginbtn() {
		getLoginbtn().click();
	}

	public WebElement getForgotPwd() {
		return forgotPwd;
	}

	public void clickForgotPwd() {
		getForgotPwd().click();
	}

	public WebElement getLinkedinLink() {
		return linkedinLink;
	}

	public void clickLinkedinLink() {
		getLinkedinLink().click();
	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}

	public void clickFacebookLink() {
		getFacebookLink().click();
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public void clickTwitterLink() {
		getTwitterLink().click();
	}

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	public void clickYoutubeLink() {
		getYoutubeLink().click();
	}

	// Business logic
	// Login
	public void login(String validUsername, String validPassword) {
		setUserName(validUsername);
		setPassWord(validPassword);
		clickLoginbtn();
	}

}
