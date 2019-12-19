package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.repository.Pom;
import org.repository.Pom1;
import org.repository.Pom2;
import org.repository.Pom3;
import org.repository.Pom4;
import org.resources.BaseClas;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClas {
	public static WebDriver driver;
	
	
	
	@Given("Launch the browser and open the flipcart application")
	public void launch_the_browser_and_open_the_flipcart_application() {
		
	    launch("https://www.adactin.com/HotelApp/index.php");
	    
	}
	
	Pom p = new Pom();
	Pom1 p1 = new Pom1();
	Pom2 p2 = new Pom2();
	Pom3 p3 = new Pom3();
	Pom4 p4 = new Pom4();
		
	
	@When("Enter the Username and Password")
	public void enter_the_Username_and_Password(io.cucumber.datatable.DataTable dataTable) {
	    List<String> li = dataTable.asList(String.class);
	    type(p.getTxtUsername(),li.get(0));
	    type(p.getTxtPassword(),li.get(1));
	}

	@When("Click Login button")
	public void click_Login_button() {
	   click(p.getBtnLogin());
	}
	@When("Enter booking credentials")
	public void enter_booking_credentials() {
		selectByText(p1.getLocation(), "Sydney");
		selectByText(p1.getHotels(), "Hotel Sunshine");
		selectByText(p1.getRoomType(), "Deluxe");
		selectByText(p1.getRoomNos(), "3 - Three");
		selectByText(p1.getAdultroom(), "2 - Two");
		selectByText(p1.getChildRoom(), "1 - One");
		click(p1.getBtnSearch());
	}

	@When("Confirm the Booking")
	public void confirm_the_Booking() {
		click(p2.getRadioButton1());
		click(p2.getContinue());
	}

	@When("Enter Address credentials")
	public void enter_Address_credentials() {
		type(p3.getFirstName(),"pavithran");
		type(p3.getLastName(),"p");
		type(p3.getAddress(),"chennai");
		type(p3.getCCNum(),"1234567847849307");
		selectByText(p3.getCCType(),"VISA");
		selectByText(p3.getExpMonth(),"July");
		selectByText(p3.getExpYear(),"2022");
		type(p3.getCCCVv(),"345");
		click(p3.getBookNow());
	}

	@When("Logout the page")
	public void logout_the_page() throws Throwable {
		Thread.sleep(5000);
		click(p4.getLogout());
	}
	@Then("Successful")
	public void successful() {
	    System.out.println("success");
	}





}
