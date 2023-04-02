package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegistrationPage {
    CustomMethods customMethods = new CustomMethods();

    public String TITLE_MR_CHECKBOX = "//*[@id=\"id_gender1\"]";
    public String FIRST_NAME_FIELD = "//*[@id=\"customer_firstname\"]";
    public String LAST_NAME_FIELD = "//*[@id=\"customer_lastname\"]";
    public String PASSWORD_FIELD = "//*[@id=\"passwd\"]";
    public String DAY_DROP_DOWN ="//*[@id=\"days\"]";
    public String DAY_SELECT = "//*[@id=\"days\"]/option[5]";
    public String MONTH_DROP_DOWN = "//*[@id=\"months\"]";
    public String MONTH_SELECT = "//*[@id=\"months\"]/option[13]";
    public String YEAR_DROP_DOWN = "//*[@id=\"years\"]";
    public String YEAR_SELECT = "//*[@id=\"years\"]/option[33]";
    public String REGISTER_BTN = "//*[@id=\"submitAccount\"]";
    public String NAME_VALUE = customMethods.generateRandomStringWithoutNumbers(5);
    public String LASTNAME_VALUE = customMethods.generateRandomStringWithoutNumbers(7);
    public String PASSWORD_VALUE = customMethods.generateRandomStringWithNumbers(6);
    public String SUCCESSFUL_MESSAGE ="Your account has been created.";


    public void shouldMakeRegistration(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(this.TITLE_MR_CHECKBOX)).click();
        driver.findElement(By.xpath(this.FIRST_NAME_FIELD)).sendKeys(NAME_VALUE);
        driver.findElement(By.xpath(this.LAST_NAME_FIELD)).sendKeys(LASTNAME_VALUE);
        driver.findElement(By.xpath(this.PASSWORD_FIELD)).sendKeys(PASSWORD_VALUE);
        driver.findElement(By.xpath(this.DAY_DROP_DOWN)).click();
        driver.findElement(By.xpath(this.DAY_SELECT)).click();
        driver.findElement(By.xpath(this.MONTH_DROP_DOWN)).click();
        driver.findElement(By.xpath(this.MONTH_SELECT)).click();
        driver.findElement(By.xpath(this.YEAR_DROP_DOWN)).click();
        driver.findElement(By.xpath(this.YEAR_SELECT)).click();
        driver.findElement(By.xpath(this.REGISTER_BTN)).click();
        String text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
        if (text.equals(SUCCESSFUL_MESSAGE)){
            System.out.println(SUCCESSFUL_MESSAGE);
        }else {
            System.out.println("Account was not created");
        }
    }

}

