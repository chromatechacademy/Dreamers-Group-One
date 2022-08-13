Feature: Student Admission unique admission number

    Feature Description

    @victor @DG1-12
    Scenario: CTSMS - Student Admission
    Given user has logged in with valid credentials
    And clicks on the Student Information module
    And clicks on Student Admission module
    And fills in all required Information
    And clicks Save
    Then user will have created a Student

     @victor @DG1-13
     Scenario: CTSMS - Student Admission unique admission number
     Given user has logged in with valid credentials
     And clicks on the Student Information module
     And clicks on Student Admission module
     And fills in an existing Admission No.
     And clicks Save
     Then the user will get a message saying "The Admission No field must contain a unique value"
