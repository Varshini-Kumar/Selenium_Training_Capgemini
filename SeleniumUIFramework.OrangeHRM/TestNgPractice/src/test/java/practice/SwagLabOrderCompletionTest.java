package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLabOrderCompletionTest {
	WebDriver driver = null;

	@Test(priority = 1)
	public void login() {
		// launching the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// login with valid credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void addProducts() {
		// verifying the products page
		WebElement products = driver.findElement(By.xpath("//span[.='Products']"));
		boolean productVerification = products.isDisplayed();
		// using HardAssert for validation of products page
		Assert.assertEquals(productVerification, true);
		// adding products to cart
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
		// Verifying the products in the cart
		driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
		List<WebElement> productsInTheCart = driver.findElements(By.cssSelector("[class='cart_item']"));
		String result = "";
		for (WebElement cartProducts : productsInTheCart) {
			result += cartProducts.getText();
		}
		// using soft assert for verifying the products in the cart
		SoftAssert sa = new SoftAssert();
		boolean verifyingCart = result.contains("Sauce Labs Bike Light") && result.contains("Sauce Labs Backpack");
		Assert.assertEquals(verifyingCart, true);
		if (result.contains("Sauce Labs Bike Light") && result.contains("Sauce Labs Backpack")) {
			Reporter.log("Products are verified", true);
		} else {
			Reporter.log("failed to add in cart", true);
		}
		sa.assertAll();
	}

	@Test(priority = 3, dependsOnMethods = "addProducts")
	public void orderCompletion() throws InterruptedException {
		// perform checkout
		driver.findElement(By.xpath("//button[.='Checkout']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Varsh");
		driver.findElement(By.name("lastName")).sendKeys("K");
		driver.findElement(By.name("postalCode")).sendKeys("631502");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		// price validation
		String expectedtotalAmt = "43.18";
		WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		String actualAmt = total.getText();
		boolean verifyingPrice = actualAmt.contains(expectedtotalAmt);
		// using hard assert for verification of total price
		Assert.assertEquals(verifyingPrice, true);
		// click on the finish button
		driver.findElement(By.xpath("//button[.='Finish']")).click();

	}

	@Test(priority = 4, dependsOnMethods = "orderCompletion")
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		Thread.sleep(2000);
		// logging out
		driver.findElement(By.xpath("//a[.='Logout']")).click();

	}

}
