@tag
Feature: Admin Removes Owner
  As an admin
  I want to remove an owner
  So that the owner is no longer part of the system
@tag1
  Scenario: Admin removes an owner
    Given I am a logged-in admin
    And there is an existing owner
    When I remove the owner
    Then the owner should be removed from the system
