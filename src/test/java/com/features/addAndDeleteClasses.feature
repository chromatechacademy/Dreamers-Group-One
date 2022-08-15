Feature: Ability to add and delete classes

    Description: This feature file contains scenario to add and delete classes
    @jomir @DG1-18 @Progression
    Scenario: CTSMS - Ability to add and delete classes
        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        And navigates to Academics module
        And navigates to class module
        And adds class "DG1 Test Class"
        And deletes class "DG1 Test Class"
        Then the "DG1 Test Class" class should be deleted