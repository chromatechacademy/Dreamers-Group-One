package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import com.pages.AcademicsSectionPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

public class AddAndDeleteSectionsStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    // AcademicsClassPage academicsClassPage = new AcademicsClassPage();
    AcademicsSectionPage academicsSectionPage = new AcademicsSectionPage();

    @Given("navigates to Academics module")
    public void navigates_to_Academics_module() throws IOException {
        // WAITING FOR VISIBILITY OF ACADEMICS MODULE LINK
        CommonUtils.waitForVisibility(homePage.academicsModuleLink);

        homePage.academicsModuleLink.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        ;
    }

    @Given("navigates to sections module")
    public void navigates_to_sections_module() throws IOException {
        CommonUtils.waitForVisibility(academicsSectionPage.sectionsLink);
        academicsSectionPage.sectionsLink.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Given("adds section {string}")
    public void adds_section(String sectionName) throws IOException {
        academicsSectionPage.sectionsTextBox.sendKeys(sectionName);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        academicsSectionPage.sectionsSaveButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Given("deletes sections {string}")
    public void deletes_sections(String sectionName) throws InterruptedException, IOException {
        Thread.sleep(2000);
        CommonUtils.waitForVisibility(academicsSectionPage.classSectionsDynamicXPATH(sectionName));
        academicsSectionPage.classSectionsDynamicXPATH(sectionName).click();
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(3000);
    }

    @Then("the {string} section should be deleted")
    public void the_section_should_be_deleted(String sectionName) throws IOException {
        
        for (int i = 0; i < academicsSectionPage.allSectionNames.size();i++) {
            academicsSectionPage.allSectionNames.get(i);

            Assert.assertFalse(academicsSectionPage.allSectionNames.get(i).getText().contentEquals(sectionName));
        }
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
