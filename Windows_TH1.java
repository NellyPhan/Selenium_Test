import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Windows_TH1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alertsWindows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click Browser Window
        String xpathBrowser = "//span[text()='Browser Windows']";
        driver.findElement(By.xpath(xpathBrowser)).click();
        //Click 3 button (New Tab, New Window, New Window Message
        String textButton = "//button[text()='%s']";
//        String xpathNewTab = String.format(textButton, "New Tab");
//        WebElement NewTab = driver.findElement(By.xpath(xpathNewTab));
//        NewTab.click();
//        String xpathNewWindow = String.format(textButton, "New Window");
//        WebElement NewWindow = driver.findElement(By.xpath(xpathNewWindow));
//        NewWindow.click();
        String xpathWindowMessagge = String.format(textButton, "New Window Message");
        WebElement NewWindowMessage = driver.findElement(By.xpath(xpathWindowMessagge));
        NewWindowMessage.click();

    }
}
