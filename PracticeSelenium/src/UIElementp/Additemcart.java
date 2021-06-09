package UIElementp;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additemcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String[]  items= {"Cucumber","Brocolli"," Cauliflower","Beetroot","Carrot","Tomato ","Beans " };
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	//List <WebElement> product=driver.findElements(By.xpath("//*[@class='product-name']"));
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
		int j=0;
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
