import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait_Selenium_TH1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alertsWindows");
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.navigate().to("https://demoqa.com");
        //Wait logo shown
        String xpathLogo = "//img[@src='/images/Toolsqa.jpg']";
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLogo)));
        //Click Form, check ready for click
        String xpathForm = "//h5[text()='Forms']";
        WebElement form = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathForm)));
        form.click();
        //Click Practice Form, check ready for click
        String xpathPracticeForm ="//span[text()='Practice Form']//parent::li";
        WebElement PracticeForm = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathPracticeForm)));
        PracticeForm.click();

    }
}
