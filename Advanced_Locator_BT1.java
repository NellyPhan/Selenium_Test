import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.print.DocFlavor;
import java.time.Duration;

public class Advanced_Locator_BT1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Locator for Full Name field
        driver.findElement(By.xpath("//label[contains(@id,'userName')]"));
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Full')]"));
        driver.findElement(By.xpath("//input[contains(@id,'user') and @type='text']"));
        driver.findElement(By.xpath("//label[@id='userName-label' or text()='Full Name']"));
        //Locator for Email field
        driver.findElement(By.xpath("//input[contains(@placeholder,'example.com')]"));
        driver.findElement(By.xpath("//label[.='Email' or starts-with(@id,'userEmail')]"));
        driver.findElement(By.xpath("//input[@type='email' and @id='userEmail']"));
        //Locator for Current Address
        driver.findElement(By.xpath("//label[starts-with(@id,'currentAddress')]"));
        driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address') and @id ='currentAddress']"));
        //Locator for Permanent Address
        driver.findElement(By.xpath("//label[text()='Permanent Address']"));
        driver.findElement(By.xpath("//textarea[@id='permanentAddress' and @class='form-control']"));
        //Locator for Submit button
        driver.findElement(By.xpath("//button[text()='Submit' or @id='submit']"));




    }
}
