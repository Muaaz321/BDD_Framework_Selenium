package com.factory;

import org.openqa.selenium.WebDriver;

public class Driverfactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	
	
}
