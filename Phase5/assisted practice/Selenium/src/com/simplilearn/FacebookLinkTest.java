package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkTest {
	
	public static void main(String[] args) {

		String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "http://www.facebook.com/";
		///step:3 launching facebook
		driver.get(base_url);
		
		
		WebElement linktext= driver.findElement(By.linkText("Forgotten password?"));
		linktext.click();
		
		//driver.close();
	}

}