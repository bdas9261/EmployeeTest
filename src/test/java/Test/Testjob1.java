package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserHelper.browserUtils;
import browserHelper.initializedriver;

public class Testjob1 {
	WebDriver driver;
	
	@Test(priority = 1)
	public void luchbrowser() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Task\\EmployeeServiceTest\\driver\\chromedriver.exe");
		 
		// Initialize browser
		//WebDriver driver=new ChromeDriver();
		 driver=new ChromeDriver();
		// Open facebook
		driver.get("http://www.facebook.com");
	
	}
	@Test(priority = 2)
	public void login() {
	
		boolean bul=true;
    SoftAssert softassert=new SoftAssert();
    softassert.assertEquals(bul, driver.findElement(By.xpath("//input[@name='email']")).isDisplayed());
    softassert.assertEquals(bul, driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed());
    softassert.assertEquals(bul, driver.findElement(By.xpath("//button[@name='login']")).isDisplayed());
    softassert.assertEquals(bul, driver.findElement(By.xpath("//div//a[contains(text(),'Forgotten account?')]")).isDisplayed());
    softassert.assertEquals(bul, driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).isDisplayed());

}
}
