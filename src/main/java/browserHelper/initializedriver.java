package browserHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initializedriver {
   public static WebDriver getdriver() {
	   WebDriver driver = null;
	   driver=new ChromeDriver();
	return driver;
   }
}
