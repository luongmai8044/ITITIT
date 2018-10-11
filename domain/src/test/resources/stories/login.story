Scenario: login the application with invalid data
Given user name and password are empty
When user do login system with data empty
Then an error is throw
Given user name and password are valid
When user do login system with valid data
Then user login successful
