package com.stepDefinitions;

import java.io.IOException;


import com.pages.LoginPage;
import com.pages.MobilePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;

public class MobileStepDef {

    LoginPage loginPage = new LoginPage();
    MobilePage mobilePage = new MobilePage();

    @Then("On left navigation menu user can see modules")
    public void on_left_navigation_menu_user_can_see_modules(String navigationMenuText)
            throws IOException, InterruptedException {
                
        mobilePage.moduleMenu.getText();
        mobilePage.moduleMenuTwo.getText();
        mobilePage.moduleNameThree.getText();
        mobilePage.moduleMenuFour.getText();
        mobilePage.moduleMenuFive.getText();
        Thread.sleep(2000);
        CommonUtils.waitForVisibility(mobilePage.moduleMenu);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.getScreenShot();

    }

}
