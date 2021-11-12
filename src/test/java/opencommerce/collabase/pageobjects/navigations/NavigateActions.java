package opencommerce.collabase.pageobjects.navigations;

import common.enums.SettingsAdministrationMenu;
import common.enums.WorkspaceMenu;
import common.utilities.CommonFunctions;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspacePage;
import opencommerce.collabase.pageobjects.mailinator.MailinatorPage;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuActions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuQuestion;
import opencommerce.collabase.pageobjects.sidebarsettingadminmenu.SidebarSettingAdminMenuActions;
import opencommerce.collabase.pageobjects.signin.SigninPage;
import opencommerce.collabase.pageobjects.signin.SigninPageActions;
import opencommerce.collabase.pageobjects.workspacenamemenu.WorkspaceNameMenuActions;

public class NavigateActions extends UIInteractionSteps {

    SigninPage signinPage;
    ChooseWorkspacePage chooseWorkspacePage;
    MailinatorPage mailinatorPage;

    @Steps
    SigninPageActions signinPageActions;

    @Steps
    SidebarDashboardMenuActions sidebarDashboardMenuActions;

    @Steps
    SidebarDashboardMenuQuestion sidebarDashboardMenuQuestion;

    @Steps
    WorkspaceNameMenuActions workspaceNameMenuActions;

    @Steps
    SidebarSettingAdminMenuActions sidebarSettingAdminMenuActions;

    @Step("Navigate to Signin page")
    public void theSigninPage() {
        signinPage.open();
        CommonFunctions.maximizeWindow();
    }

    @Step("Navigate to Admin page")
    public void theAdminPage() {
        sidebarDashboardMenuQuestion.verifyWorkspaceNameIsDisplayed();
        sidebarDashboardMenuActions.openWorkspaceNameMenu();
        workspaceNameMenuActions.clickToMenu(WorkspaceMenu.SETTINGS_ADMINISTRATION);
    }

    public void theMailinatorPage() {
        mailinatorPage.open();
    }

    @Step("Navigate to the Board Admin page")
    public void theBoardAdminPage() {
        sidebarDashboardMenuQuestion.verifyWorkspaceNameIsDisplayed();
        sidebarDashboardMenuActions.openWorkspaceNameMenu();
        workspaceNameMenuActions.clickToMenu(WorkspaceMenu.SETTINGS_ADMINISTRATION);
        sidebarSettingAdminMenuActions.clickToMenu(SettingsAdministrationMenu.BOARDS);
    }

    public void theSignupPage() {
        signinPageActions.clickSignupLink();
    }

    public void theForgotPasswordPage() {
        signinPageActions.clickForgotPasswordLink();
    }

    public void theChooseWorkspacePage() {
        chooseWorkspacePage.open();
    }
}
