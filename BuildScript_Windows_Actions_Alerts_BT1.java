import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BuildScript_Windows_Actions_Alerts_BT1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Access to "https://test.warface.codegym.vn"
        driver.navigate().to("https://test.warface.codegym.vn");
        //2. Open a new tab and access to "https://test.warface.codegym.vn/login"
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://test.warface.codegym.vn/login");
        //Login: input email and password
        String inputaccount = "//input[@placeholder='%s']";
        String xpathEmail = String.format(inputaccount, "Email address");
        driver.findElement(By.xpath(xpathEmail)).sendKeys("qt@gmail.com");
        String xpathPassword = String.format(inputaccount, "Password");
        driver.findElement(By.xpath(xpathPassword)).sendKeys("201751043");
        //4. Click Đăng nhập
        driver.findElement(By.xpath("//button[text()= 'Đăng nhập']")).click();
        //5. Back to the page > Refresh > Close tab
        //Back to the first page
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //Close the tab
        driver.close();
        //6. Add 2 products
        WebElement product1 = driver.findElement(By.xpath("//h6[text()='Iphone 6e9h0pfbbni']/following::a[text()='Mua hàng' and position()=2]"));
        product1.click();
        driver.findElement(By.xpath("//h6[text()='Iphonexuiibszf4voayqcqalswq']/following::a[text()='Mua hàng' and position()=2]")).click();
        //7. Move to Cart and check
        driver.findElement(By.xpath("//span[text()=2]//parent::a[@href = 'https://test.warface.codegym.vn/cart']")).click();
        //Check product
        String textproduct1 = product1.getText();
        WebElement cartproduct1 = driver.findElement(By.xpath("//img[@src='https://test.warface.codegym.vn/storage/product/4PmrDhPa6WO3z1qcBYgA5vSvPL9Yyew7AiKPnXpo.jpg']//parent::td"));
        String textcartproduct1 = cartproduct1.getText();
        if (textcartproduct1.equals(textproduct1)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

        }




    }
}
