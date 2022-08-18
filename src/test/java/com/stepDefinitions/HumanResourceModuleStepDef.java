package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.HumanResourcePage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class HumanResourceModuleStepDef {

    LoginPage loginPage = new LoginPage();
    HumanResourcePage humanResourcePage = new HumanResourcePage();


    @Then("User click on Human Resource Module item on left navigation menu")
    public void user_click_on_Human_Resource_Module_item_on_left_navigation_menu() throws InterruptedException, IOException {
        humanResourcePage.humanResource.click();
        Thread.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
   
    @Then("the Human Resources have to display the following {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_Human_Resources_have_to_display_the_following(String staffDirectory, String staffAttendance, String payroll, String approve, String apply, String leave, String teacher, String departmen, String designation) {

        String actualResult1 = humanResourcePage.staffDirectoryTab.getText();
        Assert.assertTrue(actualResult1.contentEquals(staffDirectory));
        
        String actualResult2 = humanResourcePage.staffAttendanceTab.getText();
        Assert.assertTrue(actualResult2.contentEquals(staffAttendance));

        String actualResult3 = humanResourcePage.payrollTab.getText();
        Assert.assertTrue(actualResult3.contentEquals(payroll));

        String actualResult4 = humanResourcePage.applyTab.getText();
       Assert.assertTrue(actualResult4.contentEquals(approve));

        String actualResult5 = humanResourcePage.applyTab.getText();
        Assert.assertTrue(actualResult5.contentEquals(apply));

        String actualResult6 = humanResourcePage.leaveTab.getText();
        Assert.assertTrue(actualResult6.contentEquals(leave));

        String actualResult7 = humanResourcePage.teacherTab.getText();
        Assert.assertTrue(actualResult7.contentEquals(teacher));

        String actualResult8 = humanResourcePage.departmentTab.getText();
        Assert.assertTrue(actualResult8.contentEquals(departmen));

        String actualResult9 = humanResourcePage.designationTab.getText();
        Assert.assertTrue(actualResult9.contentEquals(designation));

       
    }
    

    
    
}
