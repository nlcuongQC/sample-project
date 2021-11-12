package opencommerce.collabase.pageobjects.createpassword;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class CreatePasswordQuestions extends UIInteractionSteps {
    String fieldName;

    public CreatePasswordQuestions verifyErrorMessageAtField(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public void is(String message) {
        $(CreatePasswordPage.DYNAMIC_ERROR_TEXT_AT_FIELD, fieldName).shouldContainText(message);
    }

}
