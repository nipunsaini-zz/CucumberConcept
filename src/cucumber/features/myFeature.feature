Feature: Proof of concept that my framework works

  Scenario: My first test
    Given user go to shutterstock qa website
    When user enter search keyword in search bar
    And user click on the search button
    Then user is navigated to cat.mhtml page
    And user close the browser
    
 Scenario: Check the title of the footage site
 	Given user go to shutterstock qa website
 	When user click on link "FOOTAGE"
 	Then check the title should be "Stock Footage Video, Royalty-Free HD, 4K - Shutterstock"
 	And user close the browser

 Scenario: Check the title of the music site
 	Given user go to shutterstock qa website
 	When user click on link "MUSIC"
 	Then check the title should be "Royalty Free Music - Shutterstock Music"
 	And user close the browser
