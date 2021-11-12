package opencommerce.collabase.pageobjects.chooseworkspace;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ChooseWorkspaceActions extends UIInteractionSteps {

    @Step
    public void clickToTryUsingAnotherAccountLink() {
        $(ChooseWorkspacePage.TRY_USING_ANOTHER_ACCOUNT_LINK).click();
    }

    @Step
    public void clickToCreateNewWorkspaceBtn() {
        $(ChooseWorkspacePage.CREATE_NEW_WORKSPACE_BTN).click();
    }

    @Step
    public void chooseWorkspaceWithName(String name) {
        $(ChooseWorkspacePage.DYNAMIC_WORKSPACE, name).click();
    }
}
