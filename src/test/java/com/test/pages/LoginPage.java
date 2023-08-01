 package com.test.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.test.drivers.PageDriver;
import com.test.utility.CommonMethod;
import com.test.utility.GetScreenShot;

public class LoginPage extends CommonMethod {
	
	/*
	 * PageFactory Init
	 * Locators
	 * Functions
	 */ 
	ExtentTest test;
	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	} 
		 @FindBys({
//			@FindBy(xpath = "//input[@name='username']"),
//			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
			 @FindBy(xpath = "//input[@type='text']")
		})
		WebElement userName;
		
		@FindBys ({
			@FindBy(xpath = "//input[@type='password']")
			
		})
		WebElement passWord;
		
		@FindBys ({
			@FindBy(xpath = "//input[@value='Login']")
			
		})
		WebElement loginButton;
		
		public void login() throws InterruptedException, IOException {
			
			timeout(2000);
			
			try {
				if (userName.isDisplayed()) {
					//userName.sendKeys("Admin");
					userName.sendKeys("standard_user");
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>UserName field working as expected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UsernameDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UsernameDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Username is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "usernameLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "usernameLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(userName.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			try {
				if (passWord.isDisplayed()) {
					//passWord.sendKeys("admin123");
					passWord.sendKeys("secret_sauce");
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Password field working as expected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PassDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PassDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Password is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "passwordLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "passwordLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(userName.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			} 
			
			try {
				if (loginButton.isDisplayed()) {
					loginButton.click();
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>You have successfully logged in.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginPass");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "loginPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Login is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LoginLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "LoginLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(userName.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}
		
		
	}


