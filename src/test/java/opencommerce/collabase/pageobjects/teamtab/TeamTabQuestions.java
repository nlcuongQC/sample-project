package opencommerce.collabase.pageobjects.teamtab;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamTabQuestions extends UIInteractionSteps {

    String teamName;

    @Step
    public void clickToAddNewTeamBtn() {
        $(TeamTabPage.ADD_NEW_TEAM_BTN).click();
    }

    @Step
    public void verifyHandleTeamListSizeIs(int value) {
        assertThat($$(TeamTabPage.HANDLE_LIST).size()).isEqualTo(value);
    }

    @Step
    public void verifyTeamNameIs(String teamName) {
        $(TeamTabPage.TEAM_NAME_LIST).shouldContainText(teamName);
    }

    @Step
    public void verifyNoItemMessageOfTeamListIs(String errorMessage) {
        $(TeamTabPage.NO_ITEM_MESSAGE).shouldContainText(errorMessage);
    }

    @Step
    public void verifyHandleTeamListContains(String handle) {
        assertThat($$(TeamTabPage.HANDLE_LIST)).hasToString(handle);
    }

    @Step
    public TeamTabQuestions atTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    @Step
    public void verifyDeactivateTeamBtnIsNotDisplayed() {
        $(TeamTabPage.DYNAMIC_DEACTIVATE_BTN, teamName).shouldNotBeVisible();
    }

    @Step
    public void verifyActivateTeamBtnIsNotDisplayed() {
        $(TeamTabPage.DYNAMIC_ACTIVATE_BTN, teamName).shouldNotBeVisible();
    }
}
