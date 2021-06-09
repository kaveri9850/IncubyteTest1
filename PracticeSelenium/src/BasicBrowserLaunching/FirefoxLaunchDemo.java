package BasicBrowserLaunching;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\fireboxDriver\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("http://www.google.com");//hit url on the browser
		System.out.println(driver.getTitle());
	}

}
