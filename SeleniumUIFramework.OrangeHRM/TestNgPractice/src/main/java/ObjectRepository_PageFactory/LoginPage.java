package ObjectRepository_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Initialization
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Declaration
    @FindBy(id="user-name")
    WebElement userName;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement loginBtn;

    //Business Logic
    public void loginToApp(String username, String pwd)
    {
        userName.sendKeys(username);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}