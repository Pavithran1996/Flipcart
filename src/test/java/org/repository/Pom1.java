package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClas;
import org.stepdefinition.Hooks;

public class Pom1{
	public Pom1() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath ="//select[@id='location']")
	private WebElement Location;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement Hotels;
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement RoomType;
	@FindBy(xpath ="//select[@id='room_nos']")
	private WebElement RoomNos;
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement Adultroom;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement ChildRoom ;
	@FindBy(xpath ="//input[@value='Search']")
	private WebElement btnSearch;
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getRoomNos() {
		return RoomNos;
	}
	public WebElement getAdultroom() {
		return Adultroom;
	}
	public WebElement getChildRoom() {
		return ChildRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
