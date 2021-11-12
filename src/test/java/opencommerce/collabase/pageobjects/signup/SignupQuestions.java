package opencommerce.collabase.pageobjects.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class SignupQuestions extends UIInteractionSteps {

    public static String email;

    String fieldName;

    public SignupQuestions verifyErrorMessageAtField(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public void is(String message) {
        $(SignupPage.DYNAMIC_ERROR_MESSAGES, fieldName).shouldContainText(message);
    }
}
