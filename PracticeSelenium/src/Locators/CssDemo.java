package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("#login1")).sendKeys("kaveri9889");
		driver.findElement(By.cssSelector("#password")).sendKeys("98989");
		driver.findElement(By.cssSelector("body > div > div.lft_wrap > div.top_bar > div:nth-child(2) > form > div.floatL.leftwidth > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input.signinbtn")).click();
		System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//*[@id=\'div_login_error\']/b")).getText());

	}

}
