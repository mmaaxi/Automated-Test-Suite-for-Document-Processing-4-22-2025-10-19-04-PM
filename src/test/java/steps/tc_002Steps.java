package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page page = new tc_002Page(driver);

    @Given("I have navigated to the file upload page")
    public void i_have_navigated_to_the_file_upload_page() {
        page.openUploadPage();
    }

    @When("I select a file with a valid format (PDF/DOCX) that is within the size limit of 50 MB")
    public void i_select_file() {
        page.uploadFile("path/to/sample.pdf");
    }

    @Then("the file should be uploaded successfully")
    public void the_file_should_be_uploaded_successfully() {
        assertTrue(page.isUploadSuccessful());
    }

    @Then("I should see a preview showing the file name, size, and type")
    public void i_should_see_preview() {
        assertTrue(page.isPreviewDisplayed());
        assertEquals("sample.pdf", page.getFileName());
        assertTrue(page.getFileSize() < 50 * 1024 * 1024);
        assertEquals("PDF", page.getFileType());
    }
}