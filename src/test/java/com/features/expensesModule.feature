
Feature: Expense Module

    Feature Description

    @DG1-7
    Scenario: Navigating to the expenses modules
        Given is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456" and logs in
        And clicks on the Expenses module
        Then Expenses module will be displayed with the following "Add Expense","Search Expense","Expense Head"