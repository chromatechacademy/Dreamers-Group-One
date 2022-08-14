Feature: CTSMS - Homework module

    Description: This feature file contains Chroma Tech School Management System Homework Module Menu Buttons
    @jomir @DG1-10 @Smoke
    Scenario: Homework Module to include:
            """
            - Add Homework
            """

        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        When the user clicks Homework on the sidebar navigation menu
        Then the page displays the following menu buttons: "Add Homework"