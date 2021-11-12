package opencommerce.collabase.pageobjects.teamheader;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class TeamHeaderActions extends UIInteractionSteps {

    String menuName;

    @Step
    public TeamHeaderActions atMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    @Step
    public void clickToSubMenu() {
        $(TeamHeaderPage.DYNAMIC_SUBMENU, menuName).click();
    }

}
