package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserHelper.initializedriver;

public class Testjob2 {
	initializedriver i=new initializedriver();
	@Test
	public void login() {
		i.getdriver();
		boolean bul=true;
    SoftAssert softassert=new SoftAssert();
    softassert.assertEquals(bul, i.getdriver().findElement(By.xpath("//input[@name='email']")).isDisplayed());
    softassert.assertEquals(bul, i.getdriver().findElement(By.xpath("//input[@name='pass']")).isDisplayed());
    softassert.assertEquals(bul, i.getdriver().findElement(By.xpath("//button[@name='login']")).isDisplayed());
    softassert.assertEquals(bul, i.getdriver().findElement(By.xpath("//div//a[contains(text(),'Forgotten account?')]")).isDisplayed());
    softassert.assertEquals(bul, i.getdriver().findElement(By.xpath("//a[contains(text(),'Create New Account')]")).isDisplayed());
//	i.getdriver().findElement(By.xpath("//input[@name='email']")).isDisplayed();
//	i.getdriver().findElement(By.xpath("//input[@name='pass']")).isDisplayed();
//	i.getdriver().findElement(By.xpath("//button[@name='login']")).isDisplayed();
//	i.getdriver().findElement(By.xpath("//div//a[contains(text(),'Forgotten account?')]")).isDisplayed();
//	i.getdriver().findElement(By.xpath("//a[contains(text(),'Create New Account')]")).isDisplayed();
    i.getdriver().close();
	}

}
