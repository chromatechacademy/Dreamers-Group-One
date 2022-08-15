package com.stepDefinitions;

import java.io.IOException;


import com.pages.LoginPage;
import com.pages.TwoDashboardPage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class HumanResourceModuleStepDef {

    LoginPage loginPage = new LoginPage();
    TwoDashboardPage twoDashboardPage = new TwoDashboardPage();


    @Then("User click on Human Resource Module item on left navigation menu")
    public void user_click_on_Human_Resource_Module_item_on_left_navigation_menu() throws InterruptedException, IOException {
        twoDashboardPage.humanResource.click();
        Thread.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
