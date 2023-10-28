import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BasicLocator_BT1_Xpath {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        // Locator for Name field
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tram");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Phan");
        // Locator for Email field
        driver.findElement(By.xpath("//input[@placeholder='name@example.com' or @id='userEmail']")).sendKeys("qt@gmail.com");
        // Locator for Gender Radio button
        driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        //driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
        //driver.findElement(By.xpath("//label[@for='gender-radio-3']")).click();
        // Locator for Mobile field
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0905900798");
        //driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("0905900798");
        //Locator for Date of Birth field
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        //Locator for Date of Subject field
        driver.findElement(By.xpath("//label[@class='form-label' and @id='userName-label']"));
        //Locator for Hobbies field
        driver.findElement(By.xpath("//label[@class='form-label' and @id='subjects-label']"));
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        //Locator for Hobbies field - Choose File
        driver.findElement(By.xpath("//input[@id='uploadPicture' and @type='file']")).click();
        //Locator for Current Address field
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("158 Tran Cao Van");
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("158 Tran Cao Van");
        //Locator for State and City label
        driver.findElement(By.xpath("//label[@class='form-label' and @id='stateCity-label']"));
        //Locator for Submit button
        driver.findElement(By.xpath("//button[@id='submit']"));
        
    }
}
