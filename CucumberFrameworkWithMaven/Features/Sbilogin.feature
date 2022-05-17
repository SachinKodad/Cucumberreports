Feature: Sbi Login

Scenario: Verify Login functionality of Sbi by entering invalid username and password

Given :User is on sbi login
When :user click on proceed to login
Then :All controls on login page should be visible
Then :User enters username and password
And  : User clicks on login button
Then :Validate user is logged in 