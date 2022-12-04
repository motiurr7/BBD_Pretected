@regression
Feature: Auto Quote Validation New

  
  Scenario: Auto quote test
    Given user navigate to homepageP
    And user select auto
    Given user input zipcode
    And click get started
    Then user will be in details

@smoke
#Feature: Home Quote Validation New

  Scenario: Auto quote test 2
    Given user navigate to homepageP
    And user select auto
    Given user input zipcode
    And click get started
    Then user will be in details