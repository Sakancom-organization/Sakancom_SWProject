Feature: login

Scenario: admin can login
	Given the username is "eman42kh@gmail.com"
	And the password is "123456"
	Then the admin login succeeds
	
Scenario: admin has the wrongPassword
	Given the username is "eman42kh@gmail.com"
	And the password is "22222"
	Then the admin login fails