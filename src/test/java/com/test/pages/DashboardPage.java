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

public class DashboardPage extends CommonMethod {
	ExtentTest test;
	public DashboardPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
		@FindBys ({
			@FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]"),
			//@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
		})
		
		WebElement adminOption;
		
		@FindBys ({
			@FindBy(xpath = "//span[contains(@class,'title')]"),
			//@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
		})
		
		WebElement DashboardText;
		
		@FindBys ({
			@FindBy (xpath = "//button[contains(.,'Add to cart')]")
			
		})
		
		WebElement AddToCart;
		
		@FindBys ({
			@FindBy (xpath = "//span[@class='shopping_cart_badge']")
			
		})
		
		WebElement CheckYourCart;
		
		@FindBys ({
			@FindBy (xpath = "//button[@name='checkout']Wrong")
			
		})
		
		WebElement CheckOut;
		
		
		
		public void checkDashboard() {
//			String expectedText = "Products";
//			String actualText = DashboardText.getText();
//			Assert.assertEquals(actualText, expectedText);
//			Assert.assertEquals(DashboardText.getText(), "Products");	// this line is enough for for this method		
			try {
				if (DashboardText.isDisplayed()) {
			Assert.assertEquals(DashboardText.getText(), "Products");
			test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Assertion is match successfully.</b></p>");
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "assertDone");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "assertDone.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
			} catch (Exception e) {
			System.out.println(e);
			}
		}
		
		public void clickAdmin() throws IOException { 
			try {
				if(adminOption.isDisplayed()) {
					adminOption.click();
					timeout();
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Admin field working as expected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AdminDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AdminDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>admin is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AdminLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AdminLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(adminOption.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		
			
		}
		public void clickAddtoCart() throws IOException { 
			try {
				if(AddToCart.isDisplayed()) {
					AddToCart.click();
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Add cart function working as expected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddTocartdone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AddTocartdone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Add to cart is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddCartLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AddCartLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(AddToCart.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			}
			public void clickYourCart() throws IOException { 
				try {
					if(CheckYourCart.isDisplayed()) {
						CheckYourCart.click();
						timeout(2000);
						test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Add cart function working as expected.</b></p>");
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckYourCartdone");
						String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CheckYourCartdone.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Check Your Cart is not locateable.Please check the error message</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckCartLocator");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CheckCartLocator.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(AddToCart.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			}
			public void clickCheckOut() throws IOException { 
				try {
					if(CheckOut.isDisplayed()) {
						CheckOut.click();
						timeout(2000);
						test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>CheckOut function working as expected.</b></p>");
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckOutdone");
						String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CheckOutdone.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Check out is not locateable.Please check the error message</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckOutLocator");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CheckOutLocator.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(AddToCart.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
	
	{
	
	
}
}
}
