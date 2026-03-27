package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsSortProducts {
	WebDriver driver;

	@Test(priority = -1)
	public void LaunchingBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 1, dependsOnMethods = "LaunchingBrowser")
	public void Login() {
		// Navigate to Swag Labs
		driver.get("https://www.saucedemo.com/");
		// Login with valid credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	@Test(priority = 5, dependsOnMethods = "Login")
	public void filter() {
		// Filter Price low - high and add to cart
		driver.findElement(By.xpath("//select[@class = 'product_sort_container']/option[. ='Price (low to high)']"))
				.click();
		driver.findElement(By.xpath("//button[.= 'Add to cart']")).click();

		// Add to Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		// Verify Product in Cart
		String res = "Sauce Labs Onesie";
		WebElement cart = driver.findElement(By.className("inventory_item_name"));
		Assert.assertEquals(cart.getText(), res);
	}

	@Test(priority = 7, dependsOnMethods = "filter")
	public void checkout() {
		// checkout
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Varshini");
		driver.findElement(By.id("last-name")).sendKeys("K");
		driver.findElement(By.id("postal-code")).sendKeys("631052");

		driver.findElement(By.name("continue")).click();
		// Verify order summary and Completing Order
		WebElement price = driver.findElement(By.className("inventory_item_price"));
		String res = "";
		double total = 0;
		String cleaned = price.getText().replace("$", "");
		double num = Double.parseDouble(cleaned);
		total = total + num;

		total += 0.64;
		// Validate the price
		Assert.assertEquals(total, 8.63);

		// Logout
		driver.findElement(By.id("finish")).click();

		driver.close();
	}
}