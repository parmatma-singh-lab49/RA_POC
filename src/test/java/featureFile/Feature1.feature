Feature: Demo test

@SmokeTest
Scenario Outline: GET API test
Given the valid endpoint to fetch users
When the request is send to server with page number as "<page>"
Then validate the response of first user record having email as "<emailID>"

Examples:
    |page|emailID |
    | 2  |michael.lawson@reqres.in|
    | 1  |george.bluth@reqres.in|

@SmokeTest1
Scenario Outline: POST API test
Given the valid endpoint with payload to create user
When the request is send to the server
Then the new user must be created with name as "<username>"

Examples:
    |username|
    | john  |
