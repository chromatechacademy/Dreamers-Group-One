package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.HomeworkModulePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeworkModuleStepDef {

    HomeworkModulePage homeworkModulePage = new HomeworkModulePage();

    @When("the user clicks Homework on the sidebar navigation menu")
    public void the_user_clicks_Homework_on_the_sidebar_navigation_menu() throws IOException, InterruptedException {
       
        // Wait for sidenav to become clickable
        CommonUtils.waitForClickability(homeworkModulePage.HomeworkModuleNavButton);

        // // Click "Income" on sidenav
        homeworkModulePage.HomeworkModuleNavButton.click();

        Thread.sleep(3000);
        
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the page displays the following menu buttons: {string}")
    public void the_page_displays_the_following_menu_buttons(String addHomework) throws IOException {

        addHomework = homeworkModulePage.AddHomeWorkButton.getText();

        Assert.assertTrue(addHomework.contentEquals("Add Homework"));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
