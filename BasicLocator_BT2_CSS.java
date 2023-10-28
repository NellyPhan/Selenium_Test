import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BasicLocator_BT2_CSS {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        //Locator for Name field
        driver.findElement(By.cssSelector("input#firstName"));
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Quỳnh");
        driver.findElement(By.cssSelector("input[placeholder*='Last']")).sendKeys("Trâm");
        //Locator for Email field
        driver.findElement(By.cssSelector("input#userEmail"));
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        //Locator for Gender field
        driver.findElement(By.cssSelector("div[id='genterWrapper'] div:nth-of-type(1)"));
        driver.findElement(By.cssSelector("div[id='genterWrapper'] div:nth-of-type(2)"));
        driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
        driver.findElement(By.cssSelector("label[for='gender-radio-3']"));
        //Locator for Mobile field
        driver.findElement(By.cssSelector("input#userNumber"));
        driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        //Locator Date of Birth field
        driver.findElement(By.cssSelector("input#dateOfBirthInput"));
        //Locator Subject label
        driver.findElement(By.cssSelector("div[id='subjectsWrapper'] label"));
        //Locator Hobbies
        driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']"));
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        driver.findElement(By.cssSelector("input[id='hobbies-checkbox-2']"));
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
        driver.findElement(By.cssSelector("input[id='hobbies-checkbox-3']"));
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
        //Locator Choose File button
        driver.findElement(By.cssSelector("input#uploadPicture"));
        //Locator Current Address field
        driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        //Locator State and City label
        driver.findElement(By.cssSelector("label#stateCity-label"));
        //Locator Submit button
        driver.findElement(By.cssSelector("button#submit"));
    }
}
