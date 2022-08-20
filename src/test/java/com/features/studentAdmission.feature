Feature: Student Admission


    @Jomir @DG1-23 @Mobile @Smoke @Regression
    Scenario: CTSMS - Student Admission
        Given a user is logged into the CTSMS portal
        And the user is on the CTSMS home page
        And clicks on the Student Information module
        And clicks on Student Admission module
        And fills in all required Information "190874","SDET","Testing Fundamentals","Willy","Male","02/05/1980","Rob","309-492-4982"
        And clicks Save
        Then user will have created a Student and user will see "Record Saved Successfully"
        Then user deletes student records with class "SDET" and section "Testing Fundamentals" and admission no "190874"