package opencommerce.collabase.steps;

import common.enums.SettingsAdministrationMenu;
import common.utilities.LoadObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.addnewteam.AddNewTeamActions;
import opencommerce.collabase.pageobjects.addnewteam.AddNewTeamQuestions;
import opencommerce.collabase.pageobjects.alert.AlertQuestions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceActions;
import opencommerce.collabase.pageobjects.confirmationpopup.ConfirmationPopupActions;
import opencommerce.collabase.pageobjects.navigations.NavigateActions;
import opencommerce.collabase.pageobjects.sidebarsettingadminmenu.SidebarSettingAdminMenuActions;
import opencommerce.collabase.pageobjects.teamheader.TeamHeaderActions;
import opencommerce.collabase.pageobjects.teamtab.TeamTabActions;
import opencommerce.collabase.pageobjects.teamtab.TeamTabQuestions;

public class TeamsStepDefs {

    @Steps
    ChooseWorkspaceActions chooseWorkspaceActions;

    @Steps
    NavigateActions navigateActions;

    @Steps
    SidebarSettingAdminMenuActions sidebarSettingAdminMenuActions;

    @Steps
    TeamHeaderActions teamHeaderActions;

    @Steps
    TeamTabActions teamTabActions;

    @Steps
    TeamTabQuestions teamTabQuestions;

    @Steps
    AlertQuestions alertQuestions;

    @Steps
    ConfirmationPopupActions confirmationPopupActions;

    @Steps
    AddNewTeamActions addNewTeamActions;

    @Steps
    AddNewTeamQuestions addNewTeamQuestions;

    @And("Anna/she went to Setting - Teams page")
    public void sheWentToSettingTeamsPage() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.name"));
        navigateActions.theAdminPage();
        sidebarSettingAdminMenuActions.clickToMenu(SettingsAdministrationMenu.TEAMS);
    }

    @And("Anna/she opened add team form")
    public void sheOpenedAddTeamForm() {
        teamHeaderActions.atMenuName("Teams").clickToSubMenu();
        teamTabActions.clickToAddNewTeamBtn();
    }

    @When("Anna/she creates team with info:")
    public void annaCreatesTeamWithInfo(DataTable info) {
        addNewTeamActions.with(info);
    }

    @Then("Anna/she should see add team error message {string} at {string}")
    public void annaShouldSeeAddTeamErrorMessageAt(String errorMessage, String field) {
        addNewTeamQuestions.atFieldName(field).verifyErrorMessageIs(errorMessage);
    }

    @Then("Anna should see new team is created")
    public void annaShouldSeeNewTeamIsCreated() {
        teamTabQuestions.verifyHandleTeamListSizeIs(1);
        teamTabActions.searchTeamWith(AddNewTeamActions.teamName);
        teamTabQuestions.verifyTeamNameIs(AddNewTeamActions.teamName);
    }

    @And("Anna/she opened team list page")
    public void sheOpenedTeamListPage() {
        teamHeaderActions.atMenuName("Teams").clickToSubMenu();
    }

    @When("Anna/she search teams with {string}")
    public void annaSearchTeamsWith(String text) {
        teamTabActions.searchTeamWith(text);
    }

    @Then("Anna/she should see empty team error message {string}")
    public void annaShouldSeeEmptyTeamErrorMessage(String errorMessage) {
        teamTabQuestions.verifyNoItemMessageOfTeamListIs(errorMessage);
    }

    @Then("Anna/she should see {string} displayed in list")
    public void annaShouldSeeDisplayedInList(String handle) {
        teamTabQuestions.verifyHandleTeamListSizeIs(1);
        teamTabQuestions.verifyHandleTeamListContains(handle);
    }

    @Then("Anna should see toast error message {string}")
    public void annaShouldSeeToastErrorMessage(String message) {
        alertQuestions.verifyRedAlertTopMessageIs(message);
    }

    @And("she deactivate created team")
    public void sheDeactivateCreatedTeam() {
        teamTabActions.atTeamName(AddNewTeamActions.teamName).clickToDeactivateBtnOfTeam();
        confirmationPopupActions.clickToYesBtn();
    }

    @Then("Anna should see created team is deactivated")
    public void annaShouldSeeCreatedTeamIsDeactivated() {
        teamTabQuestions.atTeamName(AddNewTeamActions.teamName).verifyDeactivateTeamBtnIsNotDisplayed();
    }

    @And("she activate created team")
    public void sheActivateCreatedTeam() {
        teamTabActions.atTeamName(AddNewTeamActions.teamName).clickToActivateBtn();
        confirmationPopupActions.clickToYesBtn();
    }

    @When("Anna deactivate status of team {string}")
    public void annaDeactivateStatusOfTeam(String teamName) {
        teamTabActions.atTeamName(teamName).clickToDeactivateBtnOfTeam();
        confirmationPopupActions.clickToYesBtn();
    }

    @Then("Anna should see created team is activated")
    public void annaShouldSeeCreatedTeamIsActivated() {
        teamTabQuestions.atTeamName(AddNewTeamActions.teamName).verifyActivateTeamBtnIsNotDisplayed();
    }
}
