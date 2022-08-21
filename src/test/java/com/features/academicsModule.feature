Feature: Academics Module


    @Victor @DG1-8 @Regression
    Scenario: Navigating to the Academics module
        Given is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456" and logs in
        And clicks on the Academics module
        Then the Academics module will be displayed with the following modules "Class Timetable","Teachers Timetable","Assign Class Teacher","Promote Students","Subject Group","Subjects","Class","Sections"
