 Feature: Free CRM Login Feature


#hardcoded  
#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters username and password
#Then user clicks on login button
#Then user is on home page


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#3When title of login page is Free CRM
#Then user enters "shivammauryauiet@gmail.com" and "Shivam@1423"
#Then user clicks on login button
#Then user is on home page



#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser


Examples:
	| username | password |
	| shivammauryauiet  | Shivam@1423 |
	|  tom     | test456  | 	
		