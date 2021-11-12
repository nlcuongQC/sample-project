package opencommerce.collabase.pageobjects.teamtab;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class TeamTabActions extends UIInteractionSteps {

    String teamName;

    @Step
    public void clickToAddNewTeamBtn() {
        $(TeamTabPage.ADD_NEW_TEAM_BTN).click();
    }

    @Step
    public void searchTeamWith(String value) {
        $(TeamTabPage.SEARCH_BX).typeAndEnter(value);
    }

    @Step
    public void clickToDeactivateBtnOfTeam() {
        $(TeamTabPage.DYNAMIC_DEACTIVATE_BTN, teamName).click();
    }

    @Step
    public TeamTabActions atTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    @Step
    public void clickToActivateBtn() {
        $(TeamTabPage.DYNAMIC_ACTIVATE_BTN, teamName).click();
    }
}
