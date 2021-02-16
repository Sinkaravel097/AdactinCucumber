package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends Base{
	
	// public constructor
	public SelectHotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	// Select Hotel Page Locators
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtnUsingId;
	
	@FindBy(id="continue")
	private WebElement continueBtnUsingId;
	
	
	// Get Locators using Getters
	
	public WebElement getRadioBtnUsingId() {
		return radioBtnUsingId;
	}

	public WebElement getContinueBtnUsingId() {
		return continueBtnUsingId;
	}
	
	public void clickSelectHotel() {
		clickAny(getRadioBtnUsingId());
	}
	
	public void clickContinue() {
		clickAny(getContinueBtnUsingId());
	}

}
