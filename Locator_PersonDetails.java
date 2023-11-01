import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;
import java.time.Duration;

public class Locator_PersonDetails {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Login
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Username.click();
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.click();
        Password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Move to the Person Detail form
        driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
        //Find locator Employee Full Name
        driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
        String Input = "//input[@placeholder='%s']";
        //First Name
        String xpathFirstName = String.format(Input,"First Name");
        System.out.println(xpathFirstName);
        WebElement first = driver.findElement(By.xpath(xpathFirstName));
        String s = Keys.chord(Keys.CONTROL,"a");
        first.sendKeys("Tram");
        //Middle Name
        String xpathMiddleName = String.format(Input,"Middle Name");
        System.out.println(xpathMiddleName);
        WebElement middle = driver.findElement(By.xpath(xpathMiddleName));
        String m = Keys.chord(Keys.CONTROL,"a");
        middle.sendKeys("Quynh");
        //Last Name
        String xpathLastName = String.format(Input,"Last Name");
        System.out.println(xpathLastName);
        WebElement last = driver.findElement(By.xpath(xpathLastName));
        String l = Keys.chord(Keys.CONTROL,"a");
        middle.sendKeys("Phan");
        // Find locator for Employee ID, Other ID, Driver's License, SS Number, Sin number



    }
}
