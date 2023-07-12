package com.testing;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Library.Baseclass;
import com.pages.loginpages;

public class bookmyshowtest extends Baseclass {
	
	loginpages run;
@BeforeClass
public void browser() {
	
	browserLaunch();
	
}


@Test

public void search_testing() throws InterruptedException {
	
	 run = new loginpages(driver);
	 Thread.sleep(4000);


	run.locator();
	run.locator1();
}
}
