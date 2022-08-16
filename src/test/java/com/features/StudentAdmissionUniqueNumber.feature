Feature: Student Admission unique admission number


    @Victor @DG1-13 @Regression
    Scenario: CTSMS - Student Admission unique admission number
        Given is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456" and logs in
        And clicks on the Student Information module
        And clicks on Student Admission module
        And fills in all required Information "3729","SDET","Testing Fundamentals","Billy","Male","02/05/1980","Bob","309-492-4982"
        And clicks Save
        When on the Student Admission Page user will enter in an exisiting studnet Information "3729","SDET","Testing Fundamentals","Billy","Male","02/05/1980","Bob","309-492-4982"
        And clicks save
        Then the user will get a message saying "The Admission No field must contain a unique value."
        And user deletes student records with class "SDET" and section "Testing Fundamentals" and admission no "3729"
