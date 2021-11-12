package opencommerce.collabase.pageobjects.signin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:colla.signin")
public class SigninPage extends PageObject {
    static final By EMAIL_TXTBX = By.id("email");
    static final By PASSWORD_TXTBX = By.id("password");
    static final By SIGN_IN_BTN = By.xpath("//button[@native-type = 'submit']");
    static final By ERROR_TXT = By.xpath("//i[contains(@class, 'alert')]/../following-sibling::p");
    static final By SIGNUP_LINK = By.xpath("//a[@href='/sign-up']");
    static final By FORGOT_PASSWORD_LINK = By.xpath("//a[@href='/reset-password']");

    //Dynamic xpath
    static final String DYNAMIC_ERROR_MESSAGES = "//label[text() = '{0}']/../following-sibling::div/div[contains" +
            "(@class, 'error')]";
}
