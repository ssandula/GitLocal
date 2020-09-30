package Section16.testAutomationPractise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;


public class openMultipleWIndows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		
		

	}

}
