package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClas;
import org.stepdefinition.Hooks;


public class Pom4  {
	public Pom4() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath ="//input[@id='logout']")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
	}
}
