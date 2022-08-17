Feature: Fees Collection Module 

@feesAndCollection @Anzalla @Regression
Scenario: In the CTSMS Dashboard, Fees Collection module contains the following modules listed below: 

# Collect Fees, 
# Search Fees Payment
# Search Due Fees
# Fees Master
# Fees Group
# Fees Type
# Fees Discount
# Fees Carry Forward
# Fees Reminder

Given Chroma Tech Academy teacher/admin user is logged in to the CTSMS Dashboard 
When the user selects Fees Collection module 
Then the Fees Collection module contains "<Collect Fees>", "<Search Fees Payment>", "<Search Due Fees>", "<Fees Master>", "<Fees Group>", "<Fees Type>", "<Fees Discount>", "<Fees Carry Forward>", "<Fees Reminder>"


