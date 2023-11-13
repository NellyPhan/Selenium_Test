import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BuilScript_Alert_BT2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Access to "https://demo.guru99.com/test/delete_customer.php"
        driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
        //2. Input CustomerID
        driver.findElement(By.xpath("//td[text()='Customer ID']//following::input[position()=1]")).sendKeys("Vincent");
        //3. Click Submit button
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        //4. Check text
        Alert demoalert = driver.switchTo().alert();
        String actAlertText = demoalert.getText();
        //System.out.println("Actual text is " + demoAlertText);
        String expAlertText = "Do you really want to delete this Customer?";
        if (actAlertText.equals(expAlertText)) {
            System.out.println(String.format("The demo alert text is %s",actAlertText));
        } else {
            System.out.println(String.format("The demo alert text is not same, actual result: %s, expected result %s", actAlertText, expAlertText));


        }
    }
}
