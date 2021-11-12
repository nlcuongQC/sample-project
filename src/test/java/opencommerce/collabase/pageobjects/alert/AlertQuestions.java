package opencommerce.collabase.pageobjects.alert;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;


public class AlertQuestions extends UIInteractionSteps {
    public void verifyConfirmEmailIs(String message) {
        assertThat($(AlertPage.CONFIRM_EMAIL_MSG).getText().contains(message)).isTrue();
    }

    public void verifyConfirmEmailIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AlertPage.CONFIRM_EMAIL_MSG))).isDisplayed();
    }

    public void verifyConfirmEmailIsNotDisplayed() {
        $(AlertPage.CONFIRM_EMAIL_MSG).shouldNotBeVisible();
    }

    public void verifySuccessBottomMessageIs(String message) {
        $(AlertPage.SUCCESS_BOTTOM_MSG).shouldContainText(message);
    }

    public void verifySuccessTopMessageIs(String message) {
        assertThat($(AlertPage.SUCCESS_TOP_MSG).getText().contains(message)).isTrue();
    }

    public void verifyRedAlertBottmMessageIs(String message) {
        assertThat($(AlertPage.RED_BOTTOM_MSG).getText().contains(message)).isTrue();
    }

    public void verifyRedAlertBottmMessageIsNotDisplayed() {
        $(AlertPage.RED_BOTTOM_MSG).shouldNotBeVisible();
    }

    public void verifyRedAlertTopMessageIs(String message) {
        $(AlertPage.RED_TOP_MSG).shouldContainText(message);
    }
}
