package com.smart.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	public void launchApplication() throws Exception  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(2000);
		String actualTitle=driver.getTitle();
		String expectedTitle ="Prosmart-Google Search";
		//assertEquals(actualTitle,expectedTitle, "Test missed"!);
		assertEquals(actualTitle,expectedTitle, "Test Failed");
		
		driver.findElement(By.name("email")).sendKeys("OrangeHRMTest",Keys.ENTER);
		String actualTitle1=driver.getTitle();
		String expectedTitle1="Log into Facebook";
		
		String actualurl=driver.getCurrentUrl();
		String expectedUrl ="http://www.facebook.com";
		Assert.assertEquals(actualurl,expectedUrl,"Url mismatch");
		
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expectedText ="";
		Assert.assertEquals(actualText,expectedText,"Text mismatch");
		
		String actualBorder	=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240,40,73)";
		Assert.assertEquals(actualBorder,expectedBorder,"Border mismatch");
		
		String actualErrorMessage=driver.findElement(By.xpath("//div[contains(text(),'The email or mobile number')]")).getText();
		String ExpectedErrorMessage= "The email or mobile you entered isn't connected to an account";
		Assert.assertEquals(actualErrorMessage,ExpectedErrorMessage,"ErrorMessage mismatch");
		
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser closed and assertion learning is over");
}
}