package Selenium.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class EmailAlerts{
	static WebDriver driver;
@Test
    public static void EmailAlertsTestScripts() {
        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSG\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");

        // Initialize ChromeDriver
        //driver = uc.Chrome();
         driver = new ChromeDriver();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        try {
            // Test 1: Create Email Alert
            driver.get("https://syporeportalv2.hardstoneenterprises.com/auth");
            // Login
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='pat@example.com']")));
element.sendKeys("admin@sypore.com");
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperAdministrator1!");
            driver.findElement(By.cssSelector("button[color='primary']")).click();

            // Navigate to alerts section
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(":nth-child(10) > .cdk-column-Action > span > .mat-mdc-menu-trigger"))).click();
            driver.findElement(By.cssSelector(".mat-mdc-menu-content > :nth-child(2)")).click();

            // Select Entity
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-label.ng-tns-c3736059725-8"))).click();
            driver.findElement(By.cssSelector("#mat-option-2 > .mdc-list-item__primary-text")).click();
            WebElement entityElement = driver.findElement(By.cssSelector(".mat-mdc-select-value-text > .mat-mdc-select-min-line"));
            wait.until(ExpectedConditions.textToBePresentInElement(entityElement, "Elecon Medical Complex"));

            // Select Metric
            driver.findElement(By.cssSelector("mat-label.ng-tns-c3736059725-6")).click();
            driver.findElement(By.cssSelector("#mat-option-17 > .mdc-list-item__primary-text")).click();
            WebElement metricElement = driver.findElement(By.cssSelector("#mat-select-value-1 > .mat-mdc-select-value-text > .mat-mdc-select-min-line"));
            wait.until(ExpectedConditions.textToBePresentInElement(metricElement, "Total Paid Amount"));

            // Date Selection
            driver.findElement(By.cssSelector(".mat-datepicker-toggle > .mdc-icon-button")).click();
            driver.findElement(By.cssSelector(":nth-child(2) > [data-mat-col='1'] > .mat-calendar-body-cell")).click();
            driver.findElement(By.cssSelector(":nth-child(6) > [data-mat-col='2'] > .mat-calendar-body-cell")).click();

            // Proceed and fill alert details
          //  driver.findElement(By.cssSelector("[style='margin-left: auto;'] > div > :nth-child(2) > .mdc-button__label")).click();
          //  WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[style='display: flex; justify-content: end; padding: 10px;'] > .mdc-button--raised")));
//button.click();
            
        //    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector('[style="margin-left: auto;"] > div > :nth-child(2) > .mdc-button__label')));
        // button.click();
             //driver.findElement(By.cssSelector("[style='display: flex; justify-content: end; padding: 10px;'] > .mdc-button--raised")).click();
//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-email-alert[1]/mat-dialog-content[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/div[2]/label[1]/mat-label[1]")).sendKeys("Alert Testing GENERATION12332");
         //driver.switchTo().frame(".mat-mdc-dialog-surface.mdc-dialog__surface");
//         WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".mat-mdc-dialog-surface.mdc-dialog__surface")));
//         driver.switchTo().frame("iframe");
//WebElement = driver.findElement(By.xpath("//mat-form-field[contains(@class, 'desired-class')]//input"));
       driver.findElement(By.cssSelector("[style=\"margin-left: auto;\"] > div > :nth-child(2) > .mdc-button__label")).click();
       WebElement buttonLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
               By.cssSelector("[style='display: flex; justify-content: end; padding: 10px;'] > .mdc-button--raised > .mdc-button__label")));

       // Click the element
       buttonLabel.click();
         WebElement dialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mat-mdc-dialog-surface")));
         WebElement element2 = driver.findElement(By.cssSelector("#mat-input-0"));
         element2.sendKeys("Alert Testing GENERATION12332");
       
         //driver.findElement(By.cssSelector("mat-label[class='ng-tns-c3736059725-59']")).sendKeys("Alert Testing GENERATION123");
            driver.findElement(By.cssSelector("#mat-mdc-chip-list-input-0")).sendKeys("usmantahirsqa@gmail.com" + "\n");
            WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-select-value-7 > .mat-mdc-select-placeholder"))); // Use your selector
            dropdownButton.click();

            // Step 2: Wait for the dropdown options to be visible and clickable
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-option-53 > .mdc-list-item__primary-text"))); // Use the correct option selector

            // Step 3: Click the desired option
            option.click();

            driver.findElement(By.cssSelector("#mat-input-1")).sendKeys("Total Reimbursement");
            //driver.findElement(By.cssSelector("#mat-mdc-form-field-label-24 > .mat-mdc-form-field-required-marker")).click();
            //driver.findElement(By.cssSelector("#mat-option-43")).click();
           WebElement dropdownButton2 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-mdc-form-field-label-24 > .mat-mdc-form-field-required-marker"))); // Use your selector
            dropdownButton2.click();

           // driver.findElement(By.id("#mat-mdc-form-field-label-24 > .mat-mdc-form-field-required-marker\"")).click();
            // Step 2: Wait for the dropdown options to be visible and clickable
            WebElement option2 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-option-43"))); // Use the correct option selector
            option2.click();
            
            WebElement conditionElement = driver.findElement(By.cssSelector("#mat-select-value-9"));
            wait.until(ExpectedConditions.textToBePresentInElement(conditionElement, "Greater Than"));
            driver.findElement(By.cssSelector("#mat-input-2")).sendKeys("90");
           
            //driver.findElement(By.cssSelector("#mat-select-value-13 > .mat-mdc-select-placeholder")).click();
            //driver.findElement(By.cssSelector("#mat-option-40 > .mdc-list-item__primary-text")).click();
            
            
            try {
                // Step 1: Click the dropdown to open it
                WebElement dropdown3 = wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("#mat-select-value-13 > .mat-mdc-select-placeholder"))); // Adjust selector for dropdown trigger
                dropdown3.click();

                // Step 2: Wait for the option to become visible and clickable
                WebElement option3 = wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("#mat-option-40 > .mdc-list-item__primary-text")));
                option3.click();
                
                WebElement conditionElement2 = driver.findElement(By.cssSelector("#mat-select-value-13"));
                wait.until(ExpectedConditions.textToBePresentInElement(conditionElement2, "Percentage"));

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                driver.quit();
            }
        
    
            
           /* WebElement dropdownButton3 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-select-value-13 > .mat-mdc-select-placeholder"))); // Use your selector
            dropdownButton3.click();

            // Step 2: Wait for the dropdown options to be visible and clickable
            WebElement option3 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#mat-option-40 > .mdc-list-item__primary-text3"))); // Use the correct option selector
            option3.click();
             WebElement conditionElement2 = driver.findElement(By.cssSelector("#mat-select-value-13"));
wait.until(ExpectedConditions.textToBePresentInElement(conditionElement2, "Percentage"));

            */

           
            // Save Alert
      WebElement addRemarks =   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ql-editor > p")));  
          addRemarks.sendKeys(".ql-editor > p");
      //driver.findElement(By.cssSelector(".ql-editor > p")).sendKeys("Alert Generation");

          WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-dialog-actions button.mat-primary")));
          savebutton.click();
        		  //driver.findElement(By.cssSelector("mat-dialog-actions button.mat-primary")).click();

            // Verify success
            WebElement successMessage = driver.findElement(By.cssSelector(".text-container > span"));
            wait.until(ExpectedConditions.textToBePresentInElement(successMessage, "Alert created successfully"));

            System.out.println("Test Passed: Email Alert Created Successfully");
            WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector(":nth-child(2) > .mat-mdc-list-item > .mdc-list-item__content > .mat-mdc-list-item-unscoped-content > .menu-item-name")
                ));
                firstElement.click();

                // Step 2: Locate and click the second element
                WebElement secondElement = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("[style='display: flex; align-items: baseline; gap: 10px; width: 30%;'] > .mdc-button > .mdc-button__label")
                ));
                secondElement.click();
        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        } finally {
            // Close browser
            driver.quit();
        }
    }
}