@regression @Multi_NFA 
Feature: Dependent_NFA 

Scenario: Dependent_NFA 
	Given I navigate to Login Page 
	When I click on Create One link 
	Then I should be on Create an account Page 
	When I select state as "Delaware" 
	And I type First Name as "Susan" 
	And I type Last Name as "Griffith" 
	And I type email ID 
	And I type Password as "Test123#" 
	And I Retype Password as "Test123#" 
	And I select First Question as "What is your favorite radio station?" 
	And I type First answer as "station" 
	And I select Second Question as "What was your favorite toy when you were a child?" 
	And I type Second answer as "child" 
	And I select Third Question as "What is your favorite cuisine?" 
	And I type Third answer as "cuisine" 
	And I accecpt Privacy, Terms & Conditions 
	And I click on Create Account button 
	And I Verify tehe created account 
	Then I should be on Account Confirmation Page 
	When I click on Continue to login button 
	Then I should be on Login Page 
	When I type UserName 
	And I type Password as "Test123#" on Login Page 
	And I click on Login button 
	Then I should be on MarketPlace Page 
	When I click on User Profile option 
	And I click on My Profile Option 
	Then I should be on My Profile Page 
	When I click on Verify My Profile 
	Then I should be on Verify Your Identity Page 
	When I click on Get Started button 
	Then I should be on Contact Information Page 
	When I type Date of Birth as "01011990" 
	And I type Street Address as "34 Elsmere Blvd" 
	And I type City as "Wilmington" 
	And I type Zip Code as "19805" 
	And I type Phone Number as "2025547416" 
	And I select Type of Phone as "Home" 
	And I click on Continue Button 
	
	Then I should be on Identity Questions Page 
	When I answer all questions with answer as "NONE OF THE ABOVE/DOES NOT APPLY" 
	And I click on Continue button Identity Questions Page 
	
	Then I should be on Identity Verified Page 
	When I click on Continue button Identity Verified Page 
	
	Then I should be on My Profile Page 
	When I click on My Applications & Coverage option 
	
	Then I should be on My Applications & Coverage Page 
	When I select Year as "2019" on My Applications & Coverage Page 
	And I select state as "DE" on My Applications & Coverage Page 
	And I click on Apply & Review Button 
	Then I should be on Start Application page 
	When I click on Next button on Start Application page 
	And I accpect Terms & Agreement on Start Application page 
	And I click Take Me To Application Button 
	And I select Maritial Status as "married" 
	And I select TaxDependents as "0"
	And I select Apply Coverage for "Me"
	And I select Apply Coverage for "My Spouse" 
	And I select Income as "MoreThan69000" 
	And I click Continue Button on Start Application page 
	
	Then I should be on Tell us about yourself Page 
	When I type month as "01" 
	And I type Day as "01" 
	And I type year as "1990" 
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
	When I click Add a person who needs coverage button 
	Then I should be on Add a person who needs health coverage Page 
	When I type First Name as "Spouse" on Add Dependent Page 
	And I type Last Name as "Griffith" on Add Dependent Page 
	And I type month as "01" on Add Dependent Page 
	And I type day as "01" on Add Dependent Page 
	And I type year as "1985" on Add Dependent Page 
	And I select gender as "Male" on Add Dependent Page 
	And I select option as "Spouse" for relationship drop down on Add Dependent Page 
	And I click Save button on Add Dependent Page 
	Then I should be on Who needs health coverage? Page 
	When I click Save button on Who needs health coverage? Page
	
	Then I should be on Spouse's address page
	When I select address same as user
	And I click Save button on Spouse's address page
	
	Then I should be on Review everyone's address Page 
	When I click Save button on Review everyone's address Page 
	Then I Should be on Household information 
	When I select option as "None of these apply to the people in the household" on Household information 
	And I click Save button on Household information 
	Then I Should be on User Information Page 
	When I click Save button on User Information Page 
	
	Then I Should be on Spouse Information Page 
	When I click Save button on User Information Page 
	
	Then I Should be on User Information Page 
	And I select Susan doesn't have an SSN option 
	And I click Save button on User Information Page 
	
	Then I Should be on Spouse Information Page 
	And I select Spouse doesn't have an SSN option 
	And I click Save button on User Information Page 
	
	
	Then I Should be on Citizenship & Immigration Status Page 
	When I Select option as "Yes" 
	And I click Save button on Citizenship & Immigration Status Page 
	
	Then I Should be on Citizenship Page 
	When I Select option as "None of these people" on Citizenship Page 
	And I click Save button on Citizenship Page 
	
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
	When I type month as "09" on User's incarceration release Page
	When I type day as "15" on User's incarceration release Page
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
	Then I should see the Status as "You're eligible to enroll in Marketplace coverage"
	When I should click on Start Button
	Then I should see the Status as "Report tobacco use"
	When I select option as "None" for tobacco use
	And I click Save button
	Then I should see the Status as "See if your doctors, facilities & drugs are covered"
	When I click on Skip button
	Then I should see the Status as "Health plan groups for your household"
	When I click on Change Groups button
	And I select "Move To New Group" for Spouse
	And I select "Group 1" for Spouse
	And I click Save button
	And I click View Plans Button
	Then I should see Help comparing plans modal
	When I click on Close button
	Then I should see the Status as "Pick a health plan"
	When I choose Initial two plans to compare
	Then I click Compare 2 Plans button
	Then I should see the Status as "Compare plans"
	And I click on Enroll button for First plan on Compare plan
	Then I should see the Status as "Health plan selection"
	When I click on Select this plan button
	Then I should see the Status as "Review your health plan choices"
	When I select option as "No, complete health plan enrollment." for dentail plan
	And I click on Continue button
	Then I should see the Status as "You're almost done" 	
	
	When I click on Menu button 
	And I click on My Applications & Coverage menu option 
	
	Then I should be on My Applications & Coverage Page 
	When I click on Individual & Family Coverage link 
	
	Then I should be on My Account Page 
	When I click on Report a life change option 
	
	Then I should be on Report a life change Page 
	When I click on Report a life change button 
	Then I should see Have you had any changes like these? modal 
	When I select Report a change in my household's income, size, address, or other information option 
	And I click Continue button on Have you had any changes like these? modal 
	And I accpect Terms & Agreement on Start Application page 
	And I click Take Me To Application Button 
	And I select Update a person's information or add a new person option 
	And I click Update my application button 
		
	And I select Maritial Status as "married" 
	And I select TaxDependents as "0"
	And I select Apply Coverage for "Me"
	And I select Apply Coverage for "My Spouse" 
	And I select Income as "MoreThan69000" 
	And I click Continue Button on Start Application page 
	
	Then I should be on Tell us about yourself Page
	And I type FirstName as "Susan Change of Name" 
	When I type month as "01" 
	And I type Day as "01" 
	And I type year as "1990" 
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
	
	Then I should be on Spouse's address page
	When I select address same as user
	And I click Save button on Spouse's address page
	
	Then I should be on Review everyone's address Page 
	When I click Save button on Review everyone's address Page 
	Then I Should be on Household information 
	When I select option as "None of these apply to the people in the household" on Household information 
	And I click Save button on Household information 
	Then I Should be on User Information Page after name update
	When I click Save button on User Information Page 
	
	Then I Should be on Spouse Information Page 
	When I click Save button on User Information Page 
	
	Then I Should be on User Information Page after name update 
	And I select Susan doesn't have an SSN option 
	And I click Save button on User Information Page 
	
	Then I Should be on Spouse Information Page 
	And I select Spouse doesn't have an SSN option 
	And I click Save button on User Information Page 
	
	
	Then I Should be on Citizenship & Immigration Status Page 
	When I Select option as "Yes" 
	And I click Save button on Citizenship & Immigration Status Page 
	
	Then I Should be on Citizenship Page 
	And I click Save button on Citizenship Page 
	
	Then I should be on Recent coverage changes Page 
	When I click Save button on Recent coverage changes Page 
	
	Then I should be on Upcoming coverage changes Page 
	When I click Save button on Upcoming coverage changes Page 
		
	Then I should be on Life changes Page 
	When I select option as "Was released from incarceration (detention or jail)" on Life changes Page 
	When I click Save button on Life changes Page 
	Then I should be on Incarceration release Page 

	When I click Save button on Incarceration release Page
	
	Then I should be on User's incarceration release Page after name change
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
	Then I should see the Status as "You're eligible to enroll in Marketplace coverage"
	When I should click on Start Button
	Then I should see the Status as "See if your doctors, facilities & drugs are covered"
	When I click on Skip button
	Then I should see the Status as "Health plan groups for your household"
	When I click on Change Groups button
	And I select "Group 1" for Spouse
	And I click Save button
	And I click View Plans Button
	Then I should see the Status as "Pick a health plan"
	When I choose Initial two plans to compare
	Then I click Compare 2 Plans button
	Then I should see the Status as "Compare plans"
	And I click on Enroll button for First plan on Compare plan
	Then I should see the Status as "Health plan selection"
	When I click on Select this plan button
	Then I should see the Status as "Review your health plan choices"
	When I select option as "No, complete health plan enrollment." for dentail plan
	And I click on Continue button
	Then I should see the Status as "You're almost done" 
	
	