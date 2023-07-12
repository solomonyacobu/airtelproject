package com.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Baseclass {
	public WebDriver driver;
	public  void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		
		
	}
	
	

}
