@Smoke
Feature: Login feature testing 
	Description : note about your requirement
#	Background: common steps
	
@TC_001  #@ CUCUMBER TAG, # USE FOR COMMENT OUT IN CUCUMBER
Scenario: As a PhpTravel user , i can login successfully with valid user name and password 
	Given Open the browser 
	When  Send URL 
	And Click My Account 
	And Click SignUp btn 
	And Send valid firstname 
	And Send valid lastname 
	And Send valid mobilenumber 
	And Send valid email
	And Send valid password
	And Send valid confirmPassword   
	And Click submit btn 
	Then  Validate login success or fail 
	When Close browser
	
	
	
	
