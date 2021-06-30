Feature: Registration
  As a user I want to register in to nopCommerce website

  @Sanity,@Smoke,@Regression
  Scenario: User should navigate to registration page successfully
    Given I am on home page
    When I click on register Link
    Then I should navigate to registration page successfully

@Smoke,@Regression
    Scenario: Verify error message with first name field empty
      Given I am on home page
      And I click on register Link
      And I click on register button
      Then I should see the error message

@Regression
    Scenario: verify user should register successfully
      Given I am on home page
      When I click on register Link
      Then I should navigate to registration page successfully
      And I enter first name "Ravi"
      And I enter last name "Patel"
      And I enter email "ravi.patel12@yahoo.com"
      And I enter password "abcd1234"
      And I enter confirm password "abcd1234"
      And I click on register button
      Then I should register successfully