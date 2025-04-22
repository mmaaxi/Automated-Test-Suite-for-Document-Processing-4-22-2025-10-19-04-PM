package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {

    WebDriver driver;

    @FindBy(id = "uploadOption")
    private WebElement uploadOption;

    @FindBy(id = "singleUploadOption")
    private WebElement singleUploadOption;

    @FindBy(id = "multipleUploadOption")
    private WebElement multipleUploadOption;

    @FindBy(id = "singleUploadBox")
    private WebElement singleUploadBox;

    @FindBy(id = "multipleUploadBoxes")
    private WebElement multipleUploadBoxes;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectUploadDocumentsOption() {
        uploadOption.click();
    }

    public boolean isSingleUploadOptionDisplayed() {
        return singleUploadOption.isDisplayed();
    }

    public boolean isMultipleUploadOptionDisplayed() {
        return multipleUploadOption.isDisplayed();
    }

    public void selectSingleFileUpload() {
        singleUploadOption.click();
    }

    public boolean isSingleUploadBoxEnabled() {
        return singleUploadBox.isEnabled();
    }

    public void selectMultipleFileUpload() {
        multipleUploadOption.click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return multipleUploadBoxes.isDisplayed();
    }
}