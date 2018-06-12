package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARES\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sampath539");
		driver.findElement(By.id("pass")).sendKeys("*Imgsk539");
		driver.findElement(By.id("u_0_8")).click();
		driver.manage().window().maximize();

	}

}
