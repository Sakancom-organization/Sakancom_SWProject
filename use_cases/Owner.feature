Feature: Owner powers
Description:Only owner can do these things

Background: The System has these owner powers
	Given these photos are valid in the system
  |0|APARTMENT1 PHOTO|                   
	|1|APARTMENT2 PHOTO|
	|2|APARTMENT3 PHOTO|       
  |3|HOME1 PHOTO|                              
  |4|HOME2 PHOTO|                             
  |5|PAVILION PHOTO|                                   

Scenario: photo is already valid
Given there is a photo with id "4",name "HOME2 PHOTO"
When owner tries to add photo
Then add photo failed

Scenario: photo is not valid
Given there is a photo with id "6",name "PHOTO6" 
When owner tries to add photo
Then add photo success



	Given that this services are valid in the system
	|0|Parking|50|
	|1|Elevator|40|
	|2|Electricity and Water|30|
  |3|Taxes|30|
  |4|FundamentalReforms|13|
  |5|Park|100|

Scenario: service add failed
When owner tries to add for id "5"
Then add failed

Scenario: service add success
When owner tries to add for id "6"
Then add success



Given these address and information are valid in the system
      |1212122|ahmad khaled|sufian street|                              

Scenario: address and information are already valid
Given there is an owner with id "1212122",name "ahmad khaled", address "sufian street"
When owner tries to add these contact information
Then add contact information failed

Scenario: address and information are not valid
Given there is an owner with id "1313133",name "ali saeed", address "ramallah street" 
When owner tries to add these contact information
Then add contact information success



Given that these monthly rents are valid in the system
  |0|2000|             
	|1|1900|
	|2|1600|   
  |3|2500|                          
  |4|2400|                           
  |5|1500|                               

Scenario: monthly rent is already valid
Given there is a rent with id "4",value "2400"
When owner tries to add monthly rent
Then add monthly rent failed

Scenario: monthly rent is not valid
Given there is a rent with id "6",value "1700" 
When owner tries to add monthly rent
Then add monthly rent success




Given these contact information are valid in the system
  |ahmad@gmail.com|0598516563|                                   

Scenario: contact information are already valid
Given there is an owner with id "ahmad@gmail.com",phone "0598516563"
When owner tries to add these contact information
Then add contact information failed

Scenario: contact information is not valid
Given there is an owner with id "ali@gmail.com",phone "0598888888" 
When owner tries to add these contact information
Then add contact information success