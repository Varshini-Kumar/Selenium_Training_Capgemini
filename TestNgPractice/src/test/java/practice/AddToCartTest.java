package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass {
	WebDriver driver = null;

	@Test(priority = 1)
	public void login() {
		// login with credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// verification
		WebElement swaglabtext = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if (swaglabtext.getText().contains("Swag Labs")) {
			Reporter.log("Login Sucessful", true);
		} else {
			Reporter.log("Login Failed", true);
		}
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void addToCart() {
		// Adding to cart
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
		// Verifying
		driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
		List<WebElement> productsInTheCart = driver.findElements(By.cssSelector("[class='cart_item']"));
		String result = "";
		for (WebElement cartProducts : productsInTheCart) {
			result += cartProducts.getText();
		}
		if (result.contains("Sauce Labs Bike Light") && result.contains("Sauce Labs Backpack")) {
			Reporter.log("Products are verified", true);
		} else {
			Reporter.log("failed to add in cart", true);
		}

	}

	@Test(priority = 3, dependsOnMethods = "login")
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
