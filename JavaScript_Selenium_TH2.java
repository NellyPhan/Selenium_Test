import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScript_Selenium_TH2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Input field
        String xpathTextfield = "//input[@placeholder='%s']";
        //Full Name
        String xpathFullName = String.format(xpathTextfield,"Full Name");
        WebElement FullName = driver.findElement(By.xpath(xpathFullName));
        js.executeScript("arguments[0].value = 'Tram Phan';",FullName);
        String text = (String) js.executeScript("return arguments[0].value;",FullName);
        System.out.println("Full Name is " + text);
        //Email
        String xpathEmail = String.format(xpathTextfield,"name@example.com");
        WebElement Email = driver.findElement(By.xpath(xpathEmail));
        js.executeScript("arguments[0].value = 'qt@gmail.com';",Email);
        String text1 = (String) js.executeScript("return arguments[0].value;",Email);
        System.out.println("Email is " + text1);
        //Textarea field
        String xpathTextarea = "//textarea[@id='%s']";
        //Current Address
        String xpathCurrentAddress = String.format(xpathTextarea,"currentAddress");
        WebElement CurrentAddress = driver.findElement(By.xpath(xpathCurrentAddress));
        js.executeScript("arguments[0].value = '158 Tran Cao Van Street';", CurrentAddress);
        String text2 = (String) js.executeScript("return arguments[0].value;",CurrentAddress);
        System.out.println("Current Address is " + text2);
        //Permanent Address
        String xpathPermanentAddress = String.format(xpathTextarea,"permanentAddress");
        WebElement PermanentAddress = driver.findElement(By.xpath(xpathPermanentAddress));
        js.executeScript("arguments[0].value ='71 Nguyen Truong to';",PermanentAddress);
        String text3 = (String) js.executeScript("return arguments[0].value;",PermanentAddress);
        System.out.println("Permanent Address is " +text3);
        //Click Submit button
        WebElement Submit = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()",Submit);

    }

}
