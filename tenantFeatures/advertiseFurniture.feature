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
@tag
Feature: Advertise housing
 

  @tag1
  Scenario: ask him to upload
    Given he chose 2 on the entrance menu
    
    When he entres the 'description' 
    And he entres the 'price'
    And he uploades the 'images'
    
    
    Then add the furniture to the data base to advertise it

Scenario: show available advertisments 
    Given he chose 2 on the entrance menu
    
    When he entres the 'description' 
    And he entres the 'price'
    And he uploades the 'images'
    
    
    Then add the furniture to the data base to advertise it

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
