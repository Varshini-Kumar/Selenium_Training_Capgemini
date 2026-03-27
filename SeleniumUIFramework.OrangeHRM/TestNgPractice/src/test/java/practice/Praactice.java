package practice;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Praactice {

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

		// Validate product page
		WebElement Product_verify = driver.findElement(By.xpath("//span[@class = 'title']"));
		Assert.assertEquals(Product_verify.getText(), "Products");
	}

	@Test(priority = 3, dependsOnMethods = "Login")
	public void AddToCart() {
		// Add products to cart
		driver.findElement(By.xpath("//div[.= 'Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.= 'Sauce Labs Bike Light']/../../..//button")).click();
		// View Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		// Verify cart
		List<WebElement> Cart_item = driver.findElements(By.className("cart_item"));
		String res = "";
		for (WebElement str : Cart_item) {
			res += str.getText();
		}
		if (res.contains("Sauce Labs Backpack")) {
			System.out.println("True");
		}
		Assert.assertTrue(res.contains("Sauce Labs Backpack"));
		Assert.assertTrue(res.contains("Sauce Labs Bike Light"));

	}

	@Test(priority = 5, dependsOnMethods = "AddToCart")
	public void CheckOut() {
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Mahi");
		driver.findElement(By.id("last-name")).sendKeys("Niga");
		driver.findElement(By.id("postal-code")).sendKeys("631051");

		driver.findElement(By.name("continue")).click();
        //Verify price
		List<WebElement> price = driver.findElements(By.className("inventory_item_price"));
		String res = "";
		double total = 0;
		for (WebElement str : price) {
			String cleaned = str.getText().replace("$", "");
			double num = Double.parseDouble(cleaned);
			total = total + num;		
		}

		total += 3.20;
		//Validate
		Assert.assertEquals(total, 43.18);

		// Finsh -> logout
		driver.findElement(By.id("finish")).click();
	}
}
