package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClas;
import org.stepdefinition.Hooks;

public class Pom  {
	public Pom() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(id ="username")
	private WebElement txtUsername;
	@FindBy(id ="password")
	private WebElement txtPassword;
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement btnLogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
