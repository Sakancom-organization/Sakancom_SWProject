Feature: Watch Reservation
Description:Only admin can watch a reservation 

Background: The System has these reservations
	Given that this reservations are valid in the system
	|0|APARTMENT1|50|
	|1|APARTMENT2|40|
	|2|APARTMENT3|30|
  |3|HOME1|30|
  |4|HOME2|13|
  |5|PAVILION|100|

Scenario: reservation watch failed
When admin tries to watch for id "12"
Then watch failed

Scenario: reservation watch success
When admin tries to watch for id "1"
Then watch success