Feature: JuliaSimpleTest

  @StudentInformationVerification
  Scenario: Verify that student information list is reflected properly
    Given I open site login page
    When I fill user login data
    And I wait while dashboard page loaded
    And I click on Student information item on left navigation menu
    Then I collect Student information items to list and verify them