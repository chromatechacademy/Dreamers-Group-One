Feature: JuliaSimpleTest

  @Julia @DG1-4 @Smoke
  Scenario: Verify that student information list is reflected properly
    Given User is on the home page
    When user logs in with username "general@teacher.com" and password "123456"
    And User wait while dashboard page loaded
    And User click on Student information item on left navigation menu
    Then User collect Student information items to list and verify them

  @Julia @DG1-9 @Smoke
  Scenario:  Verify that Human Resource Module list is reflected properly
    Given user is on the home page
    When user logs in with username "general@teacher.com" and password "123456"
    Then User click on Human Resource Module item on left navigation menu

    @Julia @DG1-14 @Smoke
  Scenario: Chroma Tech faculty user, should be able to edit student records by searching student details.
    Given User Is on the home page 
    When User enters username "general@teacher.com" and password "123456"
    And Usr click on Student information item on left navigation menu
    And Usr click on Student details item on left navigation menu
    
    
    




    

