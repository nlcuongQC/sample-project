package opencommerce.collabase.pageobjects.verifyemail;

import org.openqa.selenium.By;

public class VerifyEmailPage {

    static final By EMAIL_VERIFICATION_SUCCESS_MSG = By.cssSelector(".unite-ui-login-typo-body");
    static final By GO_TO_DASHBOARD_BUTTON = By.xpath("//span[text() = 'Go to CollaBase dashboard']/parent::button");

}
