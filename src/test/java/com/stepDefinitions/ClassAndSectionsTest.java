package com.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.util.Strings;

import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.aventstack.extentreports.gherkin.model.And;
import com.pages.ClassAndSections;
import com.pages.FeesCollectionModule;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionsTest {

    LoginPage loginPage = new LoginPage();

    ClassAndSections classAndSections = new ClassAndSections();

    @When("the user selects Academics module")
    public void the_user_selects_Academics_module() throws InterruptedException {

        classAndSections.academicsModule.click();

        Thread.sleep(3000);

    }

    @When("the user selects Class")
    public void the_user_selects_Class() throws InterruptedException {

        classAndSections.classModule.click();

        Thread.sleep(2000);
    }

    @Then("the Class for Cyber Security will display the following Sections:")
    public void the_Class_for_Cyber_Security_will_display_the_following_Sections(String docString) {

        String actualResult1String = classAndSections.networkingFundamentals.getText();

        String actualResult2String = classAndSections.linuxFundamentals.getText();

        String actualResult3String = classAndSections.ciaTriad.getText();

        String actualResult4String = classAndSections.penetrationTestingEthicalHacking.getText();

        String expectedResult1 = "Networking Fundamentals";

        String expectedResult2 = "Linux Fundamentals";

        String expectedResult3 = "CIA Triad";

        String expectedResult4 = "Penetration Testing/Ethical Hacking";

        Assert.assertEquals(expectedResult1, actualResult1String);

        Assert.assertEquals(expectedResult2, actualResult2String);

        Assert.assertEquals(expectedResult3, actualResult3String);

        Assert.assertEquals(expectedResult4, actualResult4String);

    }

    @Then("the Class for SDET will display the following Sections:")
public void the_Class_for_SDET_will_display_the_following_Sections(String docString) {

        String actualResult5String = classAndSections.testingFundamentals.getText(); 
        String actualResult6String = classAndSections.sdlcMethodologies.getText();
        String actualResult7String = classAndSections.seleniumTestAutomation.getText(); 
        String actualResult8String = classAndSections.cucumberFundamentals.getText(); 
        String actualResult9String = classAndSections.apiTesting.getText(); 
        String actualResult10String = classAndSections.gitGithub.getText(); 
        String actualResult11String = classAndSections.java11ForCoolPeople.getText(); 
        String actualResult12String = classAndSections.mobileTestAutomation.getText(); 
        String actualResult13String = classAndSections.accessibilityTesting.getText(); 
        String actualResult14String = classAndSections.databaseTesting.getText(); 

        String expectedResult5 = "Testing Fundamentals";
        String expectedResult6 = "SDLC Methodologies";
        String expectedResult7 = "Selenium Test Automation"; 
        String expectedResult8 = "Cucumber Fundamentals"; 
        String expectedResult9 = "API Testing"; 
        String expectedResult10 = "Git/GitHub"; 
        String expectedResult11 = "Java 11 for Cool People"; 
        String expectedResult12 = "Mobile Test Automation"; 
        String expectedResult13 = "Accessibility Testing"; 
        String expectedResult14 = "Database Testing"; 

        Assert.assertEquals(expectedResult5, actualResult5String);
        Assert.assertEquals(expectedResult6, actualResult6String);
        Assert.assertEquals(expectedResult7, actualResult7String);
        Assert.assertEquals(expectedResult8, actualResult8String);
        Assert.assertEquals(expectedResult9, actualResult9String);
        Assert.assertEquals(expectedResult10, actualResult10String);
        Assert.assertEquals(expectedResult11, actualResult11String);
        Assert.assertEquals(expectedResult12, actualResult12String);
        Assert.assertEquals(expectedResult13, actualResult13String);
        Assert.assertEquals(expectedResult14, actualResult14String);














    
}


}
