package Section16.testAutomationPractise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class relativeLocators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println("Hello");
		//Relative Locator to identify the element using ".above"
		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		
		//Relative Locator to identify the element using ".below"
		WebElement dateOfBirth = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("10/12/1990");
		
		//Relative Locator to identify the element using "to left of"
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(checkBox));
		
		System.out.println("Hello");
		
		
		
		
		

	}

}
