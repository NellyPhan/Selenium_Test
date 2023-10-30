import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Advanced_Locator_BT2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.xpath("//input[@placeholder='Full Name']//following::button[@id='submit']"));
        driver.findElement(By.xpath("//div[@id='userName-wrapper']//following-sibling::div[position()=1 and contains(@id,'userEmail')]"));
        driver.findElement(By.xpath("//button[@id='submit']/preceding::label[@id='currentAddress-label']"));
        driver.findElement(By.xpath("//div[@id='output']/preceding-sibling::div[@id='permanentAddress-wrapper']"));
        driver.findElement(By.xpath("//div[@id ='userEmail-wrapper']/descendant::label[@id='userEmail-label']"));
        driver.findElement(By.xpath("//div[@id ='userEmail-wrapper']/ancestor::form[@id='userForm']"));
    }
}
