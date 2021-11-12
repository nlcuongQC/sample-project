package opencommerce.collabase.steps;

import common.utilities.LoadObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.addnewboard.AddNewBoardActions;
import opencommerce.collabase.pageobjects.addnewitem.AddNewItemActions;
import opencommerce.collabase.pageobjects.addnewitem.AddNewItemQuestions;
import opencommerce.collabase.pageobjects.addnewmodel.AddNewModelActions;
import opencommerce.collabase.pageobjects.addproperty.AddPropertyActions;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailActions;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailQuestions;
import opencommerce.collabase.pageobjects.boardadminlistpage.BoardAdminListActions;
import opencommerce.collabase.pageobjects.boarduse.BoardUseActions;
import opencommerce.collabase.pageobjects.boarduse.BoardUseQuestions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceActions;
import opencommerce.collabase.pageobjects.header.HeaderActions;
import opencommerce.collabase.pageobjects.navigations.NavigateActions;
import opencommerce.collabase.pageobjects.notification.NotificationQuestions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuActions;
import opencommerce.collabase.pageobjects.sidebarsettingadminmenu.SidebarSettingAdminMenuActions;

public class NotificationsStepDefs {

    @Steps
    NavigateActions navigateTo;

    @Steps
    BoardAdminDetailActions boardAdminDetailActions;

    @Steps
    BoardAdminDetailQuestions boardAdminDetailQuestions;

    @Steps
    BoardAdminListActions boardAdminListActions;

    @Steps
    AddNewBoardActions addNewBoardActions;

    @Steps
    AddPropertyActions addPropertyActions;

    @Steps
    SidebarDashboardMenuActions sidebarDashboardMenuActions;

    @Steps
    SidebarSettingAdminMenuActions sidebarSettingAdminMenuActions;

    @Steps
    BoardUseActions boardUseActions;

    @Steps
    BoardUseQuestions boardUseQuestions;

    @Steps
    ChooseWorkspaceActions chooseWorkspaceActions;

    @Steps
    HeaderActions headerActions;

    @Steps
    AddNewItemActions addNewItemActions;

    @Steps
    AddNewItemQuestions addNewItemQuestions;

    @Steps
    NotificationQuestions notificationQuestions;

    @And("Peter should see add board notification")
    public void peterShouldSeeAddBoardNotification() {
        notificationQuestions.atPosition("1").verifyNotificationIs("updated " + AddNewBoardActions.boardName + " board");
        notificationQuestions.atPosition("3").verifyNotificationIs("added " + AddNewBoardActions.boardName + " board");
    }

    @And("she/he choose workspace for notification")
    public void sheChooseWorkspaceForNotification() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.notification.name"));
    }

    @And("he open notification modal")
    public void heOpenNotificationModal() {
        headerActions.clickToNotificationBtn();
    }

    @And("Peter should see closed board notification")
    public void peterShouldSeeClosedBoardNotification() {
//        theActorInTheSpotlight().should(
//                seeThat(Notification.of("1"), is(containsString("updated " + AddNewBoardActions.boardName + " board"))),
//                seeThat(Notification.of("3"), is(containsString("added " + AddNewBoardActions.boardName + " board")))
//        );
    }

    @When("Anna prepare a board with assigned member")
    public void annaPrepareABoardWithAssignedMember() {
        navigateTo.theBoardAdminPage();
        boardAdminListActions.clickToCreateNewBoardBtn();
        addNewBoardActions.withMainModel();
        boardAdminDetailQuestions.verifyMainModelTitleIsDisplayed();
        boardAdminDetailActions.atModel(AddNewModelActions.modelName).atPosition("1").inputToPropertyNameTxtbx("Name");
        addPropertyActions.with(AddNewModelActions.modelName, "Person", "2");
        boardAdminDetailActions.clickToPublishBtn();
        sidebarSettingAdminMenuActions.clickToBackToWorkspaceBtn();
        sidebarDashboardMenuActions.chooseBoard(AddNewBoardActions.boardName);
        boardUseQuestions.verifyBoardUseTitleIs(AddNewBoardActions.boardName);
        boardUseActions.openAddNewItemForm();
        addNewItemActions.atFieldName("Name").inputToMainModelTxtbx("Name");
        addNewItemActions.atFieldName(AddPropertyActions.propertyName).clickToMainModelPersonDropdown();
        addNewItemQuestions.atPersonName("member1").verifyMainModelPersonPopupItemIsDisplayed();
        addNewItemActions.atPersonName("member1").clickToMainModelPersonPopupItem();
        addNewItemQuestions.atFieldName(AddPropertyActions.propertyName).verifyMainModelPersonDropdownIs("member1@mailinator.com");
        addNewItemActions.clickToSaveBtn();
    }
}
