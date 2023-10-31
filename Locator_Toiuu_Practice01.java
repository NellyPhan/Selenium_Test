import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_Toiuu_Practice01 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Locator for Full Name and Email
        String Input ="//input[@placeholder='%s' and @type='%s']";
        String xpathFullName = String.format(Input,"Full Name","text");
        String xpathEmail = String.format(Input,"name@example.com","email");
        driver.findElement(By.xpath(xpathFullName)).sendKeys("Quynh Tram");
        driver.findElement(By.xpath(xpathEmail)).sendKeys("qtphan@gmail.com");
        //Locator for Current Address and Permanent Address
        String Address ="//textarea [@id='%s']";
        String currentAddress = String.format(Address,"currentAddress");
        System.out.println("Xpath of currentAddress" + currentAddress);
        driver.findElement(By.xpath(currentAddress)).sendKeys("158 Tran Cao Van");
        String permanentAddress = String.format(Address,"permanentAddress");
        driver.findElement(By.xpath(permanentAddress)).sendKeys("23 Tran Quoc Toan");
    }
}
