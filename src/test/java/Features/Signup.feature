Feature: User Signup

Background:
Given User is on LoginPage
When User clicks to clear cookies
Then Cookies should get cleared

Scenario: User able to signup with valid credentials
Given User is on Signup Page
When User enter the following valid credentials
|Kaushik|Kaushik@056|kaushik@gmail.com|8850232516|Kankarbagh,patna|
And Clicks on submit option
Then SignedUp Successfully message should be displayed

#Example of Datatable in step 11