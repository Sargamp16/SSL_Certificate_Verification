package ssl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class SafariHandling {
	public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://revoked.badssl.com");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");

        System.out.println("The page title is : " + driver.getTitle());
        driver.quit();
    }
}

