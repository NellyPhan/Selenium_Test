import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tuongtac_Flame_TH3 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alertsWindows");
        //1. Click "Frames" of the menu bar
        driver.findElement(By.xpath("//span[text()='Frames']/parent::li[position()=1]")).click();
        //Indetify each frames, access and get text
        //Search and verify
        String xpathframe = "//iframe[@id='frame1']";
        String xpathfirstFrames = String.format(xpathframe,"frame1");
        WebElement FirstframeElement = driver.findElement(By.xpath(xpathfirstFrames));
        String xpathsecondFrames = String.format(xpathframe,"frame2");
        WebElement SecondframeElement = driver.findElement(By.xpath(xpathsecondFrames));
        //Religon Frame verification
        String Frameheight = "450px";
        String actFrameHeight = FirstframeElement.getAttribute("height");
        if (Frameheight.equals(actFrameHeight)){
            System.out.println(String.format("The width of frame: %s", actFrameHeight));}
        else { System.out.println(String.format("The width of frame is not same: actual :%s, expected: %s",actFrameHeight,Frameheight));}
        //Access to the frame
        driver.switchTo().frame(FirstframeElement);
        WebElement Textframe = driver.findElement(By.id("sampleHeading"));
        System.out.println("Currently text: " +Textframe.getText());
        //Verify text of alert
        String expTextFrame = "This is a example page";
        String actTextFrame = Textframe.getText();
        if (actTextFrame.equals(expTextFrame)){
            System.out.println(String.format("The frame text: %s",actTextFrame));}
        else {System.out.println(String.format("The result is not same, actual text: %s, expected text: %s",actTextFrame,expTextFrame));}
        }
            }

