package tests;

import org.testng.annotations.Test;
import page_objects.AuthenticationPage;
import page_objects.RegistrationPage;

public class Register extends HelperClass {
    AuthenticationPage authenticationPage = new AuthenticationPage();
    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    public void MakeSuccessfullRegistration() throws InterruptedException {
        driver.get("http://automationpractice.pl/index.php");
        authenticationPage.Registration(driver);
        registrationPage.shouldMakeRegistration(driver);
    }
}
