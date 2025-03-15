package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://write-wave-gamma.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
    	loginPage.clickLoginButton();
        loginPage.enterUsername("Anil12345");
        loginPage.enterPassword("Anil@12345");
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getTitle(), "Vite + React");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}