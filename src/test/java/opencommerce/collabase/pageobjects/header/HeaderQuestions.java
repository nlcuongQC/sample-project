package opencommerce.collabase.pageobjects.header;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderQuestions extends UIInteractionSteps {

    @Step
    public void verifyUserAvatarIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(HeaderPage.USER_AVATAR_BTN))).isDisplayed();
    }
}
