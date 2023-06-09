package com.smart.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class OrangeHRMTest2 {
	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
/*
	}
	@BeforeMethod
	public void enterCredentials() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("button[@type= 'submit']")).click();
		*/

	@Test
	public void verifyLogin() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("button[@type= 'submit']")).click();
		WebElement sectionTitle= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(sectionTitle.isDisplayed());
		System.out.println(sectionTitle.getText());
		driver.close();	
		
	}
		@AfterTest
	public void tearDown() {
		driver.close();
		}

}

