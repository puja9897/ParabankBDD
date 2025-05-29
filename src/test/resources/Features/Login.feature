Feature: User login on Parabank Site.

Scenario: Successful user login on Parabank Site.
Given User is in login page
When User enter valid username and password
And click on log in button
Then User should be logged in successfully