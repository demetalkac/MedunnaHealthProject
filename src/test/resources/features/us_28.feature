@US_028_Test
Feature: US_028_TC_001
  @US028_TC001_UI
  Scenario: TC001_medunna_admin_messages
    Given user is on the medunna page
    When user clicks on user icon button
    Then user clicks on Sign In Button icon
    And user enters username "melina" in username input
    And user enters password "melina90" in password input
    And user clicks on Remember me checkbox
    And user clicks on Sign In submit Button icon
    And user clicks on itemsAndTitles button icon
    And user clicks on Messages option from itemsAndTitles
    And user clicks create a new message
    And user enters name to create message
    And user enters email to create message
    And user enters subject to create message
    And user enters message to create message
    And user clicks on save button to create or edit message
    And user clicks back to see message list
    And user clicks edit button for update
    And user enters new data for update
    And user clicks save button icon to update
    And user clicks delete button icon




