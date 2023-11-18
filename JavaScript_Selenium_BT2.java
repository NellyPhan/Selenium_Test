import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JavaScript_Selenium_BT2 {
    public static void main(String[] args) throws InterruptedException {
        //1. Khoi tao Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(" https://demoqa.com/droppable");
        //2.Khoi tao JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Drap me
        WebElement DrapMe = driver.findElement(By.id("draggable"));
        //Drop here
        WebElement DropHere = driver.findElement(By.id("droppable"));
        js.executeScript("arguments[0].scrollIntoView(true);",DrapMe);
        js.executeScript("arguments[0].scrollIntoView(true);",DropHere);
        Thread.sleep(300);
        js.executeScript("arguments[0].simulateDragDrop(arguments[1]);",DrapMe,DropHere);
//        Actions builder = new Actions(driver);
//        builder.dragAndDrop(DrapMe,DropHere).build().perform();
        //3. Alert
        js.executeScript("alert('Successfully.');");


    }
}
