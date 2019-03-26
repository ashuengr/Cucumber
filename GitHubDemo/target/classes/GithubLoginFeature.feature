@execute
Feature: User Login
Scenario: By clicking on login link user will enter his/her username and password 
    Given User is on main page www.github.com
    When user gives incorrect Username and incorrect Password
    Then User should be redirected to the same page with error: Username or password is incorrect
Scenario: By clicking on login link user will enter his/her username and password correctly

Given User is on main page www.github.com
When user gives correct details
Then A page should return with index page showing details of user
    
