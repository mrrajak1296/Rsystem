package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://write-wave-gamma.vercel.app/");
        loginPage = new LoginPage(driver);
       
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() {
    	loginPage.clickLoginButton();
        loginPage.enterUsername("Anil12345");
        loginPage.enterPassword("Anil@12345");
        loginPage.clickLoginButton();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        Assert.assertEquals(driver.getTitle(), "Vite + React");
        driver.quit();
    }
}