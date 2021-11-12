package opencommerce.collabase.pageobjects.confirmationpopup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPopupActions extends UIInteractionSteps {
    @Step
    public void clickToYesBtn() {
        $(ConfirmationPopupPage.YES_BTN).click();
        waitForCondition().until(ExpectedConditions.invisibilityOf($(ConfirmationPopupPage.POPUP)));
    }
}
