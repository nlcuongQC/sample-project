package opencommerce.collabase.pageobjects.signin;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class SigninPageQuestions extends UIInteractionSteps {

    String message;

    public SigninPageQuestions verifyErrorMessage(String message) {
        this.message = message;
        return this;
    }

    @Step
    public void atField(String fieldName) {
        assertThat($(SigninPage.DYNAMIC_ERROR_MESSAGES, fieldName).getText().contains(message)).isTrue();
    }

    @Step
    public void verifyErrorSigninMessage(String message) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(SigninPage.ERROR_TXT))).isDisplayed();
        assertThat($(SigninPage.ERROR_TXT).getText().contains(message)).isTrue();
    }

    @Step
    public void verifySigninPageIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(SigninPage.EMAIL_TXTBX))).isDisplayed();
    }
}
