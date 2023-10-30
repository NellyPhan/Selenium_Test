import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Advanced_Locator_Practice1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Find by contains
        driver.findElement(By.xpath("//input[contains(@placeholder,'name')]"));
        //Find by starts-with
        driver.findElement(By.xpath("//input[starts-with(@id,'userEm')]"));
        //Find by text()
        driver.findElement(By.xpath("//label[text()='Email']"));
        //Find by normalize-space()
        driver.findElement(By.xpath("//label[normalize-space()='Email']"));
        //Find by AND or OR
        driver.findElement(By.xpath("//input[contains(@placeholder, 'example.com')and @autocomplete='off']"));
        driver.findElement(By.xpath("//label[text()='Email' or @id ='userEmail-label']"));

    }
}
