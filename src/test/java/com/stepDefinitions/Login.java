package com.stepDefinitions;

import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {

    LoginPage loginPage = new LoginPage();


    @When("a Chroma Tech faculty member logs in with valid credentials via a mobile device")
public void a_Chroma_Tech_faculty_member_logs_in_with_valid_credentials_via_a_mobile_device() {
    
}

@Then("Chroma Tech faculty member has no issues and is successfully logged in to Chroma Tech Academy School management system")
public void chroma_Tech_faculty_member_has_no_issues_and_is_successfully_logged_in_to_Chroma_Tech_Academy_School_management_system() {

    String expectedresult1 = "Chroma Tech Academy"; 

    String actualPageTitle = WebDriverUtils.driver.getTitle();

    Assert.assertEquals(expectedresult1, actualPageTitle);




    
}

    
}
