import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelperClass {
    ChromeDriver driver;
    @BeforeMethod
    public void setUp(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        ops.addArguments("--start-maximized");
        driver = new ChromeDriver(ops);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
