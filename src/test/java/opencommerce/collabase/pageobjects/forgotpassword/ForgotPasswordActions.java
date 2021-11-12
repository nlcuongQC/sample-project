package opencommerce.collabase.pageobjects.forgotpassword;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ForgotPasswordActions extends UIInteractionSteps {

    @Step
    public void inputEmail(String email) {
        $(ForgotPasswordPage.EMAIL_TXTBX).sendKeys(email);
    }

    @Step
    public void submit() {
        $(ForgotPasswordPage.SUBMIT_BTN).click();
    }

}
