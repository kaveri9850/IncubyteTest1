package BasicBrowserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchDemo {

	public static void main(String[] args) {
		
		//Create Driver object for chrome Browser
		//we will strictly implement method of webdriver
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.google.com");//hit url on the browser
		System.out.println(driver.getTitle());//validate if your page title is correct
		System.out.println(driver.getCurrentUrl());//validate if your are landed on correct url 
		//System.out.println(driver.getPageSource());//get page source
	//	driver.close();//close the current browser 
	//	driver.quit();//close the all browser open by selenium Script
		driver.navigate().to("http://www.yahoo.com");
		driver.navigate().back();
		//driver.navigate().forward();
		
		
		
		
		

	}

}
