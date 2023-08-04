@tag
Feature: Admin Logs Out
  As an admin
  I want to log out
  So that I can secure my account
@tag1
  Scenario: Admin logs out
    Given I am a logged-in admin
    When I log out
    Then I should be logged out
