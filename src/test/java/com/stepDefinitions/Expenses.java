package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Expenses {
    LoginPage loginPage = new LoginPage();

    @Given("clicks on the Expenses module")
    public void clicks_on_the_Expenses_module() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signInButton.click();
    }

    @Then("Expenses module will be displayed")
    public void expenses_module_will_be_displayed() {

    }

}
