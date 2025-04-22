package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    private tc_010Page page;

    public tc_010Steps() {
        page = new tc_010Page();
    }

    @Given("^I have completed the upload and processing of documents$")
    public void i_have_completed_the_upload_and_processing_of_documents() {
        page.openUploadPage();
        page.uploadDocuments();
        assertTrue(page.isProcessingComplete());
    }

    @When("^I generate the 'Exit Slip'$")
    public void i_generate_the_exit_slip() {
        page.clickGenerateExitSlipButton();
    }

    @Then("^the system should create the 'Exit Slip'$")
    public void the_system_should_create_the_exit_slip() {
        assertTrue(page.isExitSlipGenerated());
    }

    @Then("^the original documents and extracted data should be saved in the request history$")
    public void the_original_documents_and_extracted_data_should_be_saved_in_the_request_history() {
        assertTrue(page.isDataSavedInHistory());
    }
}