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
Feature: Travel Insurance

  Scenario: Selection of destination page
    Given Navigate to travel insurance page
    When click on any european country as destination (country="Germany")
    And click on next and navigate to Date page
    And select the Date and click on Next
    And select the number of travellers and enter the age and click on next
    And verify your Medical History and click on next(condition="NO")
    And Enter your Mobile Number
    And click on View plans and navigate to the plans page
    Then display three lowest international  travel insurance plan
