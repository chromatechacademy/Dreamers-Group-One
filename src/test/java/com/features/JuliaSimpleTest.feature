Feature:student information list

  @Julia @DG1-4 @Regression @Smoke
  Scenario: Verify that student information list is reflected properly
    Given User is on the home page
    When User enters username "general@teacher.com" and password "123456"
    And User click on a button SingIn
    And User wait while dashboard page loaded
    And User click on Student information item on left navigation menu
    Then User collect Student information items to list and verify them
      """"
      Student Details
      Student Admission
      Disabled Students
      Bulk Delete
      Student Categories
      Student House
      Disable Reason
      """"




  @Julia @DG1-14 @Regression @Smoke
  Scenario Outline:Chroma Tech faculty user, should be able to edit student records by searching student details.
    Given User is on the home page
    When User enters username "general@teacher.com" and password "123456"
    And User click on a button SingIn
    And User click on Student information item on left navigation menu
    And User click on Student Addmission Section
    And User enters his data "<admissionNo>","<class>","<section>","<firstName>","<gender>","<dateOfBirth>","<ifGuardianIs>","<guardianName>","<guardianPhone>"
    And User click on a button SAVE
    And User click on a searching and enters firstName "Julia"
    And User click on search button
    And User click on a pencil
    And User changes admission number "123098"
    And User click on a button SAVE
    And User click on a searching and enters firstName "Julia"
    Then User click on search button


    Examples:
      | admissionNo | class | section     | firstName | gender | dateOfBirth | ifGuardianIs | guardianName | guardianPhone |
      | 123678      | SDET  | API Testing | Julia     | female | 06/18/1992  | Other        | Katja        | 1234567       |





