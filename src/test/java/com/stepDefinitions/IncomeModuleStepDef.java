package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("a user is logged into the CTSMS portal")
    public void a_user_is_logged_into_the_CTSMS_portal() throws IOException {

        // Navigate to CTSMS
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        // Send username and password then click 'Sign In'
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Given("the user is on the CTSMS home page")
    public void the_user_is_on_the_CTSMS_home_page() throws IOException {
        // Getting page title and storing as String
        String actualPageTitle = WebDriverUtils.driver.getTitle();

        // Assertion to check if actual page title is the same as expected page title
        Assert.assertTrue(actualPageTitle.contentEquals(ApplicationConstants.EXPECTED_PAGE_TITLE));

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("the user clicks Income on the sidebar navigation menu")
    public void the_user_clicks_Income_on_the_sidebar_navigation_menu() throws InterruptedException, IOException {

        // Wait for sidenav to become clickable
        CommonUtils.waitForClickability(homePage.IncomeModuleNavButton);

        // Click "Income" on sidenav
        homePage.IncomeModuleNavButton.click();

        // Wait for "Income" module to expand
        CommonUtils.getWaitObject();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("the page displays the following menu buttons: {string}, {string}, {string}")
    public void the_page_displays_the_following_menu_buttons(String addIncome, String searchIncome, String incomeHead)
            throws IOException {

        // Wait for nav menu button visibility
        CommonUtils.waitForVisibility(homePage.AddIncomeButton);
        CommonUtils.waitForVisibility(homePage.SearchIncomeButton);
        CommonUtils.waitForVisibility(homePage.IncomeHeadButton);


        // Check if the actual text matches the expected text
        Assert.assertTrue(homePage.AddIncomeButton.getText().contentEquals(addIncome));
        Assert.assertTrue(homePage.SearchIncomeButton.getText().contentEquals(searchIncome));
        Assert.assertTrue(homePage.IncomeHeadButton.getText().contentEquals(incomeHead));

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}