Feature: Dashboard Owner Control Panel

Scenario: Show housing information
    Given a housing with the name "hs"
    When the dashboard owner opens the control panel
    Then the housing name "hs" should be displayed

Scenario: Show the number of tenants
    Given a housing with no tenants
    When the dashboard owner opens the control panel
    Then the total number of tenants displayed should be 0

Scenario: Show the number of floors
    Given a housing with 2 floors
    When the dashboard owner opens the control panel
    Then the number of floors displayed should be 2

Scenario: Show apartments for a floor
    Given a housing with 2 floors and apartments on each floor
    When the dashboard owner selects floor 2
    Then the apartments for floor 2 should be displayed

Scenario: Show apartment information
    Given a housing with 2 floors and apartments on each floor
    When the dashboard owner selects floor 1 and apartment 200
    Then the apartment information should be displayed
    And the apartment number should be 200
    And the number of bedrooms should be 2
    And the number of bathrooms should be 1
    And the apartment should have a balcony

Scenario: Show tenant information
    Given a housing with 2 floors and apartments on each floor
    And apartment 201 on floor 2 has tenants "Masa Ahmad" and "Farah Khaled" with contact information
      | Tenant        | Contact                |
      | Masa Ahmad    | masaAh@gmail.com       |
      | Farah Khaled  | farahKh@gmail.com      |
    When the dashboard owner selects floor 2 and apartment 400
    Then the tenant information for apartment 400 should be displayed
    And the number of tenants should be 2
    And the tenants should contain "Masa Ahmad" and "Farah Khaled"
    And their contact information should be correct

Scenario: No tenants in the selected apartment
    Given a housing with 2 floors and apartments on each floor
    And apartment 500 on floor 2 has no tenants
    When the dashboard owner selects floor 2 and apartment 500
    Then a message should be displayed that there are no tenants in this apartment