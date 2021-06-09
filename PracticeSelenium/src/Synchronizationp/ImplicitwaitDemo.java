package Synchronizationp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitDemo {
	
//implicit wait: pros:code Readable  disadvantage performance issue so generrly give limit not more that 10 seconds 
//cons:Performance cause issues are not aught	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	Thread.sleep(2000);
	String[]  items= {"Cucumber","Brocolli"," Cauliflower","Beetroot","Carrot","Tomato ","Beans " };
	additem(driver,items);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
	driver.findElement(By.className("promoCode")).sendKeys("kaveri");//cssselector: input.promoCode
	driver.findElement(By.className("promoBtn")).click(); //cssselector: button.promBtn
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	driver.close();
	
	
	}
	
	
	
	
	public static void additem(WebDriver driver,String[] items)
	{
		int j=0;
	List <WebElement>  product=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<product.size();i++)
	{
		//String name=product.get(i).getText();
		String[] name=product.get(i).getText().split("-");
		String formatedname=name[0].trim();
		//format it to get actual vegetable name
		//check whether name u extracted is present in or not
		//convert array in array list for easy to search
		List<String> al=Arrays.asList(items);
		
		if(al.contains(formatedname))
		//if(name.contains("Cucumber"))
		{
			  j++;
			//click on add to cart 
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			//break;
			if(j==items.length)
			{
			break;
			}
		}
		}
	}

	}


