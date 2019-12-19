@tag
Feature: To validate the Adictin Functionality

  @tag1
  Scenario: To Check Adictin login functionality
    Given Launch the browser and open the flipcart application
    When Enter the Username and Password
      | pavithran1996 | pranav@85 |
    And Click Login button
    And Enter booking credentials
    And Confirm the Booking
    And Enter Address credentials
    And Logout the page
    Then Successful

  