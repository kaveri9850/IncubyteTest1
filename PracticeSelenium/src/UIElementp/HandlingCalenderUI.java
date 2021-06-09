package UIElementp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.xpath("//*[contains(text(),'April 2021')]")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days']   th[class='next']")).click();
		}
		
		

	List<WebElement> dates=	driver.findElements(By.className("day"));
	int count=driver.findElements(By.className("day")).size();
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("26"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
	}
	//driver.findElements(By.cssSelector(".dow")).size();
	
	}

}
