import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Element_BT1_Form {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        //Click Practice Form
//        driver.findElement(By.xpath("//span[text()='Practice Form']/parent::li")).click();
//        driver.findElement(By.xpath("//div[@class='element-list collapse show']")).click();
         //Find locator FristName, Last Name, Emai, Mobile
        String input = "//input[@placeholder='%s']";
        //First Name
        String xpathFirstName = String.format(input,"First Name");
        driver.findElement(By.xpath(xpathFirstName)).sendKeys("Tram");
        //Last Name
        String xpathLastName = String.format(input,"Last Name");
        driver.findElement(By.xpath(xpathLastName)).sendKeys("Phan");
        //Email
        String xpathEmail  = String.format(input,"name@example.com");
        driver.findElement(By.xpath(xpathEmail)).sendKeys("qtpt@gmail.com");
        //Mobile
        String xpathMobile  = String.format(input,"Mobile Number");
        driver.findElement(By.xpath(xpathMobile)).sendKeys("0905900798");
        //Gender radio button
        WebElement LabelMale = driver.findElement(By.xpath("//label[text()='Male']"));
        WebElement LabelFemale = driver.findElement(By.xpath("//label[text()='Female']"));
        WebElement LabelOther = driver.findElement(By.xpath("//label[text()='Other']"));
        String Radiobutton = "//input[@name='gender' and @value = '%s']";
        String xpathMale = String.format(Radiobutton,"Male");
        WebElement Male = driver.findElement(By.xpath(xpathMale));
        String xpathFemale = String.format(Radiobutton,"Female");
        WebElement Female = driver.findElement(By.xpath(xpathFemale));
        String xpathOther = String.format(Radiobutton,"Other");
        WebElement Other = driver.findElement(By.xpath(xpathOther));
        //Select the option of radio button - Other
        if (!Other.isSelected()){
            LabelOther.click();
        }
        //Date of birth field
        WebElement DateofBirth = driver.findElement(By.xpath("//input[@id ='dateOfBirthInput']"));
        DateofBirth.sendKeys(Keys.CONTROL,"a");
        DateofBirth.sendKeys("29 Apr 1996");
        DateofBirth.sendKeys(Keys.ENTER);
        //Subject
        driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).click();
        WebElement search = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        search.sendKeys("Math");
        search.sendKeys(Keys.ENTER);
        //Hobbies
        driver.findElement(By.xpath("//label[text()='Sports']")).click();
        driver.findElement(By.xpath("//label[text()='Reading']")).click();
        //Current Address
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("158 Tran Cao Van");
        //Upload file
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\ASUS VIVOBOOK\\Test_Demo\\src\\main\\resources\\TestDateFile\\avt 2.jpg");
        //Select State and City
        String inputselect = "//input[@id='%s']";
        //Select State
        driver.findElement(By.xpath("//div[@id='state']"));
        String xpathSelectState = String.format(inputselect,"react-select-3-input");
        WebElement SelectState = driver.findElement(By.xpath(xpathSelectState));
        SelectState.sendKeys("Uttar");
        SelectState.sendKeys(Keys.ENTER);
        //Select City
        driver.findElement(By.xpath("//div[@id='city']"));
        String xpathSelectCity = String.format(inputselect,"react-select-4-input");
        WebElement SelectCity = driver.findElement(By.xpath(xpathSelectCity));
        SelectCity.sendKeys("Agra");
        SelectCity.sendKeys(Keys.ENTER);
        //Click Submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

    }
}
