Feature: Login Test

  As a User I want to login in to nopCommerce website

@Sanity,@Smoke,@Regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully


@Smoke,@Regression
    Scenario Outline: Verify the error message with invalid credentials
      Given I am on home page
      When I click on login link
      And I enter email "<username>"
      And I enter password "<password>"
      And I click on login button
      Then I should see the error message"<errorMessage>"
      Examples:
        | username                | password   | errorMessage                                                                               |
        | abcd123@gmail.com       | xyz123     | Login was unsuccessful. Please correct the errors and try again.No customer account found |
        | xyzbc34@gmail.com       | abfd789    | Login was unsuccessful. Please correct the errors and try again. No customer account found|
        | ac6702@gmail.com        | cvbe2278   | Login was unsuccessful. Please correct the errors and try again. No Customer account found|



@Regression
      Scenario: User should login successfully with valid credentials
        Given I am on home page
        When I click on register Link
        And I enter first name "Ravi"
        And I enter last name "Mishra"
        And I enter email "ravi.mishra12@yahoo.com"
        And I enter password "abcd1243"
        And I enter confirm password "abcd1243"
        And I click on register button
        And I click on Log out button
        And I click on login link
        And I enter email "ravi.mishra12@yahoo.com"
        And I enter password "abcd1243"
        And I click on login button
        Then I should login successfully as existing user

