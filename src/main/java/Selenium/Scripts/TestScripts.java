package Selenium.Scripts;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class TestScripts {
	static WebDriver driver;

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        // Set the path to the ChromeDriver executable

        // Initialize ChromeDriver
        //driver = uc.Chrome();
     

/*
public static void Login() throws InterruptedException {
	driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
	//driver.wait(100);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	driver.findElement(By.cssSelector("input[placeholder='pat@example.com']")).sendKeys("admin@sypore.com");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
	//driver.findElement(By.cssSelector("button[name='mat-mdc-button-ripple']"));
	//driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[color='primary']")).click();
	Thread.sleep(1000);
}
*/
/*
@Test
public static void Createbusinessentities() throws InterruptedException {

	driver.findElement(By.xpath("//button[@class='mat-mdc-tooltip-trigger fab-button mdc-fab mat-mdc-fab mat-primary mat-mdc-button-base']//span[@class='mat-mdc-button-touch-target']")).click();
//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-pricing[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
  //Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(
    	    By.cssSelector(".professional-card > :nth-child(5) > .button")
    	));
    	button.click();
    	// Explicit Wait
    //	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	//driver.findElement(By.className("mat-label.ng-tns-c3736059725-25")).sendKeys("Testing Company");
	//WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust timeout as needed
    	//  WebElement inputField =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-label.ng-tns-c3736059725-25 + input"));)
    			  
    			  
    			//  driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-25 + input"));
          //inputField.sendKeys("Testing Company");     
//driver.findElement(By.xpath("//div[@class='professional-card']/div[5]//button[@class='button']")).click();
*/
@Test
public static void EmailAlert() throws InterruptedException
{
	  try { 
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSG\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
    // Log in
    driver.findElement(By.cssSelector("input[placeholder='pat@example.com']")).sendKeys("admin@sypore.com");
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
    driver.findElement(By.cssSelector("button[color='primary']")).click();

    // Wait and click on menu item
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(":nth-child(10) > .cdk-column-Action > span > .mat-mdc-menu-trigger > .mdc-button__label"))).click();

    // Click "Email Alert" option
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-mdc-menu-content > :nth-child(2)"))).click();

    // Select options in dropdowns
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-label.ng-tns-c3736059725-8"))).click();
    driver.findElement(By.cssSelector("#mat-option-2 > .mdc-list-item__primary-text")).click();
    WebElement selectedOption1 = driver.findElement(By.cssSelector(".mat-mdc-select-value-text > .mat-mdc-select-min-line"));
    Assert.assertTrue(selectedOption1.getText().contains("Elecon Medical Complex"));

    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-label.ng-tns-c3736059725-6"))).click();
    driver.findElement(By.cssSelector("#mat-option-17 > .mdc-list-item__primary-text")).click();
    WebElement selectedOption2 = driver.findElement(By.cssSelector("#mat-select-value-1 > .mat-mdc-select-value-text > .mat-mdc-select-min-line"));
    Assert.assertTrue(selectedOption2.getText().contains("Total Paid Amount"));

    // Select date range
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-datepicker-toggle > .mdc-icon-button > .mat-mdc-button-touch-target"))).click();
    driver.findElement(By.cssSelector(":nth-child(2) > [data-mat-col='1'] > .mat-calendar-body-cell")).click();
    driver.findElement(By.cssSelector(":nth-child(6) > [data-mat-col='2'] > .mat-calendar-body-cell")).click();

    // Confirm dates
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[style='margin-left: auto;'] > div > :nth-child(2) > .mdc-button__label"))).click();

    // Fill out alert form
    driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-18")).sendKeys("Alert Testing GENERATION123");
    driver.findElement(By.cssSelector("#mat-mdc-chip-list-input-0")).sendKeys("usmantahirsqa@gmail.com" + "\n");
    driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-20")).sendKeys("Total Reimbursement");

    // Select "Greater Than" option
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-label.ng-tns-c3736059725-24"))).click();
    driver.findElement(By.cssSelector("#mat-option-41 > .mdc-list-item__primary-text")).click();
    WebElement greaterThanOption = driver.findElement(By.cssSelector("#mat-select-value-7 > .mat-mdc-select-value-text > .mat-mdc-select-min-line"));
    Assert.assertTrue(greaterThanOption.getText().contains("Greater Than"));

    // Input threshold value
    driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-21")).sendKeys("90");

    // Select "Percentage" option
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-select-value-11 > .mat-mdc-select-placeholder"))).click();
    driver.findElement(By.cssSelector("#mat-option-38 > .mdc-list-item__primary-text")).click();
    WebElement percentageOption = driver.findElement(By.cssSelector("#mat-select-value-11"));
    Assert.assertTrue(percentageOption.getText().contains("Percentage"));

    // Enter alert description
    driver.findElement(By.cssSelector(".quill-div > .ng-untouched > .ng-star-inserted")).sendKeys("Alert Generation");

    // Save the alert
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-dialog-actions[class='mat-mdc-dialog-actions mdc-dialog__actions'] button[class='mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base'] span[class='mdc-button__label']"))).click();
} catch (Exception e) {
    System.out.println("Test Failed: " + e.getMessage());
} finally {
    // Close browser
    driver.quit();
}
}
}



/*


public class EmailAlertsTest {

  WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void createEmailAlert() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure setup() is called.");
        }

        // Test logic
        driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
        driver.findElement(By.cssSelector("input[placeholder='pat@example.com']")).sendKeys("admin@sypore.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
        driver.findElement(By.cssSelector("button[color='primary']")).click();

        // Rest of the test
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        EmailAlertsTest test = new EmailAlertsTest();
        test.setup();
        test.createEmailAlert();
        test.tearDown();
    }
}

*/