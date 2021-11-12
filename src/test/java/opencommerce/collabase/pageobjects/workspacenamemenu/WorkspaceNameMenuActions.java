package opencommerce.collabase.pageobjects.workspacenamemenu;

import common.enums.WorkspaceMenu;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.common.CommonActions;

public class WorkspaceNameMenuActions extends UIInteractionSteps {

    @Steps
    CommonActions commonActions;

    @Step
    public void clickToMenu(WorkspaceMenu name) {
        $(WorkspaceNameMenuPage.DYNAMIC_MENU_NAME, name.value).click();
    }

    @Step
    public void clickToSignoutBtn() {
        commonActions.jsClickToElement($(WorkspaceNameMenuPage.SIGNOUT_BTN));
    }
}
