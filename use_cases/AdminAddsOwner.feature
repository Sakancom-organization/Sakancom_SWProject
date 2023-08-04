@tag
Feature: Admin Adds Owner
  As an admin
  I want to add a new owner
  So that the owner can manage accommodations
@tag1
  Scenario: Admin adds a new owner
    Given I am a logged-in admin
    When I add a new owner with details
    Then the new owner should be added to the system
