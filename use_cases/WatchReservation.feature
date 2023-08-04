Feature: Watch Reservations

Scenario: Watching All Reservations
   Given the reservation system is empty
   When two reservations are added to the system
   Then the system should return all reservations


Scenario: Watching Reservations for a Specific User
    Given the reservation system has reservations for multiple users
    When reservations for a specific user are requested
    Then the system should return only the reservations for that user