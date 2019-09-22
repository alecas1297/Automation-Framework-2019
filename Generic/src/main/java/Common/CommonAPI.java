package Common;

import jdk.jfr.events.ExceptionThrownEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.ebay.com") String url) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\aleja\\OneDrive\\Desktop\\project1\\Browser-Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
    // Helper Methods

    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.id(locator)).click();
        }catch(Exception ex){
            driver.findElement(By.className(locator)).click();
        }
        }

    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.className(locator)).sendKeys(value);
        }catch (Exception ex){
            driver.findElement(By.id(locator)).sendKeys(value);
        }
    }

}
