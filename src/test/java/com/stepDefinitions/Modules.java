package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.constants.ApplicationConstants;
import com.pages.CTMSHomePage;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Modules {
    LoginPage loginPage = new LoginPage();
    CTMSHomePage ctmsHomePage = new CTMSHomePage();

    @Given("user has logged in with valid credentials")
    public void user_has_logged_in_with_valid_credentials() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signInButton.click();

    }

    @Then("the navigation modules should be displayed")
    public void the_navigation_modules_should_be_displayed() {
        
        ctmsHomePage.navigationModules.getText();



    }
}