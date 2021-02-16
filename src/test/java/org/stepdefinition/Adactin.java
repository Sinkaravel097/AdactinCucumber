package org.stepdefinition;

import org.base.Base;
import org.junit.Assert;
import org.pojo.BookHotelPojo;
import org.pojo.LoginPojo;
import org.pojo.OrderIdPojo;
import org.pojo.PageObjectManager;
import org.pojo.SearchHotelPojo;
import org.pojo.SelectHotelPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Adactin extends Base {

	PageObjectManager pom;
	LoginPojo lp;
	SearchHotelPojo shp;
	SelectHotelPojo sh;
	BookHotelPojo bhp;
	OrderIdPojo oip;

	@Given("User has to launch the browser and hit the url")
	public void user_has_to_launch_the_browser_and_hit_the_url() {
		launchUrl("http://adactinhotelapp.com/");
	}

	@When("User has to enter the username and password and click login button")
	public void user_has_to_enter_the_username_and_password_and_click_login_button() {
		pom = PageObjectManager.getPom();
		lp = pom.getLp();
		lp.userNameAndPasswordAndClickLoginBtn("Vishal97", "Vishal Adactin");
	}

	@When("User has to select the location")
	public void user_has_to_select_the_location() {
		pom = PageObjectManager.getPom();
		shp = pom.getShp();
		shp.selectLocation(3);
	}

	@When("User has to select the hotel")
	public void user_has_to_select_the_hotel() {
		shp.selectHotel("Hotel Sunshine");
	}

	@When("User has to select the room type")
	public void user_has_to_select_the_room_type() {
		shp.selectRoomType("Standard");
	}

	@When("User has to select number of rooms")
	public void user_has_to_select_number_of_rooms() {
		shp.noOfRooms("2 - Two");
	}

	@When("User has to select adults per room")
	public void user_has_to_select_adults_per_room() {
		shp.adultPerRoom("2 - Two");
	}

	@When("User has to select children per room")
	public void user_has_to_select_children_per_room() {
		shp.childrenPerRoom("0 - None");
	}

	@When("User has to click search button")
	public void user_has_to_click_search_button() {
		shp.clickSelect();
	}

	@When("User has to click select radio button")
	public void user_has_to_click_select_radio_button() {
		pom = PageObjectManager.getPom();
		sh = pom.getSh();
		sh.clickSelectHotel();
	}

	@When("User has to click on continue button")
	public void user_has_to_click_on_continue_button() {
		sh.clickContinue();
	}

	@When("User has to enter the firstname and lastname")
	public void user_has_to_enter_the_firstname_and_lastname() {
		pom = PageObjectManager.getPom();
		bhp = pom.getBhp();
		bhp.firstNameAndLastName("Vishal", "S");
	}

	@When("User has to enter the billing address")
	public void user_has_to_enter_the_billing_address() {
		bhp.billingAddress("12A/1 Puttu Thoppu Main Road");
	}

	@When("User has to enter the credit card numbber")
	public void user_has_to_enter_the_credit_card_numbber() {
		bhp.cardNumber("0000000000000000");
	}

	@When("User has to select the credit card type")
	public void user_has_to_select_the_credit_card_type() {
		bhp.cardType("VISA");
	}

	@When("User has to select the expirymonth and expiryyear")
	public void user_has_to_select_the_expirymonth_and_expiryyear() {
		bhp.expMonth("July");
		bhp.expYear("2022");
	}

	@When("User has to enter the cvv number")
	public void user_has_to_enter_the_cvv_number() {
		bhp.cvvNumber("000");
	}

	@When("User has to click the book now button")
	public void user_has_to_click_the_book_now_button() {
		bhp.bookNow();
	}

	@When("User has to visible the order id")
	public void user_has_to_visible_the_order_id() {
		Assert.assertTrue(false);
		pom = PageObjectManager.getPom();
		oip = pom.getOip();
		visibilityOfAllElementsLocatedByUsingId("order_no");
		oip.scrollOrderId();
	}
}
