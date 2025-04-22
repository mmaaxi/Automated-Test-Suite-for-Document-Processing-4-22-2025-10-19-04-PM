Feature: Generate and Store Exit Slip

  Scenario: Validate generation of 'Exit Slip' and storage in the history
    Given I have completed the upload and processing of documents
    When I generate the 'Exit Slip'
    Then the system should create the 'Exit Slip'
    And the original documents and extracted data should be saved in the request history