package opencommerce.collabase.pageobjects.header;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class HeaderActions extends UIInteractionSteps {

    @Step
    public void clickToUserAvatar() {
        $(HeaderPage.USER_AVATAR_BTN).click();
    }

    @Step
    public void clickToNotificationBtn() {
        $(HeaderPage.NOTIFICATION_BTN).click();
    }
}
