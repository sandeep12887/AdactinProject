@FeatureTag_1 
Feature: AdactIn Hotel Application 

@tc_1 @test 
Scenario Outline: TC-1.Verify user login with valid credentials 
	When user should launch the hotel reservation application 
	Given user should launch the hotel reservation application 
	When User should enter valid username '<username>' 
	And user should enter valid password "<password>" 
	Then User click the login button 
@tc_1 @test 
Scenario Outline: TC-1.Verify user login with valid credentials 
	When user should launch the hotel reservation application 
	Given user should launch the hotel reservation application 
	When User should enter valid username '<username>' 
	And user should enter valid password "<password>" 
	Then User click the login button 
@tc_2 @test 
Scenario Outline: TC-2.To verify whether the check-out date field accepts a 
	later date than checkin date
	When User should select the location "<location>" 
	Then User should select the hotel "<hotel>" 
	Then User should select the room type"<roomtype>" 
	Then User should select the no of rooms"<rooms>" 
	Then user should enter checkin date "<checkindate>" 
	Then user should enter the checkout date with day before in checkin"<checkoutdate>" 
	Then user should click the search button 
	Then  Verify that system gives an error saying check-in-date should not be later than check-out-date 
	Examples: 
		|location|hotel|roomtype|rooms|checkindate|checkoutdate|
		|Sydney|Hotel Creek|Standard|4|07/06/2019|05/06/2019|
		
	@tc_3 
	Scenario Outline:
	TC-3.To check if error is reported if check-out date field is in the past 
	
		When User should select the location "<location>" 
		Then User should select the hotel "<hotel>" 
		Then User should select the room type"<roomtype>" 
		Then User should select the no of rooms"<rooms>" 
		Then user should enter checkin date "<checkindate>" 
		Then user should enter the checkout date"<checkoutdate>" 
		Then user should click the search button 
		Then Verify that application throws error message 
		Examples: 
			|location|hotel|roomtype|rooms|checkindate|checkoutdate|
			|Sydney|Hotel Sunshine|Double|3|25/05/2019|27/05/2019|
			
		@tc_4 
		Scenario Outline:
		TC-4.To verify whether locations in Select Hotel page are displayed according 
			to the location selected in Search Hotel
 
			When User should select the location "<location>" 
			Then User should select the hotel "<hotel>" 
			Then User should select the room type"<roomtype>" 
			Then User should select the no of rooms"<rooms>" 
			Then user should enter checkin date "<checkindate>" 
			Then user should enter the checkout date"<checkoutdate>" 
			Then user should click no of adults "<adults>" 
			Then user should click on no of children "<children>" 
			Then user should click the search button 
			Examples: 
				|location|hotel|roomtype|rooms|checkindate|checkoutdate|adults|children|
				|Sydney|Hotel Sunshine|Double|3|25/05/2019|27/05/2019|2|3|
				
			@tc_5 
			Scenario Outline:
			TC-. To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* 
				no of rooms
 
				When User should select the location "<location>" 
				Then User should select the hotel "<hotel>" 
				Then User should select the room type"<roomtype>" 
				Then User should select the no of rooms"<rooms>" 
				Then user should enter checkin date "<checkindate>" 
				Then user should enter the checkout date"<checkoutdate>" 
				Then user should click no of adults "<adults>" 
				Then user should click on no of children "<children>" 
				Then user should click the search button 
				Then user should click the radio button 
				Then Verify that totalprice(excl.GST) is being calculated as price-per-night*noof-rooms*no-of-days 
				Then user should click the continue button 
				Examples: 
					|location|hotel|roomtype|rooms|checkindate|checkoutdate|adults|children|
					|Sydney|Hotel Creek|Standard|1|25/05/2019|26/05/2019|2|1|
					
					
					
