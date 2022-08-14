Feature: Login Scenarios

    Description: This feature file contains Chroma Tech School Management System Login Scenarios


    @jomir @DG1-1 @Smoke
    Scenario: Login with valid credentials
        Given a user is on the CTSMS login page
        When the user logs in with username "general@teacher.com" and password "123456"
        Then the user should be succesfully logged in and page title is "Chroma Tech Academy"