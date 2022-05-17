Feature: Login Functionality 

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working

@sanity
Scenario Outline: verify Login Functionality by entering correct username and correct password 

Given user navigates to orange hrm
When user validates all login  controls are visible
Then user enters correct username "<username>"
Then user enters correct password "<password>"
And Click on login button

Then Application should display login  successful
Examples:
|username|password|
|Admin|admin123|

@sanity
Scenario Outline: verify Login Functionality by entering Incorrect username and Incorrect password 

Given user navigates to orange hrm
When user validates all login  controls are visible
Then user enters Incorrect username "<username>" 
Then user enters Incorrect password "<password>"
And Click on login button
Then Application should display login  Unsuccessful

Examples:

|username|password|
|Adm|adm|

@Regression
Scenario Outline: verify Login Functionality by entering Incorrect username and Incorrect password 

Given user navigates to orange hrm
When user validates all login  controls are visible
Then user enters Incorrect username "<username>" 
Then user enters Incorrect password "<password>"
And Click on login button
Then Application should display login  Unsuccessful

Examples:

|username|password|
|Admin*****|adm|
