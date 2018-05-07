@Login2
Feature: AdminLogin to HRM home page
In Order To Loginto Orange HRM
As a Admin with validUsername and Password
I want to EnterUserName, Password, click on Login Button to Access to the Application

Scenario: Positive- AdminLogin Successfully
Given Admin Navigateto HRM Login page 
When Admin Entervalid UseName and Password
And click on LogingButton
Then Admin will Land in Adminhome Page 