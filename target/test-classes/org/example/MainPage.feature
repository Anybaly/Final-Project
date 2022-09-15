Feature: Main Page
  These tests will verify the functionality of the Main Page

  Scenario: Locating the instructors
    Given I am on the main page of the website
    When I click the button Instructors on the top of the page
    Then  I am taken to the instructors area

  Scenario: Input a valid email address
    Given I am on the main page of the website
    When  I click the email input field
    And I input the email address "testing@yahoo.com"
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
    And I input the email address "testing.gmail.com"
    And I click the Submit button
    Then the border of the input field should become red and no pop-up should appear

  Scenario: Verify the read button on the virtual section
    Given I am on the main page of the website
    When I click the read more button on the virtual section
    Then I am taken to the "virtual" page

  Scenario: Verify that the what you'll learn link will redirect you to fundamentals page
    Given I am on the main page of the website
    When I click the what you'll learn link
    And I click the read more button from the learn the fundamentals area
    Then I will be redirected to the fundamentals page

  Scenario: Verify the questions link
    Given I am on the main page of the website
    When I click on questions link
    Then I will be redirected to the frequently asked questions area

  Scenario: Verify where is your institution located button
    Given I am on the main page of the website
    When I click the where is your institution located button
    Then the information of the location of the institution appears

  Scenario: Verify the start the enrollment button
    Given I am on the main page of the website
    When I click on start the enrollment button
    Then I will be redirected to register page

  Scenario: Verify Sara Smith Instagram page
    Given I am on the main page of the website
    When I click the button Instructors on the top of the page
    And I click on Sara Smith Instagram page
    Then I will be redirected to her Instagram page