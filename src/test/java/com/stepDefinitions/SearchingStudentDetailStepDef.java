package com.stepDefinitions;



import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.SearchingStudentPage;

import cucumber.api.java.en.When;

public class SearchingStudentDetailStepDef {

    LoginPage loginPage = new LoginPage();
    SearchingStudentPage searchingStudentPage = new SearchingStudentPage();
    DashboardPage dashboardPage = new DashboardPage();


    @When("User click on Student Addmission Section")
    public void user_click_on_Student_Addmission_Section() throws InterruptedException {
        searchingStudentPage.studentAddmisioElement.click();
        Thread.sleep(2000);

    }

}
