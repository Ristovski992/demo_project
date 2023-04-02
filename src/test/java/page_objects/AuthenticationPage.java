package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AuthenticationPage {
    CustomMethods customMethods = new CustomMethods();
    public String REGISTRATION_EMAIL_ADDRESS_FIELD = "//*[@id=\"email_create\"]";
    public String SIGN_IN_BTN = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
    public String EMAIL_VALUE = customMethods.generateRandomStringWithNumbers(10)+"@test.com" ;


    public void Registration(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(this.SIGN_IN_BTN)).click();
        driver.findElement(By.xpath(this.REGISTRATION_EMAIL_ADDRESS_FIELD)).sendKeys(this.EMAIL_VALUE);
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
    }
}
