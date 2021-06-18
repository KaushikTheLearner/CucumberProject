Feature: Application Login

Scenario: User able to login with valid credentials
Given User is on Login Page
When User enter valid username "Kaushik" and password "Kaushik@056"
And Clicks on submit option
Then User should be on Home page

Scenario: User able to login with invalid credentials
Given User is on Login Page
When User enter invalid username "-23DFSF" and password " 2113"
And Clicks on submit option
Then User should be on Home page

Scenario Outline: User able to login with multiple credentials
Given User is on Login Page in beginning
When User enter <username> and <password>
And Clicks on submit button
Then User should be logged in

Examples:
|username|password|
|abc     |123     |
|def     |456     |
|ghi     |789     |
|jkl     |012     |
|mno     |345     |