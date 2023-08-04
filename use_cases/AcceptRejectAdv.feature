Feature: Advertisement housing

Scenario: Request Advertisement for Housing
    Given the dashboard owner is on the control panel
    When the dashboard owner presents a request to advertise a house with location "Rafedia" and monthly rent 2000 not inclusive of services
    Then the advertisement request should be successfully submitted

Scenario: Accept Advertisement Request
    Given the dashboard owner has received an advertisement request for a house with location "Rafedia" and monthly rent 2000 not inclusive of services
    When the dashboard owner accepts the advertisement request
    Then the house should be announced
    And the advertisement request should be removed from the list

Scenario: Reject Advertisement Request
    Given the dashboard owner has received an advertisement request for a house with location "Rafedia" and monthly rent 2000 not inclusive of services
    When the dashboard owner rejects the advertisement request
    Then the house should not be announced
    And the advertisement request should be removed from the list

Scenario: Show Advertisement Requests
    Given the dashboard owner has received advertisement requests
    When the dashboard owner views the list of advertisement requests
    Then all the advertisement requests should be displayed

Scenario: Show Announced Houses
    Given the dashboard owner has announced multiple houses
    When the dashboard owner views the list of announced houses
    Then all the announced houses should be displayed

Scenario: Show Reserved Houses
    Given the dashboard owner has announced houses
    And some of them have been reserved by tenants
    When the dashboard owner views the list of reserved houses
    Then the list should include the reserved houses
    And the list should not include the non reserved houses