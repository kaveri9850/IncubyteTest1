package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("kaverioooo");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		System.out.println(driver.getTitle());
	}

}

/* IMp Regarding locators
  Every object may not have id,classname or name -xpath and css preferred
 
Alpha numeric id may vary on every refresh check
confrim the link object with anchor "a" tag
classes shuold not have spaces compound classes cannot be accepted
multipl values-selenium identifies the first scan from top left
Double quotes inside double quotes are not accepted
Xpath /css can be define in n number of ways
Right click copy highlighted html code to genrate xpath
firepath depreciated from firefox-
when xpath starts with html-not reliable-switch browser to get another one

there is no direct way to get css in chrome .you will find it in tool bar
$("")- for css ,$x("")-for xpath validate xpath and css using browser

//what is difference between relative and Absulate xpath
		// relative xpath does not depends on parent node
		//absultue xpath depends on parent/child node
		
how to traverse to sibling element using xpath
.//*[@id='tablist1-tab1']/following-sibling::li[2]


how to traverse back to parent element from child element using xpath?
.//*[@id='tablist1-tab1']/parent::ul



how to identify element text based
//*[text()='']
 */