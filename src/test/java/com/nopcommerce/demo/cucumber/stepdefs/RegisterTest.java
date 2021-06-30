package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RegisterTest {
    @Then("^I should navigate to registration page successfully$")
    public void iShouldNavigateToRegistrationPageSuccessfully() {
        String expectedVerificationMessage = "Register";
        String actualVerificationMessage = new RegisterPage().getTextRegister();
        Assert.assertEquals(actualVerificationMessage,expectedVerificationMessage);
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully() {

        String expectedRegistrationMessage = "Your registration completed";
        String actualRegistrationMessage = new RegisterPage().getTextRegisterSuccessfully();
        Assert.assertEquals(actualRegistrationMessage,expectedRegistrationMessage);
    }


    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage() {
        String actualMessage = "First name is required.";
        String expectedMessage = new RegisterPage().getTextFirstNameFiledEmpty();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
