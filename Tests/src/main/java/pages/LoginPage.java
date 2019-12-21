package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By login_id = By.id("email");
    private By password_id = By.id("pass");
    private By login_button = By.id("loginbutton");

    public void setLogin(String login) {
        driver.findElement(login_id).sendKeys(login);
    }
    public void setPassword(String password) {
        driver.findElement(password_id).sendKeys(password);
    }
    public void clickButton() {
        driver.findElement(login_button).click();
    }
}

