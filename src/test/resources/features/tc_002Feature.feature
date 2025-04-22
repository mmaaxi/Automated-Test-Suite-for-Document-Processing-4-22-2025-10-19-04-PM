Feature: File Upload Feature

  Scenario: Validate uploading a file with valid format and preview
    Given I have navigated to the file upload page
    When I select a file with a valid format (PDF/DOCX) that is within the size limit of 50 MB
    Then the file should be uploaded successfully
    And I should see a preview showing the file name, size, and type