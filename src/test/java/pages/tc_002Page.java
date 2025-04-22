package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    
    WebDriver driver;

    private By fileInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By successMessage = By.id("upload-success");
    private By previewName = By.id("file-name");
    private By previewSize = By.id("file-size");
    private By previewType = By.id("file-type");
    
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewName).isDisplayed() &&
               driver.findElement(previewSize).isDisplayed() &&
               driver.findElement(previewType).isDisplayed();
    }

    public String getFileName() {
        return driver.findElement(previewName).getText();
    }

    public long getFileSize() {
        String sizeText = driver.findElement(previewSize).getText();
        return Long.parseLong(sizeText.replaceAll("[^0-9]", ""));
    }

    public String getFileType() {
        return driver.findElement(previewType).getText();
    }
}