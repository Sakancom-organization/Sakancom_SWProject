@tag
Feature: Admin Views Owners Details
  As an admin
  I want to view all owners' details
  So that I can manage the owners effectively
@tag1
  Scenario: Admin views all owners' details
    Given I am a logged-in admin
    When I view all owners' details
    Then I should see the details of all owners
