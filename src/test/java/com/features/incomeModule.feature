Feature: CTSMS - Income module

    Description: This feature file contains Chroma Tech School Management System Income Module Menu Items
    @jomir @DG1-6 @Smoke
    Scenario: Income Module to include:
            """
            - Add Income
            - Search Income
            - Income Head
            """

        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        When the user clicks "Income" on the sidebar navigation menu
        Then the page displays the following menu items: "Add Income", "Search Income", "Income Head"