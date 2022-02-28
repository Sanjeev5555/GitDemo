Feature: Application Login

Scenario: Home Page Default Login 
Given User is on NetBanking landing Page
When User login into application with "Name" and "Password" and "User_Type"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home Page Default Login 
Given User is on NetBanking landing Page
When User login into application with "Kumar" and "67890" and "User_Type"
Then Home page is populated
And Cards are displayed "false"
