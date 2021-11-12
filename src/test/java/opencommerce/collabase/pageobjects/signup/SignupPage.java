package opencommerce.collabase.pageobjects.signup;

import org.openqa.selenium.By;

public class SignupPage {

    static final By FULLNAME_TXTBX = By.id("fullname");
    static final By EMAIL_TXTBX = By.id("email");
    static final By PASSWORD_TXTBX = By.xpath("//input[@name='password']");
    static final By CONFIRM_PASSWORD_TXTBX = By.xpath("//input[@name='confirmPassword']");
    static final By SIGN_UP_BTN = By.xpath("//button[@native-type = 'submit']");

    static final String DYNAMIC_ERROR_MESSAGES = "//label[text() = '{0}']/../following-sibling::div/div[contains" +
            "(@class, 'error')]";
}
