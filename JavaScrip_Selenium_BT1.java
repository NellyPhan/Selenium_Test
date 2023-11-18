import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JavaScrip_Selenium_BT1 {
    public static void main(String[] args) {
        //1. Khoi tao Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rise.fairsketch.com/events");
        //Login
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys(Keys.CONTROL,"a");
        Email.sendKeys("admin@demo.com");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(Keys.CONTROL,"a");
        Password.sendKeys("riseDemo");
        WebElement SignIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
        SignIn.click();
        //Kiem tra trang thai dang nhap thanh cong
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xpathLogo = "//img[@src='https://rise.fairsketch.com/files/system/default-stie-logo.png']";
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLogo)));
        //Truy cập [Events] menu
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Events']"))).click();
        //Kiểm tra tiêu đề [Event calendar] có được hiển thị không
        String xpathEventCanlendar = "//h1[text()='Event calendar'";
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathEventCanlendar)));
    }
}
