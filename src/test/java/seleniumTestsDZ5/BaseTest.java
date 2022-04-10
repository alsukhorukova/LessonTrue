package seleniumTestsDZ5;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.Common;
import testData.WordsTestData;
import utils.PropertyLoader;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class BaseTest {
    WebDriver driver;

    protected Common c = new Common();

    public static String setStendKey = System.setProperty("StendKey", "stend1");
    public static String stendKey = System.getProperty("StendKey");
    public static String stendUrl = PropertyLoader.loadProperty(stendKey);

    @BeforeTest
    public void beforeT() {
        //System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        //ChromeOptions op = new ChromeOptions();
        //DesiredCapabilities dc = DesiredCapabilities.chrome();
        //dc.setCapability(ChromeOptions.CAPABILITY, op);
        //driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        FirefoxOptions op = new FirefoxOptions();
//        DesiredCapabilities dc = DesiredCapabilities.firefox();
//        dc.setCapability(FirefoxOptions.FIREFOX_OPTIONS, op);
//        driver = new FirefoxDriver();

        //op.setCapability("version","selenoid_buharova");

        URL hub = null;

        try {
           hub = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
        if (driver!=null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Attachment(value = "PageScreenshot", type = "image/png")
    public byte[] getScreenShot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
