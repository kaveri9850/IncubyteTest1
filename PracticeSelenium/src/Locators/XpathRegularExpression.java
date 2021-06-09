package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRegularExpression {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Regular Expression  Syntax -  //tagname[contains(@attribute,'value')]  //input[contains(@name,username)]
		// Regular Exression Css Syntax  tagName[Attribute*='value']      input[name*='username']
		
		//driver.findElement(By.xpath("//input[contains(@id,'login']")).sendKeys("kaveri099");
		//driver.findElement(By.xpath("//input[contains(@title,'sign']")).sendKeys("kaveri");
		
	//	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("kaveri");
		driver.findElement(By.xpath("//input[contains(@type,'tex')]")).sendKeys("kaveri123");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("kaveri123");
		
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		System.out.println(driver.getTitle());

	}

}
