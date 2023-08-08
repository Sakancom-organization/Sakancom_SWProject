@tag
Feature: Admin Updates Owner Details
  As an admin
  I want to update an owner's details
  So that the system has the most up-to-date information
@tag1
  Scenario: Admin updates owner details
    Given I am a logged-in admin
    And there is an existing owner
    When I update the owner's details
    Then the owner's details should be updated in the system
