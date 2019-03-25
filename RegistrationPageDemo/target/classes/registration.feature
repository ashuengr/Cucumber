@execute
Feature: Registration Feature
this feature helps user to registration

Scenario: user is trying to register using invalid set of details

Given User is accessng Registration Page on Browser

When User is trying to submit data without entering 'User Id'
Then 'User Id should not be empty / length be between 5 to 12' alert message should be displayed

When User is trying to submit data without entering 'password'
Then 'Password should not be empty / length be between 7 to 12' alert message should be displayed

When User is trying to submit data without entering 'username'
Then 'Name should not be empty and must have alphabet characters only' alert message should be displayed

When User is trying to submit data without entering 'address'
Then 'User address must have alphanumeric characters only' alert message should be displayed

When User is trying to submit data without entering 'zipCode'
Then 'ZIP code must have numeric characters only' alert message should be displayed

When User is trying to submit data without entering 'email'
Then 'You have entered an invalid email address!' alert message should be displayed

When User is trying to submit data without entering 'country'
Then 'Select your country from the list' alert message should be displayed

When User is trying to submit data without entering 'gender'
Then 'Press Select gender' alert message should be displayed


Scenario: User is trying to register using valid set of details
Given User is accessing RegistrationPage on Browser
When User is trying to submit request after entering valid set of information
Then 'Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile' alert message should be displayed