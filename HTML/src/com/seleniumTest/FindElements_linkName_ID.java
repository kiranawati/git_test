package com.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_linkName_ID {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\elle\\Downloads\\chromedriver_win32\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		
		driver.findElement(By.linkText("TRY FREE")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedCondition.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("first-name")).sendKeys("Kiran");
		
		driver.findElement(By.id("last-name")).sendKeys("Awati");
		
		driver.findElement(By.id("email")).sendKeys("awatikiran17@gmail.com");
		
		driver.findElement(By.id("company")).sendKeys("Kiran");
		
		
		
	}

}
