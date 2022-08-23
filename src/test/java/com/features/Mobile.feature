Feature:MOBILE - Navigation modules

  @Julia @DG1-24 @Mobile @Regression
  Scenario: Navigation modules to be displayed on portal
    Given User is on the home page
    When User enters username "general@teacher.com" and password "123456"
    And User click on a button SingIn
    And User click on a hamburger menu on left
    Then On left navigation menu user can see modules
      """"
      Student Information
      Fees Collection
      Income
      Expenses
      Academics
      Human Resource
      Homework
      Reports
      """"
