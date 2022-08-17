package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.AcademicsSectionPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddAndDeleteSectionsStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AcademicsSectionPage academicsSectionPage = new AcademicsSectionPage();

    @Given("navigates to Academics module")
    public void navigates_to_Academics_module() throws IOException {
        // WAITING FOR VISIBILITY OF ACADEMICS MODULE LINK
        CommonUtils.waitForVisibility(homePage.academicsModuleLink);

        // Click to expand "Academics" module
        homePage.academicsModuleLink.click();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        ;
    }

    @Given("navigates to sections module")
    public void navigates_to_sections_module() throws IOException {

        // Wait for sections link to become visible
        CommonUtils.waitForVisibility(academicsSectionPage.sectionsLink);

        // Click "Sections"
        academicsSectionPage.sectionsLink.click();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Given("adds section {string}")
    public void adds_section(String sectionName) throws IOException {

        // Send section name to section text box
        academicsSectionPage.sectionsTextBox.sendKeys(sectionName);

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        academicsSectionPage.sectionsSaveButton.click();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Given("deletes sections {string}")
    public void deletes_sections(String sectionName) throws InterruptedException, IOException {

        CommonUtils.getWaitObject();

        // Wait for the new section name to become visible
        CommonUtils.waitForVisibility(academicsSectionPage.classSectionsDynamicXPATH(sectionName));
        academicsSectionPage.classSectionsDynamicXPATH(sectionName).click();

        // Accept the alert to confirm deletion of section
        CommonUtils.acceptAlert();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        CommonUtils.getWaitObject();
    }

    @Then("the {string} section should be deleted")
    public void the_section_should_be_deleted(String sectionName) throws IOException {

        // Iterate through a list of all section names
        for (int i = 0; i < academicsSectionPage.allSectionNames.size(); i++) {

            // Get the name of the newly created section
            academicsSectionPage.allSectionNames.get(i);

            // Check if section name is deleted from the list of all sections
            Assert.assertFalse(academicsSectionPage.allSectionNames.get(i).getText().contentEquals(sectionName));
        }

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
