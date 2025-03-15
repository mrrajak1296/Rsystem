package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import pages.DocumentPage;

public class DocumentSteps {
    WebDriver driver;
    LoginPage loginPage;
    DocumentPage documentPage;

    @Given("User is logged in and on the document page")
    public void userIsLoggedInAndOnDocumentPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://write-wave-gamma.vercel.app/");
        loginPage = new LoginPage(driver);
        documentPage = new DocumentPage(driver);

        loginPage.enterUsername("Anil12345");
        loginPage.enterPassword("Anil@12345");
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getTitle(), "Vite + React");
    }

    @When("User creates and saves a new document")
    public void userCreatesAndSavesDocument() {
        documentPage.clickNewDocument();
        documentPage.enterDocumentTitle("Test Document");
        documentPage.enterDocumentContent("C:\\Users\\PC\\Desktop\\abc\\anil.txt");
        documentPage.clickSaveButton();
    }

    @Then("The document should be saved successfully")
    public void documentShouldBeSavedSuccessfully() {
      
       // driver.quit();
    }
}