package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegistrationPage {
    CustomMethods customMethods = new CustomMethods();

    public String titleXpath = "//*[@id=\"id_gender1\"]";
    public String firstNameXpath = "//*[@id=\"customer_firstname\"]";
    public String lastNameXpath = "//*[@id=\"customer_lastname\"]";
    public String passwordXpath = "//*[@id=\"passwd\"]";
    public String daysXpath ="//*[@id=\"days\"]";
    public String daysChooseXpath ="//*[@id=\"days\"]/option[8]";
    public String monthXpath = "//*[@id=\"months\"]";
    public String monthChooseXpath = "//*[@id=\"months\"]/option[13]";
    public String yearXpath = "//*[@id=\"years\"]";
    public String yearChooseXpath = "//*[@id=\"years\"]/option[33]";
    public String registerButtonXpath = "//*[@id=\"submitAccount\"]";
    public String NAME_VALUE = customMethods.generateRandomString(5);
    public String LASTNAME_VALUE = customMethods.generateRandomString(7);
    public String PASSWORD_VALUE = customMethods.generateRandomString(6);


    public void RegistrationPage1(WebDriver driver)  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(this.titleXpath)).click();
        driver.findElement(By.xpath(this.firstNameXpath)).sendKeys(NAME_VALUE);
        driver.findElement(By.xpath(this.lastNameXpath)).sendKeys(LASTNAME_VALUE);
        driver.findElement(By.xpath(this.passwordXpath)).sendKeys(PASSWORD_VALUE);
        driver.findElement(By.xpath(this.daysXpath)).click();
        driver.findElement(By.xpath(this.daysChooseXpath)).click();
        driver.findElement(By.xpath(this.monthXpath)).click();
        driver.findElement(By.xpath(this.monthChooseXpath)).click();
        driver.findElement(By.xpath(this.yearXpath)).click();
        driver.findElement(By.xpath(this.yearChooseXpath)).click();
        driver.findElement(By.xpath(this.registerButtonXpath)).click();
    }

}

