import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Element_Checkbox_BT2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Access to website
        driver.get("https://demoqa.com/elements");
        //2. Click Check Box
        //driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//following-sibling::li[@id='item-1']")).click();
        //3. Click [+] Expand All button
        driver.findElement(By.xpath("//button[@title='Expand all']")).click();
        //4. Select checkbox : Commands, Angular, Private, Excel File
        //Commands checkbox
        driver.findElement(By.xpath("//input[@id='tree-node-commands']//following::span[@class='rct-checkbox' and position()=1]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[text()='Commands']/preceding::span[@class='rct-checkbox' and position()=2]")).click();
        //Angular checkbox
        driver.findElement(By.xpath("//input[@id='tree-node-angular']//following::span[@class='rct-checkbox' and position()=1]")).click();
        Thread.sleep(2000);
        //Private checkbox
        driver.findElement(By.xpath("//input[@id='tree-node-private']//following::span[@class='rct-checkbox' and position()=1]")).click();
        Thread.sleep(2000);
        //Excel File checkbox
        driver.findElement(By.xpath("//input[@id='tree-node-excelFile']//following::span[@class='rct-checkbox' and position()=1]")).click();
        Thread.sleep(2000);
        //Check Collapse all -
        driver.findElement(By.xpath("//button[@title='Collapse all']")).click();







    }

}
