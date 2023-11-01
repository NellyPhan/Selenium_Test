import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_Toiuu_Practice02 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        //Find locator of First Name, Last Name, Email & Mobile
        String Input = "//input[@id='%s']";
        String xpathFirstName = String.format(Input,"firstName");
        driver.findElement(By.xpath(xpathFirstName)).sendKeys("Tram");
        String xpathLastName = String.format(Input,"lastName");
        driver.findElement(By.xpath(xpathLastName)).sendKeys("Phan");
        String xpathEmail = String.format(Input,"userEmail");
        driver.findElement(By.xpath(xpathEmail)).sendKeys("qtpt@gmail.com");
        String xpathMobile = String.format(Input,"userNumber");
        driver.findElement(By.xpath(xpathMobile)).sendKeys("0905900798");
        //Find locator of Gender: Male, Female and Others
        String Gender = "//label[text()='%s']";
        String xpathMale = String.format(Gender,"Male");
        System.out.println(xpathMale);
        driver.findElement(By.xpath(xpathMale)).click();
        String xpathFemale = String.format(Gender,"Female");
        driver.findElement(By.xpath(xpathFemale)).click();
        String xpathOther = String.format(Gender,"Other");
        driver.findElement(By.xpath(xpathOther)).click();
        //Find locator of Hobbies
        String Hobbies = "//label[text()='%s']";
        String xpathSports = String.format(Hobbies,"Sports");
        System.out.println(xpathSports);
        driver.findElement(By.xpath(xpathSports)).click();
        String xpathReading = String.format(Hobbies,"Reading");
        System.out.println(xpathReading);
        driver.findElement(By.xpath(xpathReading)).click();
        String xpathMusic = String.format(Hobbies,"Music");
        System.out.println(xpathMusic);
        driver.findElement(By.xpath(xpathMusic)).click();
        //Input date of birth
        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        String s = Keys.chord(Keys.CONTROL,"a");
        dateOfBirth.sendKeys("29 Apr 1996");
        dateOfBirth.sendKeys(Keys.ENTER);
        //Upload file
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\ASUS VIVOBOOK\\Test_Demo\\src\\main\\resources\\TestDateFile\\avt.jpg");

    }
}
