@regression @Reg_ESD_1_7 
Feature: Create draft of notice, save draft, edit draft, save draft, submit and create a notice, download and open notice.

Scenario: Create draft of notice, save draft, edit draft, save draft, submit and create a notice, download and open notice.
	Given I login to ESD
	Then I should be on Eligibility Support Staff Desktop Page
	When I type Birthdate as "01011990" on Eligibility Support Staff Desktop Page
	And I type First Name as "Susan" on Eligibility Support Staff Desktop Page
	And I type Last Name as "Griffith" on Eligibility Support Staff Desktop Page
	And I click Search button on Eligibility Support Staff Desktop Page
	And I click on First result in table
	And I click on Notices tab 
	And I click on Create Notice button
	Then I should be on Custom Notice modal
	When I type Notice Name as "Test" on Custom Notice modal
	And I type Notice content as "Test"
	And I select option as "Yes" for Add Barcode Page to Notice dropdown
	And I type Comment as "Test"
	And I click on Send button
	