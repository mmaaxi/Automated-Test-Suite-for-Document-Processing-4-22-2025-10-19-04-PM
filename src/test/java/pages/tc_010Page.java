package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    private WebDriver driver;
    private By uploadPageLocator = By.id("uploadPage");
    private By uploadButtonLocator = By.id("uploadButton");
    private By generateSlipButtonLocator = By.id("generateSlip");
    private By processingCompleteLocator = By.id("processingComplete");
    private By slipGeneratedLocator = By.id("slipGenerated");
    private By dataSavedLocator = By.id("dataSaved");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.findElement(uploadPageLocator).click();
    }

    public void uploadDocuments() {
        driver.findElement(uploadButtonLocator).click();
    }

    public boolean isProcessingComplete() {
        return driver.findElement(processingCompleteLocator).isDisplayed();
    }

    public void clickGenerateExitSlipButton() {
        driver.findElement(generateSlipButtonLocator).click();
    }

    public boolean isExitSlipGenerated() {
        return driver.findElement(slipGeneratedLocator).isDisplayed();
    }

    public boolean isDataSavedInHistory() {
        return driver.findElement(dataSavedLocator).isDisplayed();
    }
}