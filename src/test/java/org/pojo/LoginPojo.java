package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Base{

	// public constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	// Login Page Locators
	@FindBy(id="username")
	private WebElement userNameUsingId;
	
	@FindBy(id="password")
	private WebElement passwordUsingId;
	
	@FindBy(id="login")
	private WebElement loginBtnUsingId;
	
	
	// To get the Locators by using Getters
	public WebElement getUserNameUsingId() {
		
		return userNameUsingId;
	}

	public WebElement getPasswordUsingId() {
		
		return passwordUsingId;
	}

	public WebElement getLoginBtnUsingId() {
		
		return loginBtnUsingId;
	}
	
	
	public void userNameAndPasswordAndClickLoginBtn(String userName, String password) {
		findEle(getUserNameUsingId(), userName);
		findEle(getPasswordUsingId(), password);
		clickAny(getLoginBtnUsingId());
	}
	
	
	
	

}
