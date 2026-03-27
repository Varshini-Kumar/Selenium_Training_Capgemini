package saucedemo_practice;


import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LoginPage;

public class Login_Test extends BaseClass {
	@Test
	public void logIn() {
	LoginPage lp= new LoginPage(driver);
	lp.enterUserName("standard_user");
	lp.enterPassword("secret_sauce");
	lp.clickLogin();
	}
}
