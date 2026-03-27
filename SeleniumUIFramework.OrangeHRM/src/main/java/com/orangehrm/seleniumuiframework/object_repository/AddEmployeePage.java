package com.orangehrm.seleniumuiframework.object_repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeePage {
	WebDriver driver;
	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(name = "firstName")
private WebElement firstName;

@FindBy(name = "middleName")
private WebElement middleName;

@FindBy(name="lastName")
private WebElement lastName;

@FindBy(xpath="//label[.='Employee Id']/../..//input")
private WebElement employeeId;

@FindBy(xpath="//p[text()='Create Login Details']/../div//span")
private WebElement createLoginDetails;

@FindBy(xpath="//label[.='Username']/../..//input")
private WebElement userName;

@FindBy(xpath="//label[.='Password']/../..//input")
private  WebElement password;

@FindBy(xpath="//label[.='Confirm Password']/../..//input")
private WebElement confirmPassword;

@FindBy(xpath ="//button[.=' Save ']")
private WebElement saveButon;

public WebElement getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	getFirstName().sendKeys(firstName);
}

public WebElement getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
 getMiddleName().sendKeys(middleName);
}

public WebElement getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	getLastName().sendKeys(lastName);
}

public WebElement getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(String employeeId) {
	getEmployeeId().sendKeys(employeeId);
}

public WebElement getCreateLoginDetails() {
	return createLoginDetails;
}

public void clickCreateLoginDetails() {
	getCreateLoginDetails().click();
}

public WebElement getUserName() {
	return userName;
}

public void setUserName(String userName) {
	getUserName().sendKeys(userName);
}

public WebElement getPassword() {
	return password;
}

public void setPassword(String password) {
	getPassword().sendKeys(password);
}

public WebElement getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	getConfirmPassword().sendKeys(confirmPassword); 
}

public WebElement getSaveButon() {
	return saveButon;
}

public void clickSaveButon() {
getSaveButon().click();
}
 //business logic to add employee
//Business Logic - Add employee
	public void addEmp(String fname, String mname, String lname, String eid) {
		setFirstName(fname);
		setMiddleName(mname);
		setLastName(lname);
		setEmployeeId(eid);
		clickCreateLoginDetails();
	}
	
	//Business Logic - Create cresitionals
	public void createCreditionals( String uname, String pwd) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(userName));
		setUserName(uname);
		setPassword(pwd);
		setConfirmPassword(pwd);
		clickSaveButon();
	}


}
