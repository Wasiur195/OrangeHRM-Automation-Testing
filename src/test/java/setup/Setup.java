package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    //setting up basic setup and driver

    public WebDriver driver;

    @BeforeTest (groups = "smoke")
    public void setup () {
        //setting up connect with chrome driver with external Driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterTest (groups = "smoke")
    public void close () throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }
}