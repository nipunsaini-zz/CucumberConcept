Feature: Creating a free browse account on shutterstock qa website

  Scenario: Create a free browse account
    Given user go to shutterstock qa website
    When user submit free browse signup form
      | Fields   | Values                       |
      | Username | shuttertest+5556558585         |
      | Email    | shuttertest+45656556@mail.com |
      | Password | password                     |
    Then user navigated to LIHP
