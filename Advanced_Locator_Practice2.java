import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Advanced_Locator_Practice2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Find by ancestor
        driver.findElement(By.xpath("//textarea[@id='currentAddress']/ancestor::form[@id='userForm']"));
        //Find by descendant
        driver.findElement(By.xpath("//form[@id='userForm']/descendant::div[@id='currentAddress-wrapper']"));
        //Find by preceding
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']/preceding::div[@id='Ad.Plus-728x90']"));
        //Find by following
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']/following::div[@class='text-right col-md-2 col-sm-12']"));
        //Find by preceding-sibling
        driver.findElement(By.xpath("//div[contains(@id,'userEmail')]/preceding-sibling::div[position()=1]"));
        //Find by following-sibling
        driver.findElement(By.xpath("//div[contains(@id,'userEmail')]/following-sibling::div[last()]"));
    }
}
