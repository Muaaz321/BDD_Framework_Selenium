Feature: Home page feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|

Scenario: Home page title
Given user is on Home page
When user gets the title of the page
Then page title should be "OrangeHRM"


Scenario: Home page section count
Given user is on Home page
Then user gets accounts section
|Assign Leave|
|Leave List  |
|Timesheets  |
|Apply Leave |
|My Leave    |
|My Timesheet|
And home section count should be 6