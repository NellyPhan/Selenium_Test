import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BasicLocator_Practice2_CSS {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        //Find elemet - Full Name field
        driver.findElement(By.cssSelector("input#userName"));
        driver.findElement(By.cssSelector("input.mr-sm-2.form-control"));
        driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        driver.findElement(By.cssSelector("input[id^='user']"));
        driver.findElement(By.cssSelector("input[id$='Name']"));
        driver.findElement(By.cssSelector("input[placeholder*='ll']"));
        driver.findElement(By.cssSelector("div[id='userName-wrapper']>div>input"));
        //Find elemet - Email field
        driver.findElement(By.cssSelector("input#userEmail"));
        driver.findElement(By.cssSelector("input.mr-sm-2.form-control"));
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        driver.findElement(By.cssSelector("input[placeholder^='name']"));
        driver.findElement(By.cssSelector("input[id*='mail']"));
        driver.findElement(By.cssSelector("div[id='userEmail-wrapper'] input"));
        //Find element - Current Address field
        driver.findElement(By.cssSelector("textarea#currentAddress"));
        driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        driver.findElement(By.cssSelector("textarea[placeholder*='ress'"));
        //Find element - Permanent Address
        driver.findElement(By.cssSelector("textarea#permanentAddress"));
        driver.findElement(By.cssSelector("textarea[cols*='2']"));
        driver.findElement(By.cssSelector("div[id='currentAddress-wrapper'] textarea"));
        //Find element - Submit button
        driver.findElement(By.cssSelector("button#submit"));
        driver.findElement(By.cssSelector("button[type='button']"));
        driver.findElement(By.cssSelector("div.mt-2.justify-content-end.row>div>button"));

    }
}
