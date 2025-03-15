Feature: Creating and Saving a Document

  Scenario: User creates and saves a document successfully
    Given User is logged in and on the document page
    When User creates and saves a new document
    Then The document should be saved successfully