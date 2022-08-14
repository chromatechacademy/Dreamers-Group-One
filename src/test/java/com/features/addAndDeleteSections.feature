Feature: Ability to add and delete sections

    Description: This feature file contains the ability to add and delete class sections on CTSMS
    @jomir @DG1-17 @Progression
    Scenario: CTSMS - Ability to add and delete sections
        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        And navigates to Academics module
        And navigates to sections module
        And adds section "DYNAMIC XPATH EXAMPLE"
        And deletes sections "DYNAMIC XPATH EXAMPLE"
        Then the "DYNAMIC XPATH EXAMPLE" section should be deleted