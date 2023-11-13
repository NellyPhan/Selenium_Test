import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tuongtac_AlertTH2 {
    public static void main (String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alertsWindows");
        //1. Click "Alerts" of the menu bar
        driver.findElement(By.xpath("//span[text()='Alerts']/parent::li[position()=1]")).click();
        //2. Open each alert by clicking on [Click me] button
          String xpathClickMe = "//button[@id='%s']";
//        //Open the first alert
//        String xpathFirstClickMe = String.format(xpathClickMe,"alertButton");
//        WebElement FirstClickMe = driver.findElement(By.xpath(xpathFirstClickMe));
//        FirstClickMe.click();
        //Open the second alert
//        String xpathSecondClickMe = String.format(xpathClickMe,"timerAlertButton");
//        WebElement SecondClickMe = driver.findElement(By.xpath(xpathSecondClickMe));
//        SecondClickMe.click();
//        //Open the third alert
//        String xpathThirdClickMe = String.format(xpathClickMe,"confirmButton");
//        WebElement ThirdClickMe = driver.findElement(By.xpath(xpathThirdClickMe));
//        ThirdClickMe.click();
//        //Open the fourth alert
        String xpathForthClickMe = String.format(xpathClickMe,"promtButton");
        WebElement ForthClickMe = driver.findElement(By.xpath(xpathForthClickMe));
        ForthClickMe.click();
        //3. Get data and print the console screen
        //Switch alert
        Alert forthalert = driver.switchTo().alert();
        //Get text
        String forthAlertText = forthalert.getText();
        //Print text alert
        System.out.println("Text of alert is : " + forthAlertText);
        forthalert.sendKeys("Automation Test");
        forthalert.accept();
        WebElement Textappear = driver.findElement(By.id("promptResult"));
        System.out.println("Text appear: " + Textappear.getText());



    }
}
