package com.smart.listenerClass;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


	public class FirstTest extends BaseClass{
		
		@Test
		public void testGoogle() {
		driver.get("http://www.google.com");			
		driver.findElement(By.name("q")).sendKeys("Prosmart", Keys.ENTER);
		String actualTitle= driver.getTitle();
		String expectedTitle ="ProSmart - Google Search";
		//Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
		assertEquals(actualTitle, expectedTitle, "Test Failed!");
		}
		
		@Test
		public void testFacebook() {
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("OrangeHRMTest", Keys.ENTER);
		System.out.println(driver.getTitle());
				
		}
		@Test
		public void testOrangeHRMLogin() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("button[@type= 'submit']")).click();
		WebElement sectionTitle= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		assertTrue(sectionTitle.isDisplayed());
		 }

	}
	
	