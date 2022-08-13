Feature: Student Admission unique admission number

    Feature Description

    @victor @DG1-13 
    Scenario: CTSMS - Student Admission unique admission number 
    Given user has logged in with valid credentials
    And clicks on the Student Information module
    And clicks on Student Admission module
    When user is on Students Admission page and enters in a existing Admission No. 
    And all other required information is filled in
    Then the user will not be able to admit a student with an already existing admission number