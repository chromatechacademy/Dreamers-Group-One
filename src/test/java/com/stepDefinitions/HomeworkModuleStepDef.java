package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.HomePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeworkModuleStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    HomePage homePage = new HomePage();

    @When("the user clicks Homework on the sidebar navigation menu")
    public void the_user_clicks_Homework_on_the_sidebar_navigation_menu() throws IOException, InterruptedException {

        // Wait for sidenav to become clickable
        CommonUtils.waitForClickability(homePage.HomeworkModuleNavButton);

        // Click "Homework" on sidenav
        homePage.HomeworkModuleNavButton.click();

        // Wait for Homework module to expand
        CommonUtils.getWaitObject();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the page displays the following menu buttons: {string}")
    public void the_page_displays_the_following_menu_buttons(String addHomework) throws IOException {

        // Check if the actual text matches the expected text
        Assert.assertTrue(homePage.AddHomeWorkButton.getText().contentEquals("Add Homework"));

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
