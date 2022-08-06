Feature: Main Paige
  These tests will verify the functionality of the Main Paige

  Scenario: Locating the instructors
    Given I am on the main page of the website
    When I click the button Instructors on the top of the page
    Then  I am taken to the instructors area

  Scenario: Input a valid email address
    Given I am on the main page of the website
    When  I click the email input field
    And I input the email address 'testing@yahoo.com'
    And I click the Submit button
    Then A pop-up should appear informing me I have been signed up for the newsletter.

  Scenario: Verify the read button on the hybrid section
    Given I am on the main page of the website
    When I click the read more button on the hybrid section
    Then I am taken to the "hybrid" page
    And I click the return button
    Then I am taken to the "software testing course" page

  Scenario: Input an invalid email address
    Given I am on the main page of the website
    When I click the email input field
    And I input the email address 'testing.gmail.com'
    And I click the Submit button
    Then the border of the input field should become red and no pop-up should appear


