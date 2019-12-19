package org.resources;


import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.stepdefinition.Hooks;

public class BaseClas {
	  static WebDriver driver;
	public static void launch(String url) {
		Hooks.driver.get(url);
	}
	public static void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void click(WebElement w) {
		w.click();
	}
	public static void closeBrowser() {
		driver.quit();	
		}
	public static void ScreenShot(String path) throws IOException  {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dec = new File(path);
		FileUtils.copyFile(src, dec);
	
	}
	public static void selectByText(WebElement loc,String in) {
		Select s = new Select(loc);
		s.selectByVisibleText(in);
		
	}

}
