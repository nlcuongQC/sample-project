package opencommerce.collabase.pageobjects.signin;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SigninPageActions extends UIInteractionSteps {

    @Step
    public void with(String email, String password) {
        $(SigninPage.EMAIL_TXTBX).sendKeys(email);
        $(SigninPage.PASSWORD_TXTBX).sendKeys(password);
        $(SigninPage.SIGN_IN_BTN).click();
    }

    @Step
    public void clickSignupLink() {
        $(SigninPage.SIGNUP_LINK).click();
    }

    @Step
    public void clickForgotPasswordLink() {
        $(SigninPage.FORGOT_PASSWORD_LINK).click();
    }
}
