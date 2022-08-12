Feature: JuliaSimpleTest

  @Julia @DG1-4 @Smoke
  Scenario: Verify that student information list is reflected properly
    Given User is on the home page
    When User logs in with username and password
    And User wait while dashboard page loaded
    And User click on Student information item on left navigation menu
    Then User collect Student information items to list and verify them

  @Julia @DG1-9 @Smoke
  Scenario: Example of hardcoding in scenario
    Given user is on the home page
    When user logs in with username "general@teacher.com" and password "123456"
    Then User click on Human Resource Module item on left navigation menu

