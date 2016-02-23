Feature: Creating a free browse account on shutterstock qa website

  Scenario: Create a free browse account
    Given user go to shutterstock qa website
    When user submit free browse signup form
      | Fields   			| Values                        									|
      | Username 	| shuttertest+5558488585        				|
      | Email    			| shuttertest+4564988956@mail.com 	|
      | Password 	| password                      								|
    Then user navigated to LIHP
    And user close the browser

  Scenario Outline: Create multiple free browse accounts
    Given user go to shutterstock qa website
    And user enter username:<username>, email:<email> and password:<password>
    And user agree with terms of service
    When user click on the create account button
    Then user navigated to LIHP
    And user close the browser

    Examples: 
      | username              				| email                          									| password |
      | shuttertest+565656996 | shuttertest+66956546@mail.com  	| password |
      | shuttertest+568965696 | shuttertest+689546546@mail.com 	| password |
      | shuttertest+568947676 | shuttertest+686694486@mail.com 	| password |
