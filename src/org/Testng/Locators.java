package org.Testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass {
	
	public Locators(){
		PageFactory.initElements(driver, this);
	}
	  
	@FindBy(name="txtUserLoginID")
	 private WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	private WebElement txtPassword;
	
	@FindBy(className="dboxheader")
	private WebElement txtbtnSignIN;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtbtnSignIN() {
		return txtbtnSignIN;
	}
}
