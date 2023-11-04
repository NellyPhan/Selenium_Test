import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Revision_Locator_Rise {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open My Profile
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@id='user-dropdown']/span[position()=2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
        //Find Locator
//1. Find locator in Title
        //Upload File & Upload Image button
        String input = "//input[@id='%s']";
        String xpathUploadFile = String.format(input,"profile_image_file");
        driver.findElement(By.xpath(xpathUploadFile)).click();
        System.out.println(xpathUploadFile);
        String xpathUploadImage = String.format(input,"profile_image_file_upload");
        driver.findElement(By.xpath(xpathUploadImage)).click();
        //Avatar & Name
        driver.findElement(By.xpath("//span[contains(@class,'avatar')]//following-sibling::img"));
        driver.findElement(By.xpath("//span[contains(@class,'avatar')]//following::h4"));
        // Find information: Admin, Email, Mobile
        String input1 = "//div[@class='box-content pl15']//following::p[position()=%s]";
        String xpathAdmin = String.format(input1,"1");
        System.out.println(xpathAdmin);
        driver.findElement(By.xpath(xpathAdmin));
        String xpathEmail = String.format(input1,"2");
        System.out.println(xpathEmail);
       driver.findElement(By.xpath(xpathEmail));
 String xpathMobile = String.format(input1,"3");
 String text = driver.findElement(By.xpath(xpathMobile)).getText();
 System.out.println("In: " + text);
        Assert.assertEquals(text,"0923242935 duc123");
        System.out.println(xpathMobile);
        driver.findElement(By.xpath(xpathMobile));
 //2. General Information
        driver.findElement(By.xpath("//a[text()=' General Info']")).click();
        //Find Locator of First Name, Last Name, Phone, Alternative phone, Skype, Date of birth,SSN
        String input2 = "//input[@placeholder='%s']";
        //First Name
        String xpathFirstName = String.format(input2,"First name");
        WebElement FirstName = driver.findElement(By.xpath(xpathFirstName));
        FirstName.click();
        FirstName.sendKeys(Keys.CONTROL,"a");
        FirstName.sendKeys("Tram");
        //Last Name
        String xpathLastName = String.format(input2,"Last name");
        WebElement LastName = driver.findElement(By.xpath(xpathLastName));
        LastName.click();
        LastName.sendKeys(Keys.CONTROL,"a");
        LastName.sendKeys("Phan");
        //Phone
        String xpathPhone = String.format(input2,"Phone");
        WebElement Phone = driver.findElement(By.xpath(xpathPhone));
        LastName.click();
        LastName.sendKeys(Keys.CONTROL,"a");
        LastName.sendKeys("0905900798");
        //Alternative phone
        String xpathAlternativePhone = String.format(input2,"Alternative phone");
        WebElement AlternativePhone = driver.findElement(By.xpath(xpathAlternativePhone));
        AlternativePhone.click();
        AlternativePhone.sendKeys(Keys.CONTROL,"a");
        AlternativePhone.sendKeys("0905668899");
        //Skype
        String xpathSkype = String.format(input2,"Skype");
        WebElement Skype = driver.findElement(By.xpath(xpathSkype));
        Skype.click();
        Skype.sendKeys(Keys.CONTROL,"a");
        Skype.sendKeys("+08367777");
        //Date of Birth
        String xpathDateofBirth = String.format(input2,"Date of birth");
        WebElement DateofBirth = driver.findElement(By.xpath(xpathDateofBirth));
        DateofBirth.click();
        DateofBirth.sendKeys(Keys.CONTROL,"a");
        DateofBirth.sendKeys("29-04-1996");
        //SSN
        String xpathSSN = String.format(input2,"SSN");
        WebElement SSN = driver.findElement(By.xpath(xpathSSN));
        SSN.click();
        SSN.sendKeys(Keys.CONTROL,"a");
        SSN.sendKeys("ABC");
        //Find Locator of Mailing Address and Alternative Address
        String input3 = "//textarea[@id='%s']";
        //Mailling address
        String xpathMailling = String.format(input3,"address");
        WebElement Mailling = driver.findElement(By.xpath(xpathMailling));
        Mailling.click();
        Mailling.sendKeys(Keys.CONTROL,"a");
        Mailling.sendKeys("qt@gmail.com");
        //Alternative address
        String xpathAlternative = String.format(input3,"alternative_address");
        WebElement Alternative = driver.findElement(By.xpath(xpathAlternative));
        Alternative.click();
        Alternative.sendKeys(Keys.CONTROL,"a");
        Alternative.sendKeys("qtpt@gmail.com");
        //Find locator Gender
        String input4 = "//input[@value='%s']";
        //Male
        String genderMale = String.format(input4,"male");
        driver.findElement(By.xpath(genderMale)).click();
        //Female
        String genderFemale = String.format(input4,"female");
        driver.findElement(By.xpath(genderFemale)).click();
        //Other
        String genderOther = String.format(input4,"other");
        driver.findElement(By.xpath(genderOther)).click();
        //Save button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//3. Social Links
        //Facebook
        driver.findElement(By.xpath("//a[text()=' Social Links']")).click();
        String Links = "//input[@name='%s']";
        String xpathFacebook = String.format(Links,"facebook");
        WebElement Facebook = driver.findElement(By.xpath(xpathFacebook));
        Facebook.click();
        Facebook.sendKeys(Keys.CONTROL,"a");
        Facebook.sendKeys("fb.com/quynhtram");
        //Twitter
        String xpathTwitter = String.format(Links,"twitter");
        WebElement Twitter = driver.findElement(By.xpath(xpathTwitter));
        Twitter.click();
        Twitter.sendKeys(Keys.CONTROL,"a");
        Twitter.sendKeys("tw.com/quynhtram");
        //Linkedin
        String xpathLinkedin= String.format(Links,"linkedin");
        WebElement Linkedin = driver.findElement(By.xpath(xpathLinkedin));
        Linkedin.click();
        Linkedin.sendKeys(Keys.CONTROL,"a");
        Linkedin.sendKeys("lk.com/quynhtram");
        //WhatsApp
        String xpathWhatsApp = String.format(Links,"whatsapp");
        WebElement WhatsApp = driver.findElement(By.xpath(xpathWhatsApp));
        WhatsApp.click();
        WhatsApp.sendKeys(Keys.CONTROL,"a");
        WhatsApp.sendKeys("wa.me/quynhtram");
        //Digg
        String xpathDigg = String.format(Links,"digg");
        WebElement Digg = driver.findElement(By.xpath(xpathDigg));
        Digg.click();
        Digg.sendKeys(Keys.CONTROL,"a");
        Digg.sendKeys("digg.com/quynhtram");
        //Youtube
        String xpathYoutube = String.format(Links,"youtube");
        WebElement Youtube = driver.findElement(By.xpath(xpathYoutube));
        Youtube.click();
        Youtube.sendKeys(Keys.CONTROL,"a");
        Youtube.sendKeys("youtube.com/quynhtram");
        //Pinterest
        String xpathPinterest = String.format(Links,"pinterest");
        WebElement Pinterest = driver.findElement(By.xpath(xpathPinterest));
        Pinterest.click();
        Pinterest.sendKeys(Keys.CONTROL,"a");
        Pinterest.sendKeys("pinterest.com/quynhtram");
        //Instagram
        String xpathInstagram = String.format(Links,"instagram");
        WebElement Instagram = driver.findElement(By.xpath(xpathInstagram));
        Instagram.click();
        Instagram.sendKeys(Keys.CONTROL,"a");
        Instagram.sendKeys("instagram.com/quynhtram");
        //Github
        String xpathGithub = String.format(Links,"github");
        WebElement Github = driver.findElement(By.xpath(xpathGithub));
        Github.click();
        Github.sendKeys(Keys.CONTROL,"a");
        Instagram.sendKeys("github.com/quynhtram");
        //Tumblr
        String xpathTumblr = String.format(Links,"tumblr");
        WebElement Tumblr = driver.findElement(By.xpath(xpathTumblr));
        Tumblr.click();
        Tumblr.sendKeys(Keys.CONTROL,"a");
        Tumblr.sendKeys("tumblr.com/quynhtram");
        //Vine
        String xpathVine = String.format(Links,"vine");
        WebElement Vine = driver.findElement(By.xpath(xpathVine));
        Vine.click();
        Vine.sendKeys(Keys.CONTROL,"a");
        Vine.sendKeys("vine.co/quynhtram");
        //Save button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//4. Account settings
        driver.findElement(By.xpath("//a[text()=' Account settings']")).click();
        String Settings = "//input[@placeholder='%s']";
        //Email
        String xpathEmailSetting = String.format(Settings,"Email");
        WebElement Email =  driver.findElement(By.xpath(xpathEmailSetting));
        Email.click();
        Email.sendKeys(Keys.CONTROL,"a");
        Email.sendKeys("qt@gmail.com");
        //Password
        String xpathPassword = String.format(Settings,"Password");
        WebElement Password =  driver.findElement(By.xpath(xpathPassword));
        Password.click();
        Password.sendKeys(Keys.CONTROL,"a");
        Password.sendKeys("201751043");
        //Retype Password
        String xpathRetypePassword = String.format(Settings,"Retype password");
        WebElement RetypePassword =  driver.findElement(By.xpath(xpathRetypePassword));
        RetypePassword.click();
        RetypePassword.sendKeys(Keys.CONTROL,"a");
        RetypePassword.sendKeys("201751043");
        //Role
        driver.findElement(By.xpath("//div[text()='Admin']"));
        //Save button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//5. My preferences
        driver.findElement(By.xpath("//a[text()=' My preferences']")).click();
        String dropdown = "//a[@class='select2-choice']//following::span[@id='%s']";
        String inputDropdown = "//input[@id='%s']";
        String Value = "//div[@role = 'option' and text()='%s']//parent::li";
        //Notification sound volume dropdown
        String xpathVolume = String.format(dropdown,"select2-chosen-2");
        driver.findElement(By.xpath(xpathVolume)).click();
        String inputVolume = String.format(inputDropdown,"s2id_autogen2_search");
        WebElement Volume = driver.findElement(By.xpath(inputVolume));
        Volume.sendKeys("||");
        Volume.sendKeys(Keys.ENTER);
        //Enable web notification dropdown
        String xpathWeb = String.format(dropdown,"select2-chosen-16");
        driver.findElement(By.xpath(xpathWeb)).click();
        String inputWeb = String.format(inputDropdown,"s2id_autogen16_search");
        WebElement Web = driver.findElement(By.xpath(inputWeb));
        Web.sendKeys("No");
        Web.sendKeys(Keys.ENTER);
        //Enable email notification dropdown
        String xpathEmaildropdown = String.format(dropdown,"select2-chosen-6");
        driver.findElement(By.xpath(xpathEmaildropdown)).click();
        String inputEmaildropdown = String.format(inputDropdown,"s2id_autogen6_search");
        WebElement Emaildropdown = driver.findElement(By.xpath(inputEmaildropdown));
        Emaildropdown.sendKeys("No");
        Emaildropdown.sendKeys(Keys.ENTER);
        //Language dropdown
        String xpathLanguage = String.format(dropdown,"select2-chosen-8");
        driver.findElement(By.xpath(xpathLanguage)).click();
        String inputLanguage = String.format(inputDropdown,"s2id_autogen8_search");
        WebElement Language = driver.findElement(By.xpath(inputLanguage));
        Language.sendKeys("portu");
        Language.sendKeys(Keys.ENTER);
        //Hide menus from topbar
        String inputHidemenu = String.format(inputDropdown,"s2id_autogen15");
       // driver.findElement(By.xpath("//div[@id='s2id_hidden_topbar_menus']/ul")).click();
        WebElement HideMenu = driver.findElement(By.xpath(inputHidemenu));
        HideMenu.click();
//        HideMenu.sendKeys("Quick");
//        HideMenu.sendKeys(Keys.ENTER);
//        HideMenu.sendKeys("Language");
//        HideMenu.sendKeys(Keys.ENTER);
        String xpathValueHideMenu = String.format(Value,"To do");
        WebElement valueHideMenu = driver.findElement(By.xpath(xpathValueHideMenu));
        valueHideMenu.click();
        //Disable keyboard shortcuts dropdown
        String xpathKeyboard = String.format(dropdown,"select2-chosen-10");
        driver.findElement(By.xpath(xpathKeyboard)).click();
        String inputKeyboard = String.format(inputDropdown,"s2id_autogen10_search");
        WebElement Keyboard = driver.findElement(By.xpath(inputKeyboard));
        Keyboard.sendKeys("No");
        Keyboard.sendKeys(Keys.ENTER);
        // Recently meaning dropdown
        String xpathMeaning = String.format(dropdown,"select2-chosen-12");
        driver.findElement(By.xpath(xpathMeaning)).click();
        String inputMeaning = String.format(inputDropdown,"s2id_autogen12_search");
        WebElement Meaning = driver.findElement(By.xpath(inputMeaning));
        Meaning.sendKeys("5");
        Meaning.sendKeys(Keys.ENTER);
        //Snooze length dropdwon
        String xpathSnooze = String.format(dropdown,"select2-chosen-14");
        driver.findElement(By.xpath(xpathSnooze)).click();
        String inputSnooze = String.format(inputDropdown,"s2id_autogen14_search");
        WebElement Snooze = driver.findElement(By.xpath(inputSnooze));
        Snooze.sendKeys("20");
        Snooze.sendKeys(Keys.ENTER);
        //Save button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }
}