package Section16.testAutomationPractise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;

public class testing1fbexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://beta.mydigibin.com/CustomerSurvey.html?p=YnVzaW5lc3M9NjQ3NiZTdXJ2ZXk9ODQ0OSZTdGFmZmZsYWc9bnVsbCZkZWZJbmQ9c3RhcnQbizl&fbclid=IwAR0V9uypJrQBDg3Wo9gd4fjhYrOx1dBYIcDUUIqEdJBghhLuXG-TJNIfpVY");

		
		WebElement smileyText = driver.findElement(By.xpath("// p[@id='smilytextfour']"));
		driver.findElement(withTagName("img").above(smileyText));
		System.out.println("Hello");
	}

}
