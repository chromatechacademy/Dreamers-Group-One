Feature: Navigation Modules


    @Victor @DG1-3 @Regression @Smoke
    Scenario: Navigating to the modules
        Given is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456" and logs in
        Then the following will be displayed on the CTSMS home page "Student Information","Fees Collection","Income","Expenses","Academics","Human Resource","Homework","Reports"
