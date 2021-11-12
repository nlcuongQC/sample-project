package opencommerce.collabase.pageobjects.forgotpassword;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends PageObject {
    //Target
    static final By EMAIL_TXTBX = By.xpath("//input[@name = 'email-address']");
    static final By ERROR_MESSAGE = By.cssSelector(".s-form-item__error");
    static final By SUCCESS_MODAL = By.xpath("//div[contains(@class, 'bg-success')]");
    static final By SUBMIT_BTN = By.xpath("//button[@nativetype='submit']");

}
