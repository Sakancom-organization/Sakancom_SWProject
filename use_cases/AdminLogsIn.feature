@tag
Feature: Admin Logs In
  As an admin
  I want to log in
  So that I can access the system
@tag1
  Scenario: Admin logs in
    Given I am an admin
    When I enter my correct username and password
    Then I should be logged in
