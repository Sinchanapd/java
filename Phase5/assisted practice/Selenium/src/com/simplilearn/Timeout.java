package com.simplilearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeout {
	
	public static void main(String[] args) {
		
		///Step-1 : Declare path of driver
		
				String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",path);
				
				///initiate the driver
				
				WebDriver driver= new ChromeDriver();
				
				///step:2 base url
				
				String base_url= "http://www.facebook.com/";
				
				///step:3 launching google chrome
				
				driver.get(base_url);
				
				
				//implicit wait timeout for 20 second
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//script timeout
				driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	
				//page load timeout
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
								
				WebElement email= driver.findElement(By.id("email"));
				email.sendKeys("nikunj@gmail.com");
				
				
				//driver.close();
		
	}

	
}