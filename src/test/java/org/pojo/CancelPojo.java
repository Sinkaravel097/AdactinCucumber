package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPojo extends Base{
	
	public CancelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="//input[@id='btn_id_386053']")
	private WebElement cancel;
	
	@FindBy(xpath="//label[@id='search_result_error']")
	private WebElement msg;
	

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
