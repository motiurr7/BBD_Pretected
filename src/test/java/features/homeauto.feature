@regression
Feature: Auto Quote Validation New

  
  Scenario: Auto quote test
    Given user navigate to homepageP
    And user select auto
    Given user input zipcode
    And click get started
    Then user will be in details

    @smoke
  Scenario: Home quote test
    Given user navigate to homepageP
    And user select home
    Given user input zipcode
    And click get started
    Then user will be in details