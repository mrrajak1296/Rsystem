package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentPage {
    WebDriver driver;

    By newDocumentButton = By.cssSelector("[class=\"create-btn\"]");
    By documentTitleField = By.cssSelector("[placeholder=\"Title\"]");
    By documentContentField = By.cssSelector("[type=\"file\"]");
    By saveButton = By.cssSelector("[style=\"margin-top: 20px;\"]");

    public DocumentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNewDocument() {
        driver.findElement(newDocumentButton).click();
    }

    public void enterDocumentTitle(String title) {
        driver.findElement(documentTitleField).sendKeys(title);
    }

    public void enterDocumentContent(String content) {
        driver.findElement(documentContentField).sendKeys(content);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

 
}