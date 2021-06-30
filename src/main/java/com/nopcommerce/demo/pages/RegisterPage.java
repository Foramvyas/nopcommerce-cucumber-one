package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessfullyMessage;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement loginSuccessfully;


    public void clickOnRegisterButton() {
        log.info("Clicking on register button : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getTextFirstNameFiledEmpty() {
        log.info("Verify error message first name filed empty : " + errorMessageFirstName.toString());
        return getTextFromElement(errorMessageFirstName);
    }

    public String getTextRegister() {
        log.info("Getting text from : " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String name) {
        log.info("Entering email address : " + name + " to email field : " + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String lastname) {
        log.info("Entering email address : " + lastname + " to email field : " + lastName.toString());
        sendTextToElement(lastName, lastname);
    }

    public void enterConfirmPassword(String passwordConfirm) {
        log.info("Entering password : " + passwordConfirm + " to password field : " + confirmPassword.toString());
        sendTextToElement(confirmPassword, passwordConfirm);
    }
    public String getTextRegisterSuccessfully() {
        log.info("Getting text from : " + registerSuccessfullyMessage.toString());
        return getTextFromElement(registerSuccessfullyMessage);
    }
    public void clickOnLogOutButton() {
        log.info("Clicking on login button : " + logOut.toString());
        clickOnElement(logOut);
    }

    public String getTextLoginSuccessfully() {
        log.info("Getting text from login page : " + loginSuccessfully.toString());
        return getTextFromElement(loginSuccessfully);
    }

}