Feature: Report


Background: The System has registered tenants
	Given that this tenants are registered in the system
	|111|ahmad fares|ahmadFares@gmail.com|5|0599773638|nablus|
  |222|leen ahmad|leen@gmail.com|2|0595721772|ramallah|
  |333|tala khaled|talaKh@gmail.com|1|0593020265|nablus|
  
  And  these houses are valid in the system 
  |0|CARPET minimum than 9|15|
	|1|CARPET greater than 9 and smaller than 16|20|
	|2|CARPET greater than 16|30|
  |3|SINGLECOVER|13|
  |4|COUPLECOVER|20|
  |5|CURTAIN|8|
  
  And that this owners are registered in the system
	|123|noor ali|0598937949|nablus|true|
  |113|maher ahmad|0599894568|nablus|true|
  |223|ali khaled|059378568|ramallah|true|
  |445|deena ahmad|059998768|ramallah|false|
  
Scenario: Print report 
When admin tries to show the report 
Then report will display 