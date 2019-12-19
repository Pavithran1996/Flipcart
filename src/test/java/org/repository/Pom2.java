package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClas;
import org.stepdefinition.Hooks;


public class Pom2 {
	public Pom2() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private WebElement RadioButton1;
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement Continue;
	public WebElement getRadioButton1() {
		return RadioButton1;
	}
	public WebElement getContinue() {
		return Continue;
	}

}
