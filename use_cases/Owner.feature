Feature: Announcing Houses

Scenario: Announce a house with all information
    Given the dashboard owner is on the control panel
    When the dashboard owner chooses to announce a house
    And adds photos of the house
    And provides the location and information about the house
    And specifies available services
    And sets the monthly rent inclusive of electricity and water
    Then the house should be successfully announced

Scenario: Announce a house with minimum information
    Given the dashboard owner is on the control panel
    When the dashboard owner chooses to announce a house
    And provides only the compulsory information
    Then the house should be successfully announced

Scenario: View the list of announced houses
    Given the dashboard owner has announced multiple houses
    When the dashboard owner shows the list of announced houses
    Then all the announced houses should be displayed

Scenario: View details of an announced house
    Given the dashboard owner has announced a house with ID "44444"
    When the dashboard owner shows the details of "44444"
    Then all the information about the house should be displayed
    And the photos, location, services, and monthly rent information should be true

Scenario: Edit an announced house
    Given the dashboard owner has announced a house with ID "88888"
    When the dashboard owner edits the details of "88888"
    And updates the photos, location, services, and monthly rent information
    Then the house with ID "88888" should be modified with the new information

Scenario: Delete an announced house
    Given the dashboard owner has announced a house with ID "11111"
    When the dashboard owner chooses to delete "11111"
    Then the residence with ID "11111" should be deleted from the list of announced houses