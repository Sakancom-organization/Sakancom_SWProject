Feature: Add or Delete Advertise
Description:Only admin can add or delete advertise

Background: The System has these advertises
	Given these advertises are valid in the system
  |0|ApartmentAD|50|
	|1|ApartmentAD|40|
	|2|ApartmentAD|30|
  |3|HomeAD|30|
  |4|HomeAD|13|
  |5|PavilionAD|100|

Scenario: advertise is already valid
Given there is a advertise with id "4",name "HomeAD",price 13
When admin tries to add product
Then add advertise failed

Scenario: advertise is not valid
Given there is a advertise with id "6",name "ApartmentAD",price 70 
When admin tries to add advertise
Then add advertise success

  
Scenario: advertise deleted failed
Given that admin want to delete advertise that its id "7"
When admin tries to delete a advertise
Then advertise deleted failed

Scenario: advertise deleted success
Given that admin want to delete advertise that its id "5"
When admin tries to delete a advertise
Then advertise deleted successfully