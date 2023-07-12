package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmlogin {
	

	WebDriver driver; 

	@BeforeMethod
	

	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	
		
	}
		

	@Test
	
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		WebElement UN=driver.findElement(By.name("username"));
		UN.click();
		UN.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement PW=driver.findElement(By.name("password"));
		PW.click();
		PW.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement LI=driver.findElement(By.xpath("//button[@type='submit']"));
		LI.click();
		
		
		
		
		
	}
	
	@AfterMethod
	
	public void orange() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TakesScreenshot  HRM=(TakesScreenshot)driver;
		File source = HRM.getScreenshotAs(OutputType.FILE);
		File target= new File("src/test/resources/ScreenShot/orangeHRM.PNG");
		FileUtils.copyFile(source, target);
		driver.close();
		
		
		
		
		
	}
		
		 
	}


