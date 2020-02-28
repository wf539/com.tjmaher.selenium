package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by User on 2016-10-29.
 */
public class PurchaseOrderTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void navigateToAmazon() {
        driver.get("http://www.amazon.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
