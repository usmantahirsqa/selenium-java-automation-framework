package Selenium.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args){
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("Webdruver.gecko.driver", "C:\\Users\\TSG\\Downloads\\geckodriver-v0.35.0\\geckodriver.exe");
driver = new FirefoxDriver();
driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
//driver.wait(100);

driver.findElement(By.cssSelector("input[placeholder='pat@example.com']")).sendKeys("admin@sypore.com");

driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
//driver.findElement(By.cssSelector("button[name='mat-mdc-button-ripple']"));
//driver.findElement(By.linkText("Log In")).click();

driver.findElement(By.cssSelector("button[color='primary']")).click();
	}

}