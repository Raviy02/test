@regression @SAML
Feature: SAML

Scenario: SAML
	Given I am on CCR landing page
	When I type SAML Response
	And I click on Submit button
	Then I should be on Application For Individuals & Families Page
	When I select year as "2019" on Application For Individuals & Families Page
	And I select state as "DE" on Application For Individuals & Families Page
	And I click on Apply or Renew Button on Application For Individuals & Families Page
	Then I should be on Start Application page 
	When I click on Next button on Start Application page 
	And I accpect Terms & Agreement on Start Application page 
	And I click Take Me To Application Button 
	And I select Maritial Status as "single" 
	And I select TaxDependents as "0" 
	And I select Income as "Below51000" 
	And I select Help for Coverage as "Yes" 
	And I click Continue Button on Start Application page 
	Then I should be on Tell us about yourself Page
	When I type FirstName as "Susan"
	And I type Last Name as "Griffith" on Tell us about yourself Page
	When I type month as "01" 
	And I type Day as "01" 
	And I type year as "1987" 
	And I select sex as "Female" 
	And I click Save button on Tell us about yourself Page 
	Then I should be on Home address Page 
	When I enter Street Address as "34 Elsmere Blvd" 
	And  I enter City as "Wilmington" 
	And I enter ZipCode as "19805" 
	And I click Save button on Home address Page 
	And I select USPS Address 
	And I click Save button on Home address Page 
	Then I should be on Mailing Address Page
	When I Accept mailing address
	And I click Save button on Mailing Address Page
	Then I should be on Contact information Page
	When I type Phone Number as "2025547416" on Contact information Page
	And I select Phone type as "Home"
	And I click Save button on Contact information Page
	Then I should be on Preferred Language Page
	When I select Preferred written language as "English"
	And I select Preferred spoken language as "English"
	And I click Save button on Preferred Language Page
	Then I should be on Contact preferences Page
	When I Select Contact preference as "Paper"
	And I click Save button on Contact preferences Page
	Then I should be on Application help Page
	When I select the option as "No"
	And I click Save button on Application help Page
	Then I should be on Who needs health coverage? Page
	When I click Save button on Who needs health coverage? Page
	Then I Should be on Marital status Page
	When I select Maritial status as "single" on Marital status Page
	And I click Save button on Marital status Page
	Then I Should be on Tax relationships
	Then I should see First Question as "Will Susan file a 2019 federal income tax return?"
	When I answer First question as "Yes"
	Then I should see Second Question as "Will Susan claim any dependents on their 2019 federal tax return?"
	When I answer Second question as "No"
	Then I should see Third Question as "Will someone else claim Susan as a dependent on their 2019 federal tax return?"
	When I answer Third question as "No"
	And I click Save button on Tax relationships
	Then I Should be on Parents & caretaker relatives Page
	When I select dependents as "None of these people"
	And I click Save button on Parents & caretaker relatives Page
	Then I Should be on Household information
	When I select option as "None of these apply to the people in the household" on Household information
	And I click Save button on Household information
	Then I Should be on User Information Page
	When I click Save button on User Information Page
	Then I Should be on User Information Page
	And I select Susan doesn't have an SSN option
	And I click Save button on User Information Page
	Then I Should be on Citizenship & Immigration Status Page
	When I Select option as "Yes"
	And I click Save button on Citizenship & Immigration Status Page
	Then I Should be on User Citizenship Page
	When I select option as "No" on User Citizenship Page
	And I click Save button on User Citizenship Page
	Then I Should be on Disabilities & help with activities Page
	When I click Save button on Disabilities & help with activities Page
	Then I Should be on Medicaid or CHIP denial Page
	When I click Save button on Medicaid or CHIP denial Page
	Then I Should be on Changes in coverage Page
	When I click Save button on Changes in coverage Page
	Then I Should be on Household income Page
	When I select option as "User"
	And I click Save button on Household income Page
	Then I should be on Household expenses Page
	When I click Save button on Household expenses Page
	Then I should be on User Income Page
	When I select type of income as "Job (like salary, wages, commissions, or tips)" on User Income Page
	And I type Employer Name as "Accenture" on User Income Page
	And I select salary cycle as "Yearly" on User Income Page
	And I type salary as "80000" on User Income Page
	And I type phone number as "2025547416" on User Income Page
	And I click Save button on User Income Page
	Then I should be on Review User Income & Expenses Page
	When I accept User's expected income on Review User Income & Expenses Page
	And I click Save button on Review User Income & Expenses Page
	Then I should be on Recent coverage changes Page
	When I click Save button on Recent coverage changes Page
	Then I should be on Upcoming coverage changes Page
	When I click Save button on Upcoming coverage changes Page
	Then I should be on Life changes Page
	When I select option as "Was released from incarceration (detention or jail)" on Life changes Page
	When I click Save button on Life changes Page
	Then I should be on Incarceration release Page
	When I select option as "User" on Incarceration release Page
	When I click Save button on Incarceration release Page
	Then I should be on User's incarceration release Page
	When I type month as "08" on User's incarceration release Page
	When I type day as "01" on User's incarceration release Page
	When I type year as "2019" on User's incarceration release Page
	When I click Save button on User's incarceration release Page
	Then I should be on Review your application Page
	When I click Save button on Review your application Page
	Then I should be on Read & agree to these statements Page
	When I accepct All Agreement on Read & agree to these statements Page
	When I click Save button on Read & agree to these statements Page
	Then I should be on Sign & submit Page
	When I accept agreement on Sign & submit Page
	And I type Name as "Susan Griffith" on Sign & submit Page
	And I click Save button on Sign & submit Page
	Then I should be on Individual Application - Eligibility determination Page
	When I click VIEW ELIGIBILITY NOTICE (PDF) button
	Then I should see Continue to enrollment button
	When I click Continue to enrollment button