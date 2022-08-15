Feature: Ability to add and delete sections

    Description: This feature file contains the ability to add and delete class sections on CTSMS
    @jomir @DG1-17 @Smoke
    Scenario: CTSMS - Ability to add and delete sections
        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        And navigates to Academics module
        And navigates to sections module
        And adds section "DG1 Test Section"
        And deletes sections "DG1 Test Section"
        Then the "DG1 Test Section" section should be deleted