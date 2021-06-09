package ActionandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.cssSelector(".blinkingText")).click();
Set<String>windows=	driver.getWindowHandles();//[parentid and chlid id]
Iterator<String> it=windows.iterator();
String parentId=it.next();

String chlidId=it.next();

	driver.switchTo().window(chlidId);
	
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(parentId);
	driver.findElement(By.className("form-control")).sendKeys(emailId);
	}

}
