import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Element_Practice1_TextboxandButton {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String input = "//input[@placeholder='%s']";
        String textarea = "//textarea[@id='%s']";
        //Full Name
        String xpathFullName = String.format(input,"Full Name");
        WebElement FullName = driver.findElement(By.xpath(xpathFullName));
        FullName.sendKeys("Vincent");
        //Email
        String xpathEmail = String.format(input,"name@example.com");
        WebElement Email = driver.findElement(By.xpath(xpathEmail));
        Email.sendKeys("vincent@gmail.com");
        //Current Address
        String xpathCurrent = String.format(textarea,"currentAddress");
        WebElement CurrentAddress = driver.findElement(By.xpath(xpathCurrent));
        CurrentAddress.sendKeys("KĐT Nam Trung Yên, P. Yên Hòa, Q. Cầu Giấy, TP Hà Nội");
        //Permanent Address
        String xpathPermanent = String.format(textarea,"permanentAddress");
        WebElement PermanentAddress = driver.findElement(By.xpath(xpathPermanent));
        PermanentAddress.sendKeys("Q. Cầu Giấy, TP Hà Nội");
        //Click Submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
