package Section16.testAutomationPractise1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class torBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Sai Automation\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		File torProfileDir = new File("C:\\Users\\CBB40Z2 - Admin\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default");
		FirefoxBinary binary = new FirefoxBinary(new File( "C:\\Users\\CBB40Z2 - Admin\\Desktop\\Tor Browser\\Browser\\firefox.exe"));
		FirefoxProfile torProfile = new FirefoxProfile(torProfileDir);
		torProfile.setPreference("webdriver.load.strategy", "unstable");
		
		
		
		/*
		 * try {
		 * 
		 * binary.startProfile(torProfile,torProfileDir, ""); } catch(IOException e) {
		 * e.printStackTrace(); }
		 */

		
		
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "127.0.0.1");
		profile.setPreference("network.proxy.socks_port", 9150);
		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
		//FirefoxDriver driver = new FirefoxDriver(profile);
		
		
		
		

	}
	
	

}
