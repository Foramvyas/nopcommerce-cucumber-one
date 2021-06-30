package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerTest {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {


    }

    @Given("^I am on Computer Page$")
    public void iAmOnComputerPage() {
        new HomePage().mouseHoverOnComputerLink();

    }

    @When("^I click on Desktops Link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();


    }

    @Then("^I should navigate to Desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals("Desktops",new ComputerPage().verifyTextDesktops());

    }


    @When("^I click on Note Books Link$")
    public void iClickOnNoteBooksLink() {
        new ComputerPage().clickOnNoteBooksLink();

    }

    @Then("^I should be navigate to Note books link successfully$")
    public void iShouldBeNavigateToNoteBooksLinkSuccessfully() {
        Assert.assertEquals("Notebooks", new ComputerPage().verifyTextNoteBooks());

    }

    @When("^I click on Software Link$")
    public void iClickOnSoftwareLink() {
        new ComputerPage().clickOnSoftwareLink();

    }

    @Then("^I should navigate to Softwatre Link successfully$")
    public void iShouldNavigateToSoftwatreLinkSuccessfully() {
        Assert.assertEquals("Software",new ComputerPage().verifyTextSoftware());
    }
}
