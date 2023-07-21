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
Feature: View information about housing
  
#don't forget to add a scanario for if he's a student 
  @tag1
  Scenario: no available info not student
    Given he chose a housing 'number'
    And he is not a 'student'
    
    When housing 'number' is invalid

    Then show error message
     And show options for going back
    
    @tag2
  Scenario:  available info not student
    Given he chose a housing 'number'
    And he is not a 'student'
    When housing 'number' is valid

    Then show information about the housing
    And show options for booking or going back
    
     @tag3
  Scenario: no available info student
    Given he chose a housing 'number'
    And he is a 'student'
    
     When housing 'number' is invalid
      

    Then show error message
     And show options for going back
    
      @tag4
  Scenario: available info student
    Given he chose a housing 'number'
    And he is a 'student'
    
     When housing 'number' is valid

    Then show information about the housing
     And show options for booking or going back
   

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
