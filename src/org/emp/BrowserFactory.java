package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\irfan\\eclipse-workspace\\SamplePro\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	}
	}


