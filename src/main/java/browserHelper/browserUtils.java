package browserHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserUtils {
	public void initializebrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\Task\\EmployeeServiceTest\\driver\\chromedriver.exe");
		 
		// Initialize browser
		//WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		initializedriver.getdriver().get("http://www.facebook.com");
		 
		// Maximize browser
		 
		initializedriver.getdriver().manage().window().maximize();
	}

}
