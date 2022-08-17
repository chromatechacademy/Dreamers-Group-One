Feature: Adding Multiple Students

    Feature Description: As a Chroma Tech Faculty member I want to be able to add multiple students in one session

    @Angel @DG1-19 @Progression @Regression
    Scenario Outline: CTSMS - Adding multiple students
        Given a user is on the CTSMS web page
        When the user logs in with username and password
        And navigates to Student Information menu
        And clicks on Student Admission
        And admits student with the information "<admissionNumber>","<firstName>","<studentClass>","<gender>","<section>","<dateOfBirth>"
        And selects other for guardian
        And enters guardian information "<fatherName>","<fatherPhone>","<motherName>","<motherPhone>","<guardianName>","<guardianRelation>","<guardianPhone>"
        Then student is succefully admitted and user sees message "Record Saved Successfully"
        And user deletes student record with class "<studentClass>" and section "<section>" and admission number "<admissionNumber>"
        Examples:
            | admissionNumber | firstName | studentClass   | gender | section                 | dateOfBirth | fatherName | fatherPhone | motherName | motherPhone | guardianName | guardianRelation | guardianPhone |
            | 0120            | Emely     | SDET           | Female | Testing Fundamentals    | 08/30/1998  | Julio      | 5713191568  | Hannah     | 5713191568  | Julio        | Father           | 5713191568    |
            | 0620            | Jose      | SDET           | Male   | Testing Fundamentals    | 03/20/1997  | David      | 2027428888  | Alexa      | 2027428888  | Alexa        | Mother           | 2027428888    |
            | 0880            | Emilio    | SDET           | Male   | SDLC Methodologies      | 11/24/2000  | Martin     | 7037871234  | Maria      | 7037871234  | Martin       | Father           | 7037871234    |
            | 0510            | Alex      | Cyber Security | Male   | Networking Fundamentals | 05/14/1992  | Miguel     | 1112223333  | Noelle     | 1112223333  | Noelle       | Mother           | 1112223333    |
            | 1001            | Michelle  | Cyber Security | Female | Linux Fundamentals      | 02/08/1995  | Nacho      | 2223334444  | Elizabeth  | 2223334444  | Nacho        | Father           | 2223334444    |