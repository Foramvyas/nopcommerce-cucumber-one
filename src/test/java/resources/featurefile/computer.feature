Feature: Computer Page Link Navigation

  As a user I want to navigate on computer page links

  Background:
    Given I am on home page
@Sanity,@Smoke,@Regression

  Scenario: User should navigate to Desktops page successfully
    Given I am on Computer Page
    When I click on Desktops Link
    Then I should navigate to Desktops page successfully

@Smoke, @Regression
  Scenario: User should navigate to Note Books page successfully
    Given I am on Computer Page
    When I click on Note Books Link
    Then I should be navigate to Note books link successfully

@Regression
  Scenario: User should navigate to Software page successfully
    Given I am on Computer Page
    When I click on Software Link
    Then I should navigate to Softwatre Link successfully