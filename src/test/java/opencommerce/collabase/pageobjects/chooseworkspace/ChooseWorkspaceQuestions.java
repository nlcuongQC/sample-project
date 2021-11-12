package opencommerce.collabase.pageobjects.chooseworkspace;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChooseWorkspaceQuestions extends UIInteractionSteps {

    @Step
    public void verifySelectWorkspaceTxtIs(String message) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(ChooseWorkspacePage.SELECT_WORKSPACE_TXT))).isDisplayed();
        $(ChooseWorkspacePage.SELECT_WORKSPACE_TXT).shouldContainText(message);
    }

    @Step
    public void verifyCreateWorkspaceBtnIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(ChooseWorkspacePage.CREATE_NEW_WORKSPACE_BTN))).isDisplayed();
    }
}
