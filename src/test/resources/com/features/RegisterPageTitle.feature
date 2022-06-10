Feature: Register Page Title

Scenario Outline: Validating the title of register page 
Given User is on dietician website
When User lands on register page  
Then user should see the title of the page as "Register"  