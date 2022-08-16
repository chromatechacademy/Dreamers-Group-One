Feature: Disable and Enable Student

    @Angel @DG1-15a @Progression
    Scenario: Create Student scenario
        Given a user is on the CTSMS web page
        When the user logs in with username and password
        And navigates to Student Information menu
        And clicks on Student Admission
        And enters Admission No "0240"
        And select Class "SDET" from Class dropdown
        And selects Section "Testing Fundamentals" from Section dropdown
        And enters students name "Test Student" in First Name textbox
        And selects gender "Male" from Gender dropdown
        And enters date of birth "11/24/2000"
        And clicks radio button Father in If Guardian is,
        And enters guardian name "Test Father" into Guardian Name textbox
        And enters guardian phone "1112223333"
        And user clicks on the save button
        Then sucessful student admission message will display "Record Saved Successfully"

    @Angel @DG1-15b @Progression
    Scenario: Create Disable Reason
        Given a teacher is on the Disable Reason page
        When a teacher enters disable reason name "Test Reason" into the add name textbox
        And clicks on the add reason save button
        Then a Disable Reason is created "Test Reason" and will display the added test reason "Test Reason"

    @Angel @DG1-15c @Progression
    Scenario: Disable Student scenario
        Given a teacher is on the Student Details page
        When the teacher enters student name "Test Student" into the keyword search textbox
        And clicks on the keyword search button
        And clicks on student
        And clicks the red thumbs down icon
        And accepts the chrome alert
        And selects disable reason
        And clicks on the disable student save button
        Then the student record will be disabled and display Disable Reason "Test Reason"

    @Angel @DG1-16 @Progression
    Scenario: Enable Student scenario
        Given a teacher is on the Disabled Students page
        When a teacher enters disabled student "Test Student" into the keyword textbox
        And clicks on the disabled student keyword search button
        And clicks on disabled student while on the Disabled Students page
        And clicks on the green thumbs up icon
        And accepts the alert
        And navigates to the Student Details
        And enters student name "Test Student" into the keyword search textbox
        And clicks on the keyword search button
        Then the student will display on the Student Details page "Test Student"
        And the teacher deletes Disable Reason "Test Reason"
        And deletes student record with class "SDET" and section "Testing Fundamentals" and admission number "0240"
