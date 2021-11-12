package opencommerce.collabase.pageobjects.verifyemail;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class VerifyEmailActions extends UIInteractionSteps {

    @Step
    public void clickToGoToDashboardBtn() {
        $(VerifyEmailPage.GO_TO_DASHBOARD_BUTTON).click();
    }

}
