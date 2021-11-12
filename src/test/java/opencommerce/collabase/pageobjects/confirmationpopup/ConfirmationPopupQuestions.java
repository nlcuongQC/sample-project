package opencommerce.collabase.pageobjects.confirmationpopup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPopupQuestions extends UIInteractionSteps {
    @Step
    public void verifyPopupIsNotDisplayed() {
        waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(ConfirmationPopupPage.POPUP));
    }
}
