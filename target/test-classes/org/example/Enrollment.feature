Feature: Enrollment Page
  These tests will verify the functionality of the Enrollment Page

  Scenario: Input valid text in every place holder from Personal information Page
    Given I am on the Personal information section from the Enrollment Page
    When I enter "Sam" as First Name
    * "Smith" as Last Name
    * "S.Smith" as Username
    * "1234a" as Password
    * "1234a" as Confirm Password
    And I click on Next button
    Then I will be redirected to the Contact information step

    Scenario: Contact Information - Positive flow
      Given I am on the Contact information page
      When I enter "test@test.com" as email
      * "0756 723 879" as phone
      * "Romania" as country
      * "Brasov" as city
      * "600178" as postcode
      And I click on Next button for Contact Information
      Then I will be redirected to the Course option step

    Scenario: Contact Information - Negative flow missing country
      Given I am on the Contact information page
      When I enter "test@test.com" as email
      * "0756 723 879" as phone
      * " " as country
      * "Brasov" as city
      * "600178" as postcode
      And I click on Next button for Contact Information
      Then I will be redirected to the Contact information step




  Scenario: Verify complete registration form for Sign up for the Software testing course
    Given I am on the Personal Information section
    When I fill in the Personal Information page with valid data
    And I fill in the Contact Information page with valid data
    And I select the Software Testing - Automation & Manual tester certificate from the Course options
    And I fill in the Payment Information page with valid data
    And I click the Next button
    Then an mesage with my succesfully registration should appear

