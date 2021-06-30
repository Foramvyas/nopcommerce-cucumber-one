package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().getWelcomeText());

    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(500);
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        Thread.sleep(500);
    new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        Thread.sleep(500);
        new LoginPage().clickOnLoginButton();

    }

    @Then("^I should see the error message\"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String actualMessage) {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        actualMessage = new LoginPage().getErrorMessageText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @When("^I click on register Link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstname) throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().enterFirstName(firstname);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new RegisterPage().enterLastName(lastname);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")

    public void iEnterConfirmPassword(String confirmPassword) throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }
    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @And("^I click on Log out button$")

    public void iClickOnLogOutButton() throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().clickOnLogOutButton();

    }

    @Then("^I should login successfully as existing user$")

    public void iShouldLoginSuccessfullyAsExistingUser() {
        Assert.assertEquals("Welcome to our store", new RegisterPage().getTextLoginSuccessfully());

    }


}
