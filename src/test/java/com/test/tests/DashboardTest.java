package com.test.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.test.drivers.BaseDriver;
import com.test.drivers.PageDriver;
import com.test.pages.DashboardPage;
import com.test.pages.LoginPage;
import com.test.utility.ExtentFactory;

public class DashboardTest extends BaseDriver {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>DashBorad</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
		
	}

	@Test
	public void dashBoardTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>DASHBOARD TEST</b></p>");
		DashboardPage  dashboardPage = new DashboardPage(childTest);
		//LoginPage loginPage = new LoginPage(childTest);
		dashboardPage.checkDashboard();
		dashboardPage.clickAdmin();
		dashboardPage.clickAddtoCart();
		dashboardPage.clickYourCart();
		dashboardPage.clickCheckOut();

	}	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
