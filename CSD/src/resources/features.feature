Feature: Confirmation

Scenario: validate user

Given login user  page
When the user enters the details and clicks "submit"
Then "validate" the user details

Scenario: 2nd scenario
Given Confirmation page
When on click "submit"
Then  show "confirmation success"  or "confirmation failure" msg

Scenario: 3rd scenario
Given Confirmation cancellation page 
When on click "cancel"
Then show "ride cancelled" msg

Scenario: 4th scenario

Given Confirmation page success
When on click "submit"
Then driver receives the guest user details and pick up the guest user

Scenario: 5th scenario

Given guest user details
When driver "receives user details"
Then notify driver