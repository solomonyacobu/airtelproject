package com.seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {



public static void main(String[] args) throws InterruptedException, IOException {
		
	

	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	TakesScreenshot ss=(TakesScreenshot)driver;
	File source = ss.getScreenshotAs(OutputType.FILE);
	File target=new File("src/test/resources/ScreenShot/ormpage.PNG");
	FileUtils.copyFile(source, target);
	
	
	
	  
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}