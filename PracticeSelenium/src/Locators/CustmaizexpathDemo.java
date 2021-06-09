package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustmaizexpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// custmized  
		// Syntax   //tagname[@attribute='value'] //input[@id='login1']
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("kaveri");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kaveri98870");
		System.out.println(driver.getTitle());
		
	}

}
