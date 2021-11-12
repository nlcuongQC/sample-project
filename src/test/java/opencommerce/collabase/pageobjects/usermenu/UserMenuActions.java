package opencommerce.collabase.pageobjects.usermenu;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class UserMenuActions extends UIInteractionSteps {

    @Step
    public void clickToSignoutBtn() {
        $(UserMenuPage.SIGNOUT_BTN).click();
    }
}
