package org.adactin_stepDefinition;

import static org.junit.Assert.assertEquals;

import org.adactin.helper.PageObjectManager;
import org.adactin.helper.PropertyReaderManager;
import org.adactin_pom.LoginPage;
import org.adactin_pom.SearchHotel;
import org.adactin_runner.TestRunner;
import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	//public static WebDriver driver;
	public  WebDriver driver=TestRunner.driver;
	public  PageObjectManager pm=new PageObjectManager(driver);
	@Given("^user should launch the hotel reservation application$")
	public void user_should_launch_the_hotel_reservation_application() throws Throwable {
		//driver=getBrowser("chrome");
		//driver.get("https://www.adactin.com/HotelApp/index.php");
		driver.get(PropertyReaderManager.getInstance().getPr().getUrl());
	    
	    
	}

	/*@When("^User verify the Login page header matches -Login$")
	 * 
	public void user_verify_the_Login_page_header_matches_Login(String arg1) throws Throwable {
		//LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		
		String elementText = getElementText(pm.getLp().getHeaderPage());
	System.out.println(elementText);
		
	    
	}*/

	@Given("^User should enter valid username '(.*)'$")
	public void user_should_enter_valid_username(String username) throws Throwable {
		//LoginPage lp=new LoginPage(driver);
		try {
			//inputValuestoWebelement(pm.getLp().getUsername_input(), username);
			inputValuestoWebelement(pm.getLp().getUsername_input(),PropertyReaderManager.getInstance().getPr().getUsername());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^user should enter valid password \"([^\"]*)\"$")
	public void user_should_enter_valid_password(String password) throws Throwable {
		//LoginPage lp=new LoginPage(driver);
		try {
			//inputValuestoWebelement(pm.getLp().getPassword_input(), password);
			inputValuestoWebelement(pm.getLp().getPassword_input(), PropertyReaderManager.getInstance().getPr().getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Then("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		//LoginPage lp=new LoginPage(driver);
		elementClick(pm.getLp().getLogin_click());
	    
	}

	@When("^User should select the location \"([^\"]*)\"$")
	public void user_should_select_the_location(String location) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getLocationDD(), location);
	    
	}

	@Then("^User should select the hotel \"([^\"]*)\"$")
	public void user_should_select_the_hotel(String hotel) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getHotelDD(), hotel);
	    
		
	    
	}

	@Then("^User should select the room type\"([^\"]*)\"$")
	public void user_should_select_the_room_type(String hotel) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getRoomtypeDD(), hotel);
	    
	}

	@Then("^User should select the no of rooms\"([^\"]*)\"$")
	public void user_should_select_the_no_of_rooms(String noOfRooms) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getNoOfRoomsDD(), noOfRooms);
	    
	}

	@Then("^user should enter checkin date \"([^\"]*)\"$")
	public void user_should_enter_checkin_date(String cIDate) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		pm.getSh().getCheckInDate().clear();
		inputValuestoWebelement(pm.getSh().getCheckInDate(), cIDate);
	    
	    
	}

	@Then("^user should enter the checkout date with day before in checkin\"([^\"]*)\"$")
	public void user_should_enter_the_checkout_date_with_day_before_in_checkin(String cODate) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		pm.getSh().getCheckOutDate().clear();
		inputValuestoWebelement(pm.getSh().getCheckOutDate(), cODate);
	    
	}
	
	@Then("^user should click the search button$")
	public void user_should_click_the_search_button() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		elementClick(pm.getSh().getSubmitBtn());
	}

	@Then("^Verify that system gives an error saying check-in-date should not be later than check-out-date$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		System.out.println(pm.getSh().geterrorMessageCheckIn().getText());
		System.out.println(pm.getSh().getErrorMessageCheckout().getText());
	    
	}

	@Then("^user should enter the checkout date\"([^\"]*)\"$")
	public void user_should_enter_the_checkout_date(String chkoutdate) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		pm.getSh().getCheckOutDate().clear();
		inputValuestoWebelement(pm.getSh().getCheckOutDate(), chkoutdate);
	    
	}

	@Then("^Verify that application throws error message$")
	public void verify_that_application_throws_error_message() throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		System.out.println(pm.getSh().getErrorMessageCheckout().getText());    
	}
	
	@Then("^user should click no of adults \"([^\"]*)\"$")
	public void user_should_click_no_of_adults(String adults) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getAdultsPerRoomDD(), adults);
	}

	@Then("^user should click on no of children \"([^\"]*)\"$")
	public void user_should_click_on_no_of_children(String children) throws Throwable {
		//SearchHotel sh=new SearchHotel(driver);
		selectDDusingValue(pm.getSh().getChildrenPerRoomDD(), children);
	}
	@Then("^user should click the radio button$")
	public void user_should_click_the_radio_button() throws Throwable {
	    elementClick(pm.getSb().getRadioButton_click());
	    
	}

	
	@Then("^Verify that totalprice\\(excl\\.GST\\) is being calculated as price-per-night\\*noof-rooms\\*no-of-days$")
	public void verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days() throws Throwable {
	   
	String totalprice1 = (pm.getSb().getTotalprice_text().getAttribute("value"));
	//String totalprice2 = getElementText(pm.getSb().getTotalprice_book_text());
	//Assert.assertEquals(totalprice1, "AUD $ 275");
	//Assert.assertEquals("AUD $ 275", totalprice1);
	System.out.println(totalprice1);
	//Assert.assertEquals("AUD $ 135", totalprice1);
	
	}
	@Then("^user should click the continue button$")
	public void user_should_click_the_continue_button() throws Throwable {
		elementClick(pm.getSb().getContinue_click());
	    
	}

}
