package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends Base {

	// Create Public Constructor
	public SearchHotelPojo() {

		PageFactory.initElements(driver, this);
	}

	// Search Hotel Page Locators

	@FindBy(id = "location")
	private WebElement locationUsingid;

	@FindBy(id = "hotels")
	private WebElement hotelUsingId;

	@FindBy(id = "room_type")
	private WebElement roomTypeUsingId;

	@FindBy(id = "room_nos")
	private WebElement noOfRoomsUsingId;

	@FindBy(id = "datepick_in")
	private WebElement dateInUsingId;

	@FindBy(id = "datepick_out")
	private WebElement dateOutUsingId;

	@FindBy(id = "adult_room")
	private WebElement adultRoomUsingId;

	@FindBy(id = "child_room")
	private WebElement childRoomUsingId;
	
	@FindBy(id="Submit")
	private WebElement searchBtnUsingId;
	
	
	// Get locators Using Getters

	public WebElement getLocationUsingid() {
		return locationUsingid;
	}

	public WebElement getHotelUsingId() {
		return hotelUsingId;
	}

	public WebElement getRoomTypeUsingId() {
		return roomTypeUsingId;
	}

	public WebElement getNoOfRoomsUsingId() {
		return noOfRoomsUsingId;
	}

	public WebElement getDateInUsingId() {
		return dateInUsingId;
	}

	public WebElement getDateOutUsingId() {
		return dateOutUsingId;
	}

	public WebElement getAdultRoomUsingId() {
		return adultRoomUsingId;
	}

	public WebElement getChildRoomUsingId() {
		return childRoomUsingId;
	}

	public WebElement getSearchBtnUsingId() {
		return searchBtnUsingId;
	}

	public void selectLocation(int index) {
		selectByIndex(getLocationUsingid(), index);
	}
	
	public void selectHotel(String hotel) {
		selectByVisTxt(getHotelUsingId(), hotel);
	}
	
	public void selectRoomType(String roomType) {
		selectByVisTxt(getRoomTypeUsingId(), roomType);
	}
	
	public void noOfRooms(String noOfRooms) {
		selectByVisTxt(getNoOfRoomsUsingId(), noOfRooms);
	}
	
	public void adultPerRoom(String adult) {
		selectByVisTxt(getAdultRoomUsingId(), adult);
	}
	
	public void childrenPerRoom(String children) {
		selectByVisTxt(getChildRoomUsingId(), children);
	}
	
	public void clickSelect() {
		clickAny(getSearchBtnUsingId());
	}


}
