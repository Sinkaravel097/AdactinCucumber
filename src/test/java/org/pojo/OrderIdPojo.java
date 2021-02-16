package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderIdPojo extends Base {
	
	public OrderIdPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderIdUsingId;
	

	public WebElement getOrderIdUsingId() {
		return orderIdUsingId;
	}
	
	public void scrollOrderId() {
		scrollUpAndDown(getOrderIdUsingId());
	}

}
