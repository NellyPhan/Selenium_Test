import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BasicLocator_Practice1_Xpath {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Find elemet - Full Name field
        driver.findElement(By.xpath("//label"));
        driver.findElement(By.xpath("//label[@class='form-label']"));
        driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        driver.findElement(By.xpath("//input[@id='userName']"));
        //Find element - Email field
        driver.findElement(By.xpath("//label"));
        driver.findElement(By.xpath("//label[@class ='form-label']"));
        driver.findElement(By.xpath("//input[@id ='userEmail']"));
        driver.findElement(By.xpath("//input[@placeholder ='name@example.com']"));
        //Find element - Current Address field
        driver.findElement(By.xpath("//label[@class='form-label' and @id='currentAddress-label']"));
        driver.findElement(By.xpath("//textarea[@placeholder ='Current Address']"));
        driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        //Find element - Permanent Address
        driver.findElement(By.xpath("//label[@class='form-label' and @id='permanentAddress-label']"));
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        //Find element - Submit button
        driver.findElement(By.xpath("//button[@id='submit']"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary' or @type='button']"));

    }
}
