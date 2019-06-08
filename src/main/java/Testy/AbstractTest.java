package Testy;

import utils.CustomPath;
import utils.CustomScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;
    protected static CustomScreenShot customScreenShot;


    @BeforeSuite
    public void setUpSuite() {


        customScreenShot = new CustomScreenShot();


        System.setProperty(
                "webdriver.chrome.driver",
                new CustomPath().getResourcePath("chromedriver.exe")
        );

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://jakdojade.pl");
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            customScreenShot.makeScreenShot(driver, new Date().getTime() + "_" + result.getMethod().getMethodName());
        }


    }

    @AfterSuite
    public void tearDownSuite() {

        driver.quit();
    }
}
