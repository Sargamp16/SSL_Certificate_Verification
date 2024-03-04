package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_expired_certificate {
	public static void main(String[] args) {

	//Creating an object of the FirefoxOptions Class
	
			FirefoxOptions firefoxOptions = new FirefoxOptions();
					
			//Using the setAcceptInsecureCerts() method to pass parameter as False
			firefoxOptions.setAcceptInsecureCerts(false);
					
			WebDriver driver = new FirefoxDriver(firefoxOptions);
			
			driver.get("https://self-signed.badssl.com/");
			System.out.println("The page title is : " +driver.getTitle());
			driver.quit();
}
}
