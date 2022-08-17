Feature: Class and Sections

    @classAndSections @Anzalla @Smoke 
    Scenario: Two classes, SDET and Cyber Security should be displayed with sections:

        #SDET:
        #-Testing Fundamentals
        #-SDLC Methodologies
        #-Selenium Test Automation
        #-Cucumber Fundamentals
        #-API Testing
        #-Git/GitHub
        #-Java 11 for Cool People
        #-Mobile Test Automation
        #-Accessibility Testing
        #-Database Testing

        #Cyber Security:
        #-Networking Fundamentals
        #-Linux Fundamentals
        #-CIA Triad
        #-Penetration Testing/Ethical Hacking

        Given Chroma Tech Academy teacher/admin user is logged in to the CTSMS Dashboard
        When the user selects Academics module
        And the user selects Class
        Then the Class for Cyber Security will display the following Sections:
            """
            Networking Fundamentals
            Linux Fundamentals
            CIA Triad
            Penetration Testing/Ethical Hacking
            """
        And the Class for SDET will display the following Sections:
            """
            Testing Fundamentals
            SDLC Methodologies
            Selenium Test Automation
            Cucumber Fundamentals
            API Testing
            Git/GitHub
            Java 11 for Cool People
            Mobile Test Automation
            Accessibility Testing
            Database Testing
            """


