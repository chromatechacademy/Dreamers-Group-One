Feature: JuliaSimpleTest

  @StudentInformationVerification
  Scenario: Verify that student information list is reflected properly
    Given User is on the home page
    When User logs in with username and password
    And User wait while dashboard page loaded
    And User click on Student information item on left navigation menu
    Then User collect Student information items to list and verify them

    