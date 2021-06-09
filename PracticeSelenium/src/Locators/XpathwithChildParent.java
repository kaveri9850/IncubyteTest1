package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithChildParent {

	public static void main(String[] args) {
		// parent chlid realtionship- xpath- define xpath for parent/tagnames
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("manual testing");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("manual testing");
		//driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input"))
		System.out.println(driver.getTitle());

	}

}
