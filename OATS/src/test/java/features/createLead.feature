Feature: Create a lead
Scenario Outline: positive flow to create a lead
And enter the user name as Democsr
And enter the password as crmsfa
And click on the login button
And click on the CRMSFA link
And click on Create Lead
And enter the companyname as <cname>
And enter the firstname as <fname>
And enter the lastname as <lname>
When click on the create Lead
Then Lead should be created succesfully

	Examples:
		| cname | fname | lname |
		| Vestass | Karthick|Murugiah |
		| Amazon | Karthick|Murugiah |

