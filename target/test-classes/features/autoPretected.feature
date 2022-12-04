#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



    @auto
Feature: Auto Quote Validation

  Scenario: Auto quote test
    Given user navigate to homepage
    And user select auto
    Then user input zipcode
    And click on get started
    Then select car company
    Then select vehicle year
    Then select vehicle model
    Then select purpose of use
    Then select annual milage
    Then select coverage level
    Then select ownership of vehicle
   
 
    Then select No for any other vehicle addition
    Then select current insurance coverage
    And click on first continue  button
    Then select acitve license
    And selcet tickets or claims
    And selcet Fill SR
    And click on second contiune button
    Then select homeowner or not
    And select married or unmarried
    And select gender 
    
    And click on third contiune button
    Then select education level
    And select credit score
    And click on fourth contiune button
    Then click on month 
    And click on day
    And click on Year
    And click on fifth contiune button
    
     And input the first name
    And input the last name
    And click on Continue
    Then user will be in about your contact Information
    And input the street address
    And input the email address
    And input the phone number
    And click to view the rates