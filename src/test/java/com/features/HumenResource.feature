Feature: Human Resource module
 
 
 @Julia @DG1-9 @Smoke
  Scenario:  Verify that Human Resource Module list is reflected properly
    Given User is on the home page
    When User enters username "general@teacher.com" and password "123456"
    And User click on a button SingIn
    And User click on Human Resource Module item on left navigation menu
    Then the Human Resources have to display the following
      """"
      Staff Directory
      Staff Attendance
      Payroll
      Approve Leave Request
      Apply Leave
      Leave Type
      Teachers Rating
      Department
      Designation
      """"
