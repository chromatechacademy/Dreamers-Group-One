Feature: Student Admission


    @DG1-12
    Scenario: CTSMS - Student Admission
        Given is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456" and logs in
        And clicks on the Student Information module
        And clicks on Student Admission module
        And fills in all required Information "908747","SDET","Testing Fundamentals","Billy","Male","02/05/1980","Bob","309-492-4982"
        And clicks Save
        Then user will have created a Student and user will see "Record Saved Successfully"
        Then user deletes student records with class "SDET" and section "Testing Fundamentals" and admission no "908747"


