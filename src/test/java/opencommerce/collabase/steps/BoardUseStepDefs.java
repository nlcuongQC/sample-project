package opencommerce.collabase.steps;

import common.utilities.LoadObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.addnewitem.AddNewItemActions;
import opencommerce.collabase.pageobjects.addnewitem.AddNewItemQuestions;
import opencommerce.collabase.pageobjects.alert.AlertQuestions;
import opencommerce.collabase.pageobjects.boarduse.BoardUseActions;
import opencommerce.collabase.pageobjects.boarduse.BoardUseQuestions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceActions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuActions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuQuestion;
import opencommerce.collabase.pageobjects.viewby.ViewByActions;
import opencommerce.collabase.pageobjects.viewby.ViewByQuestions;

public class BoardUseStepDefs {

    @Steps
    AlertQuestions alertQuestions;

    @Steps
    ChooseWorkspaceActions chooseWorkspaceActions;

    @Steps
    SidebarDashboardMenuActions sidebarDashboardMenuActions;

    @Steps
    SidebarDashboardMenuQuestion sidebarDashboardMenuQuestion;

    @Steps
    BoardUseQuestions boardUseQuestions;

    @Steps
    BoardUseActions boardUseActions;

    @Steps
    ViewByActions viewByActions;

    @Steps
    ViewByQuestions viewByQuestions;

    @Steps
    AddNewItemActions addNewItemActions;

    @Steps
    AddNewItemQuestions addNewItemQuestions;

    @And("Anna/she is in dashboard page")
    public void sheIsInDashboardPage() {
        sidebarDashboardMenuQuestion.verifyWorkspaceNameIsDisplayed();
    }

    @And("Anna/she choose board {string} in sidebar")
    public void sheChooseBoardInSidebar(String boardName) {
        sidebarDashboardMenuActions.chooseBoard(boardName);
        boardUseQuestions.verifyBoardUseTitleIs(boardName);
    }

    @And("she/Anna search board item with {string}")
    public void sheSearchBoardItemWith(String value) {
        boardUseActions.inputToSearchBoardTxtbx(value);
    }

    @Then("she should see no item in list board item")
    public void sheShouldSeeNoItemInListBoardItem() {
        boardUseQuestions.verifyAmountOfBoardItemsIs(0);
    }

    @Then("she should see item with {string}")
    public void sheShouldSeeItemWithType(String propertyType) {
        boardUseQuestions.verifyBoardItemsIsDisplayedWithName(propertyType);
    }

    @And("she open View by form")
    public void sheOpenViewByForm() {
        boardUseActions.clickToViewByBtn();
    }

    @And("she untick all options")
    public void sheUntickAllOptions() {
        viewByActions.untickOfAllViewBy();
    }

    @And("she submit View by form")
    public void sheSubmitViewByForm() {
        viewByActions.clickToSaveBtn();
    }

    @Then("she should see error message for empty View by option")
    public void sheShouldSeeErrorMessageForEmptyViewByOption() {
        alertQuestions.verifyRedAlertBottmMessageIs("Please select at least one property");
    }

    @And("she untick some options")
    public void sheUntickSomeOptions() {
        viewByActions.untickOfSomeViewBy();
    }

    @Then("she should see unticked properties is not displayed")
    public void sheShouldSeeUntickedPropertiesIsNotDisplayed() {
        boardUseQuestions.verifyBoardItemsIsNotDisplayedWithName("Text");
        boardUseQuestions.verifyBoardItemsIsNotDisplayedWithName("Number");
        boardUseQuestions.verifyBoardItemsIsNotDisplayedWithName("Checkbox");
    }

    @And("she choose workspace for board use")
    public void sheChooseWorkspaceForBoardUse() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.boarduse.name"));
    }

    @Then("she should see property {string} is not displayed in View by")
    public void sheShouldSeePropertyIsNotDisplayedInViewBy(String property) {
        viewByQuestions.atPropertyName(property).verifyPropertyIsNotDisplayed();
    }

    @And("she reset view")
    public void sheResetView() {
        viewByActions.clickToResetViewBtn();
        viewByActions.clickToSaveBtn();
    }

    @Then("she should not see error message for empty View by option")
    public void sheShouldNotSeeErrorMessageForEmptyViewByOption() {
        alertQuestions.verifyRedAlertBottmMessageIsNotDisplayed();
    }

    @And("she open add new item form")
    public void sheOpenAddNewItemForm() {
        boardUseActions.openAddNewItemForm();
    }

    @And("she click to Add new entry button of property {string}")
    public void sheClickToAddNewEntryButtonOfProperty(String property) {
        addNewItemActions.atFieldName(property).clickToAddNewEntryBtn();
    }

    @Then("she should see another text box is created at property {string}")
    public void sheShouldSeeAnotherTextBoxIsCreatedAtProperty(String property) {
        addNewItemQuestions.atFieldName(property).verifyAmountOfMainModelTxtbxIs(2);
    }

    @And("she click to {string} tab in add new item form")
    public void sheClickToTabInAddNewItemForm(String tab) {
        addNewItemActions.atTabName(tab).clickToTab();
    }

    @Then("she should see system model tab is displayed")
    public void sheShouldSeeSystemModelTabIsDisplayed() {
        addNewItemQuestions.atFieldName("Full name").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Avatar").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Title").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Phone").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Email").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Full name").verifyLinkedModelDefaultFieldDropdownIsDisplayed();
        addNewItemQuestions.atFieldName("Avatar").verifyLinkedModelFieldTxtbxIsDisplayed();
        addNewItemQuestions.atFieldName("Title").verifyLinkedModelFieldTxtbxIsDisplayed();
        addNewItemQuestions.atFieldName("Phone").verifyLinkedModelFieldTxtbxIsDisplayed();
        addNewItemQuestions.atFieldName("Email").verifyLinkedModelFieldTxtbxIsDisplayed();
    }

    @And("she/Anna submit add new item")
    public void sheSubmitAddNewItem() {
        addNewItemActions.clickToSaveBtn();
    }

    @Then("she/Anna should see required error text at field {string}")
    public void sheShouldSeeRequiredErrorTextAtField(String field) {
        addNewItemQuestions.atFieldName(field).verifyMainModelRequiredErrorTxtIs("This field is required");
    }

    @And("she input full valid data of board")
    public void sheInputFullValidDataOfBoard() {
        addNewItemActions.toBoardWithoutLink();
    }

    @Then("she should see save success message is {string}")
    public void sheShouldSeeSaveSuccessMessageIs(String message) {
        alertQuestions.verifySuccessTopMessageIs(message);
    }

    @And("board use view layout is openned")
    public void boardUseViewLayoutIsOpenned() {
        boardUseQuestions.verifyBoardItemsIsDisplayedWithName("Text");
    }

    @Then("she should see linked model tab is displayed")
    public void sheShouldSeeLinkedModelTabIsDisplayed() {
        addNewItemQuestions.atFieldName("Text 2").verifyLinkedModelFieldTitleIsDisplayed();
        addNewItemQuestions.atFieldName("Text 2").verifyLinkedModelFieldTxtbxIsDisplayed();
    }

    @And("she choose workspace")
    public void sheChooseWorkspace() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.name"));
    }
}
