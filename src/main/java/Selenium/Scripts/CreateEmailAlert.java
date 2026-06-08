package Selenium.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateEmailAlert {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSG\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void createEmailAlert() {
        // Navigate to the portal
        driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
        
        // Log in
        driver.findElement(By.cssSelector("input[placeholder='pat@example.com']")).sendKeys("admin@sypore.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
        driver.findElement(By.cssSelector("button[color='primary']")).click();
        
        // Wait for the dashboard to load (adjust selector as needed)
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(":nth-child(10) > .cdk-column-Action > span > .mat-mdc-menu-trigger > .mdc-button__label"))).click();
        
        // Click "Email Alert" option
        driver.findElement(By.cssSelector(".mat-mdc-menu-content > :nth-child(2)")).click();

        // Select dropdown options
        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-8")).click();
        driver.findElement(By.cssSelector("#mat-option-2 > .mdc-list-item__primary-text")).click();
        WebElement selectedOption1 = driver.findElement(By.cssSelector(".mat-mdc-select-value-text > .mat-mdc-select-min-line"));
        Assert.assertTrue(selectedOption1.getText().contains("Elecon Medical Complex"));

        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-6")).click();
        driver.findElement(By.cssSelector("#mat-option-17 > .mdc-list-item__primary-text")).click();
        WebElement selectedOption2 = driver.findElement(By.cssSelector("#mat-select-value-1 > .mat-mdc-select-value-text > .mat-mdc-select-min-line"));
        Assert.assertTrue(selectedOption2.getText().contains("Total Paid Amount"));

        // Select date range
        driver.findElement(By.cssSelector(".mat-datepicker-toggle > .mdc-icon-button > .mat-mdc-button-touch-target")).click();
        driver.findElement(By.cssSelector(":nth-child(2) > [data-mat-col='1'] > .mat-calendar-body-cell")).click();
        driver.findElement(By.cssSelector(":nth-child(6) > [data-mat-col='2'] > .mat-calendar-body-cell")).click();

        // Confirm dates
        driver.findElement(By.cssSelector("[style='margin-left: auto;'] > div > :nth-child(2) > .mdc-button__label")).click();

        // Fill out alert form
        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-18")).sendKeys("Alert Testing GENERATION123");
        driver.findElement(By.cssSelector("#mat-mdc-chip-list-input-0")).sendKeys("usmantahirsqa@gmail.com" + "\n");
        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-20")).sendKeys("Total Reimbursement");

        // Select "Greater Than" option
        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-24")).click();
        driver.findElement(By.cssSelector("#mat-option-41 > .mdc-list-item__primary-text")).click();
        WebElement greaterThanOption = driver.findElement(By.cssSelector("#mat-select-value-7 > .mat-mdc-select-value-text > .mat-mdc-select-min-line"));
        Assert.assertTrue(greaterThanOption.getText().contains("Greater Than"));

        // Input threshold value
        driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-21")).sendKeys("90");

        // Select "Percentage" option
        driver.findElement(By.cssSelector("#mat-select-value-11 > .mat-mdc-select-placeholder")).click();
        driver.findElement(By.cssSelector("#mat-option-38 > .mdc-list-item__primary-text")).click();
        WebElement percentageOption = driver.findElement(By.cssSelector("#mat-select-value-11"));
        Assert.assertTrue(percentageOption.getText().contains("Percentage"));

        // Enter alert description
        driver.findElement(By.cssSelector(".quill-div > .ng-untouched > .ng-star-inserted")).sendKeys("Alert Generation");

        // Save the alert
        driver.findElement(By.cssSelector("mat-dialog-actions[class='mat-mdc-dialog-actions mdc-dialog__actions'] button[class='mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base'] span[class='mdc-button__label']")).click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
