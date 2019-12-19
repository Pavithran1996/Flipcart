package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClas;
import org.stepdefinition.Hooks;

public class Pom3  {
	public Pom3() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath ="//input[@id='first_name']")
	private WebElement FirstName;
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement LastName;
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement Address;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement CCNum;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement CCType;
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement ExpMonth;
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement ExpYear;
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement CCCVv;
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement BookNow;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCCNum() {
		return CCNum;
	}
	public WebElement getCCType() {
		return CCType;
	}
	public WebElement getExpMonth() {
		return ExpMonth;
	}
	public WebElement getExpYear() {
		return ExpYear;
	}
	public WebElement getCCCVv() {
		return CCCVv;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	
}
