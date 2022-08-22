Feature: Finding New Cars
  As a user I want to find new cars
  
  Background:
  Given user navigate to the website

  Scenario Outline: User finding a new car
    
    When user choose menu as new cars
    Then user clicks on find new cars
    And user search for <brand> car
    And user validate car title <brand>

    Examples: 
      | brand   |
      | Kia     |
      | Toyota  |
      | Hyundai |
      | Honda   |
