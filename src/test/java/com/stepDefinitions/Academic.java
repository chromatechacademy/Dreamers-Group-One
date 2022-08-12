package com.stepDefinitions;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.AcademicsModulePage;
import com.pages.LoginPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Academic {
    LoginPage loginPage = new LoginPage();
    AcademicsModulePage academicsPage = new AcademicsModulePage();
    
    @Given("clicks on the Academics module")
    public void clicks_on_the_Academics_module() {

        CommonUtils.selectDropDownValue("Academics", academicsPage.academicsDropDown);

        
    }

    @Then("Academics module will be displayed")
    public void academics_module_will_be_displayed(){


    String ActualClassTimetableModule = academicsPage.classTimeTableModule.getText();
    String ExpectedClassTimetableModule = "Class Timetable";
    Assert.assertEquals(ActualClassTimetableModule, ExpectedClassTimetableModule);

    String ActualTeacherTimetableModule = academicsPage.teacherTimetableModule.getText();
    String ExpectedTeacherTimetableModule = "Teachers Timetable";
    Assert.assertEquals(ActualTeacherTimetableModule, ExpectedTeacherTimetableModule);

    String ActualAssignClassTeacherModule = academicsPage.assignClassTeacherModule.getText();
    String ExpectedAssignClassTeacherModule = "Assign Class Teacher";
    Assert.assertEquals(ActualAssignClassTeacherModule, ExpectedAssignClassTeacherModule);

    String ActualPromoteStudentsModule = academicsPage.promoteStudentsModule.getText();
    String ExpectedPromoteStudentsModule = "Promote Students";
    Assert.assertEquals(ActualPromoteStudentsModule, ExpectedPromoteStudentsModule);

    String ActualSubjectGroupModule = academicsPage.subjectGroupModule.getText();
    String ExpectedSubjectGroupModule = "Subject Group";
    Assert.assertEquals(ActualSubjectGroupModule, ExpectedSubjectGroupModule);

    String ActualSubjectsModule = academicsPage.subjectsModule.getText();
    String ExpectedSubjectsModule = "Subjects";
    Assert.assertEquals(ActualSubjectsModule, ExpectedSubjectsModule);

    String ActualClassModule = academicsPage.classModule.getText();
    String ExcpectedClassModule = "Class";
    Assert.assertEquals(ActualClassModule, ExcpectedClassModule);

    String ActualSectionsModule = academicsPage.sectionsModule.getText();
    String ExpectedSectionsModule = "Sections";
    Assert.assertEquals(ActualSectionsModule, ExpectedSectionsModule);
        


    }

}
