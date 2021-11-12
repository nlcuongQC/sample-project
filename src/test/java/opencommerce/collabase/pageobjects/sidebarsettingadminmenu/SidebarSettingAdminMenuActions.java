package opencommerce.collabase.pageobjects.sidebarsettingadminmenu;

import common.enums.SettingsAdministrationMenu;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SidebarSettingAdminMenuActions extends UIInteractionSteps {

    @Step
    public void clickToMenu(SettingsAdministrationMenu name) {
        $(SidebarSettingAdminMenuPage.DYNAMIC_MENU, name.value).click();
    }

    @Step
    public void clickToBackToWorkspaceBtn() {
        $(SidebarSettingAdminMenuPage.BACK_TO_WORKSPACE_BTN).click();
    }
}
