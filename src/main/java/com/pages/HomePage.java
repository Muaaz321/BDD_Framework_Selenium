package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	private By homeSections = By.className("quickLaungeContainer");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public int getHomesectioncount() {
		return driver.findElements(homeSections).size();	
	}

	public List<String> getHomeSectionList() {
		
		List<String> homeList = new ArrayList<>();
		
		List<WebElement> homepagesectionlist =	
				driver.findElements(homeSections);
		
		for(WebElement e:homepagesectionlist) {
			String text = e.getText();
			System.out.println(text);
			
			homeList.add(text);
		}
		
		return homeList;
	}

}
