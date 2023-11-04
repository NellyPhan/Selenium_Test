import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;
import java.time.Duration;

public class Locator_PersonDetails {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Login
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Username.click();
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.click();
        Password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Move to the Person Detail form
        driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
        //Find locator Employee Full Name
        driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
        String input = "//input[@placeholder='%s']";
        //First Name
        String xpathFirstName = String.format(input,"First Name");
        System.out.println(xpathFirstName);
        WebElement first = driver.findElement(By.xpath(xpathFirstName));
        first.click();
        first.sendKeys(Keys.CONTROL,"a");
        first.sendKeys("Tram");
        //Middle Name
        String xpathMiddleName = String.format(input,"Middle Name");
        System.out.println(xpathMiddleName);
        WebElement middle = driver.findElement(By.xpath(xpathMiddleName));
        middle.sendKeys(Keys.CONTROL,"a");
        middle.sendKeys("Quynh");
        //Last Name
        String xpathLastName = String.format(input,"Last Name");
        System.out.println(xpathLastName);
        WebElement last = driver.findElement(By.xpath(xpathLastName));
        last.sendKeys(Keys.CONTROL,"a");
        last.sendKeys("Phan");
        // Find locator for Nick Name, Employee ID, Other ID, Driver's License, SS Number, Sin number, Military Service
        String input2 = "//label[text()='%s']//following::input[@class='oxd-input oxd-input--active'and position()=1]";
        //Nick Name
        String xpathNickName = String.format(input2,"Nickname");
        driver.findElement(By.xpath(xpathNickName)).sendKeys("Nelly");
        //Employee ID
        String xpathEmployeeID = String.format(input2,"Employee Id");
        driver.findElement(By.xpath(xpathEmployeeID)).sendKeys("4100114");
        //Other ID
        String xpathOtherID = String.format(input2,"Other Id");
        driver.findElement(By.xpath(xpathOtherID)).sendKeys("004100774");
        //Drive's License
//        String xpathDriveLicense = String.format(input2,"Driver's License Number");
//        driver.findElement(By.xpath(xpathDriveLicense)).sendKeys("43D11000");
        //SS Number
        String xpathSSNumber = String.format(input2,"SSN Number");
        driver.findElement(By.xpath(xpathSSNumber)).sendKeys("77177D");
        //Sin Number
        String xpathSinNumber = String.format(input2,"SIN Number");
        driver.findElement(By.xpath(xpathSinNumber)).sendKeys("77177E");
        //Military Service
        String xpathMilitary = String.format(input2,"Military Service");
        driver.findElement(By.xpath(xpathMilitary)).sendKeys("Food Technology");
        // License Expiry Date
        String xpathLicenceDate = String.format(input2,"License Expiry Date");
        WebElement LicenseDate = driver.findElement(By.xpath(xpathLicenceDate));
        LicenseDate.sendKeys(Keys.CONTROL,"a");
        LicenseDate.sendKeys("2014-22-11");
        LicenseDate.sendKeys(Keys.ENTER);
        // Date of Birth
        String xpathDateofBirth = String.format(input2,"Date of Birth");
        WebElement DateofBirth = driver.findElement(By.xpath(xpathDateofBirth));
        DateofBirth.sendKeys(Keys.CONTROL,"a");
        DateofBirth.sendKeys("1996-22-11");
        DateofBirth.sendKeys(Keys.ENTER);

    }
}
