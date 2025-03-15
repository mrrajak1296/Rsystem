package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DocumentPage;
import org.testng.Assert;

public class DocumentTest {
    WebDriver driver;
    LoginPage loginPage;
    DocumentPage documentPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://write-wave-gamma.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        documentPage = new DocumentPage(driver);
    }

    @Test
    public void testCreateAndSaveDocument() {
    	loginPage.clickNewDocument();
        loginPage.enterUsername("Anil12345");
        loginPage.enterPassword("Anil@12345");
        loginPage.clickLoginButton();
        
        Assert.assertEquals(driver.getTitle(), "Vite + React");
        
        documentPage.clickNewDocument();
        documentPage.enterDocumentTitle("Test Document");
        documentPage.enterDocumentContent("C:\\Users\\PC\\Desktop\\abc\\anil.txt");
        documentPage.clickSaveButton();
        
       
    }

    @AfterClass
    public void teardown() {
       // driver.quit();
    }
}