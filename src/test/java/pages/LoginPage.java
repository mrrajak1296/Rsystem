package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    
    By regi = By.cssSelector("[href=\"/login\"]");

    By usernameField = By.cssSelector("[placeholder=\"username\"]");
    By passwordField = By.cssSelector("[placeholder=\"password\"]");
    By loginButton = By.cssSelector("[class=\"login-btn\"]");
  

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickNewDocument() {
        driver.findElement(regi).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


}
