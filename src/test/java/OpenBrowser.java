import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser{

    public static WebDriver driver;

    public static void open() throws InterruptedException {
        // Open Browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        try {
            // Open URL
            driver.get("http://office-task-tracker.s3-website.eu-north-1.amazonaws.com/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void maximizeBrowser() {
        try {
            // Maximise the Browser
            driver.manage().window().maximize();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickSignInButton() throws InterruptedException {
        try {
            //Click Create an account button
            driver.findElement(By.xpath("//button[@class='button-auth mt-5']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterEmailToLoginAccount() throws InterruptedException {
        try {
            //Enter Valid mail
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterPaswordToLoginAccount() throws InterruptedException {
        try {
            //Enter Valid mail
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void signOut() throws InterruptedException {
        try {
            //Click Create an account button
            driver.findElement(By.xpath("//i[@class='icon-logout']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

}
