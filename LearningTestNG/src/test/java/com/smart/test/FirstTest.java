package com.smart.test;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class FirstTest {
		
		@Test
		public void testGoogle() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
		driver.findElement(By.name("q")).sendKeys("Prosmart", Keys.ENTER);
		Thread.sleep(2000);
		String actualTitle= driver.getTitle();
		String expectedTitle ="ProSmart - Google Search";
		//Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
		Assert.assertEquals(actualTitle, expectedTitle, "Test Failed!");
			
		driver.close();
		}
		
		@Test
		public void testFacebook() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("OrangeHRMTest", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
				
		}
		@Test
		public void testOrangeLogin() {
			
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("button[@type= 'submit']")).click();
		WebElement sectionTitle= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(sectionTitle.isDisplayed());
		System.out.println(sectionTitle.getText());
		 driver.close();
		 }

	}
	
	