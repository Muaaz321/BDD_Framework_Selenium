package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By emailid = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By signInButton = By.id("btnLogin");
	private By forgotpasswrdlink = By.linkText("Forgot your password?22");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotpasswrdlink).isDisplayed();
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(emailid).sendKeys(username);
	}
	
	
	public void enterPassword(String passwrd) {
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void clickonLogin() {
		driver.findElement(signInButton).click();
	}
	
	
}
