package UIElementp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDyanmicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")).click();;	
 //Select options=new Select(w);
// options.selectByValue(arg0);
	driver.findElement(By.xpath("//a[@value='AIP']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@value='GOI']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	//driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[1]/a")).click();
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	
	

	}

}
