Feature: Invalid Login

    @Angel @DG1-2 @Smoke @Regression
    Scenario: Invalid Login scenario
        Given a user is on the CTSMS web page
        When user attempts logs in with invalid username "general1@teacher.com" and invalid password "234567"
        Then the user should see message "Invalid Username or Password"


    
            






