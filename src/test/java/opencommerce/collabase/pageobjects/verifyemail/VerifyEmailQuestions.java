package opencommerce.collabase.pageobjects.verifyemail;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class VerifyEmailQuestions extends UIInteractionSteps {

    @Step
    public void verifySuccessMessageIs(String message) {
        $(VerifyEmailPage.EMAIL_VERIFICATION_SUCCESS_MSG).shouldContainText(message);
    }

}
