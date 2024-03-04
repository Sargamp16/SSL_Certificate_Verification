package ssl;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class expired_certificate {
public static void main(String args[]) throws InterruptedException
{
	
	//Create instance of ChromeOptions Class
	ChromeOptions handlingSSL = new ChromeOptions();

   //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
	handlingSSL.setAcceptInsecureCerts(true);
	WebDriver driver=new ChromeDriver(handlingSSL);
	driver.get("https://expired.badssl.com/");
	Thread.sleep(3000);
	System.out.println("The page title is : " +driver.getTitle());
	driver.quit();
	
}
}
