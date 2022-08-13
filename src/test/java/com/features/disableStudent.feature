Feature: Disable Student

    @Angel @DG1-15 @Progression
    Scenario: Disable Student scenario
    Given a user is logged into the CTSMS website
    When user disables a student
    Then user will appear as disabled <"disabledStudent">