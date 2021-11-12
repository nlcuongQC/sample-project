package opencommerce.collabase.pageobjects.forgotpassword;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class ForgotPasswordQuestions extends UIInteractionSteps {

    @Step
    public void verifyErrorMessage(String email) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(ForgotPasswordPage.ERROR_MESSAGE))).isDisplayed();
        assertThat($(ForgotPasswordPage.ERROR_MESSAGE).getText().contains(email)).isTrue();
    }

    @Step
    public void verifyForgotPasswordSuccessModalIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(ForgotPasswordPage.SUCCESS_MODAL))).isDisplayed();
    }
}
