package opencommerce.collabase.steps;

import common.utilities.LoadObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.alert.AlertQuestions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceActions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceQuestions;
import opencommerce.collabase.pageobjects.common.CommonQuestions;
import opencommerce.collabase.pageobjects.createpassword.CreatePasswordActions;
import opencommerce.collabase.pageobjects.createpassword.CreatePasswordQuestions;
import opencommerce.collabase.pageobjects.createworkspace.CreateWorkspaceActions;
import opencommerce.collabase.pageobjects.forgotpassword.ForgotPasswordActions;
import opencommerce.collabase.pageobjects.forgotpassword.ForgotPasswordQuestions;
import opencommerce.collabase.pageobjects.header.HeaderActions;
import opencommerce.collabase.pageobjects.header.HeaderQuestions;
import opencommerce.collabase.pageobjects.inviteyourteam.InviteYourTeamActions;
import opencommerce.collabase.pageobjects.mailinator.MailinatorActions;
import opencommerce.collabase.pageobjects.navigations.NavigateActions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuActions;
import opencommerce.collabase.pageobjects.sidebardashboardmenu.SidebarDashboardMenuQuestion;
import opencommerce.collabase.pageobjects.signin.SigninPageActions;
import opencommerce.collabase.pageobjects.signin.SigninPageQuestions;
import opencommerce.collabase.pageobjects.signup.SignupActions;
import opencommerce.collabase.pageobjects.signup.SignupQuestions;
import opencommerce.collabase.pageobjects.switchto.SwitchToActions;
import opencommerce.collabase.pageobjects.verifyemail.VerifyEmailActions;
import opencommerce.collabase.pageobjects.usermenu.UserMenuActions;
import opencommerce.collabase.pageobjects.verifyemail.VerifyEmailQuestions;
import opencommerce.collabase.pageobjects.workspacenamemenu.WorkspaceNameMenuActions;

public class AuthenStepDefs {

    @Steps
    SigninPageActions signin;

    @Steps
    SigninPageQuestions signinPageQuestions;

    @Steps
    NavigateActions navigateTo;

    @Steps
    SidebarDashboardMenuQuestion sidebarDashboardMenuQuestion;

    @Steps
    SidebarDashboardMenuActions sidebarDashboardMenuActions;

    @Steps
    WorkspaceNameMenuActions workspaceNameMenuActions;

    @Steps
    ChooseWorkspaceActions chooseWorkspaceActions;

    @Steps
    ChooseWorkspaceQuestions chooseWorkspaceQuestions;

    @Steps
    CreateWorkspaceActions createWorkspaceActions;

    @Steps
    CreatePasswordQuestions createPasswordQuestions;

    @Steps
    HeaderActions headerActions;

    @Steps
    HeaderQuestions headerQuestions;

    @Steps
    UserMenuActions userMenuActions;

    @Steps
    ForgotPasswordActions forgotPasswordActions;

    @Steps
    ForgotPasswordQuestions forgotPasswordQuestions;

    @Steps
    SwitchToActions switchToActions;

    @Steps
    MailinatorActions mailinatorActions;

    @Steps
    CreatePasswordActions createPasswordActions;

    @Steps
    SignupActions signupActions;

    @Steps
    SignupQuestions signupQuestions;

    @Steps
    InviteYourTeamActions inviteYourTeamActions;

    @Steps
    AlertQuestions alertQuestions;

    @Steps
    VerifyEmailActions verifyEmailActions;

    @Steps
    VerifyEmailQuestions verifyEmailQuestions;

    @Steps
    CommonQuestions commonQuestions;

    @When("Anna/she sign in to CollaBase with email {string} and password {string}")
    public void user_sign_in_to_ShopBase_dashboard_with_email_and_password_on(String email, String password) {
        signin.with(email, password);
    }

    @When("Anna/she sign in to CollaBase with wrong password")
    public void user_sign_in_to_ShopBase_dashboard_with_wrong_password() {
        signin.with(LoadObject.getProperty("user.name"), LoadObject.getProperty("user.wrongPwd"));
    }

    @When("Anna/she sign in to CollaBase with valid account")
    public void user_sign_in_to_CollaBase_dashboard_with_valid_account() {
        signin.with(LoadObject.getProperty("user.name"), LoadObject.getProperty("user.pwd"));
    }

    @Then("Anna/she should see signin error message {string} at field {string}")
    public void verify_sign_in_error_message_at(String message, String field) {
        signinPageQuestions.verifyErrorMessage(message).atField(field);
    }

    @Then("Anna/she should see signin error message {string}")
    public void verify_sign_in_error_message(String message) {
        signinPageQuestions.verifyErrorSigninMessage(message);
    }

    @Then("Anna/she should see the message")
    public void user_should_see_the_message(String message) {
        chooseWorkspaceQuestions.verifySelectWorkspaceTxtIs(message);
    }

    @Given("Anna is at login page")
    public void user_is_at_login_page() {
        navigateTo.theSigninPage();
    }

    @When("Anna/she sign up to CollaBase with following info:")
    public void anna_sign_up_to_colla_base_with_following_info(DataTable info) {
        signupActions.with(info);
    }

    @And("Anna/she go to signup page")
    public void anna_go_to_signup_page() {
        navigateTo.theSignupPage();
    }

    @Then("Anna/she should see signup error message {string} at field {string}")
    public void annaShouldSeeSignupErrorMessageAtFieldMessage(String message, String fieldName) {
        signupQuestions.verifyErrorMessageAtField(fieldName).is(message);
    }

    @When("Anna/she input email {string}")
    public void anna_input_email(String email) {
        if (email.equals("space")) {
            email = "      ";
        }
        forgotPasswordActions.inputEmail(email);
    }

    @And("Anna/she go to forgot password page")
    public void anna_go_to_forgot_password_page() {
        navigateTo.theForgotPasswordPage();
    }

    @And("Anna/she submit forgot password")
    public void she_submit_with_button() {
        forgotPasswordActions.submit();
    }

    @Then("Anna/she should see forgot password error message {string}")
    public void anna_should_see_forgot_password_error_message(String message) {
        forgotPasswordQuestions.verifyErrorMessage(message);
    }

    @And("Anna/she should see the success modal")
    public void anna_should_see_the_success_modal() {
        forgotPasswordQuestions.verifyForgotPasswordSuccessModalIsDisplayed();
    }

    @Given("Anna was logged in Collabase as workspace owner")
    public void anna_was_logged_in_collabase() {
        navigateTo.theSigninPage();
        signin.with(LoadObject.getProperty("user.name"), LoadObject.getProperty("user.pwd"));
    }

    @And("Anna/she is in Select workspace page")
    public void she_is_in_select_workspace_page() {
        chooseWorkspaceQuestions.verifyCreateWorkspaceBtnIsDisplayed();
    }

    @And("Anna/she click to Try another account link")
    public void she_click_to_logout_dropdown_link() {
        chooseWorkspaceActions.clickToTryUsingAnotherAccountLink();
        signinPageQuestions.verifySigninPageIsDisplayed();
    }

    @Then("Anna/she should see the login page")
    public void anna_should_see_the_login_page() {
        signinPageQuestions.verifySigninPageIsDisplayed();
    }

    @And("Anna/she is in Workspace dashboard page")
    public void she_is_in_workspace_dashboard_page() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.name"));
    }

    @When("Anna/she clicks to user avatar")
    public void anna_clicks_to_user_avatar() {
        headerActions.clickToUserAvatar();
    }

    @And("Anna/she click to Signout button in Profile menu")
    public void she_click_to_signout_button_in_profile_menu() {
        userMenuActions.clickToSignoutBtn();
    }

    @When("Anna/she clicks to Workspace name")
    public void anna_clicks_to_workspace_name() {
        sidebarDashboardMenuQuestion.verifyWorkspaceNameIsDisplayed();
        sidebarDashboardMenuActions.openWorkspaceNameMenu();
    }

    @And("Anna/she click to Signout button in Workspace menu")
    public void she_click_to_signout_button_in_workspace_menu() {
        workspaceNameMenuActions.clickToSignoutBtn();
    }

    @And("Anna/she access choose workspace page")
    public void actorAccessChooseWorkspacePage() {
        navigateTo.theChooseWorkspacePage();
    }

    @And("Anna/she confirm email with email {string}")
    public void sheConfirmEmailWithEmail(String email) {
        navigateTo.theMailinatorPage();
        mailinatorActions.withResetPasswordMail(email);
        switchToActions.switchToNewTab();
    }

    @And("Anna/she create new password with {string}")
    public void sheCreateNewPasswordWith(String password) {
        createPasswordActions.with(password, password);
    }

    @And("Anna/she login with {string} and {string} successfully")
    public void sheLoginWithAnd(String email, String password) {
        signin.with(email, password);
    }

    @And("she create workspace with info:")
    public void sheCreateWorkspaceWithInfo(DataTable info) {
        chooseWorkspaceActions.clickToCreateNewWorkspaceBtn();
        createWorkspaceActions.with(info);
    }

    @Then("she should see the confirm email message {string}")
    public void sheShouldSeeTheConfirmEmailMessage(String message) {
        alertQuestions.verifyConfirmEmailIs(message);
    }

    @And("she skip invite members")
    public void sheSkipInviteMembers() {
        inviteYourTeamActions.clickToDoItLaterLink();
    }

    @And("she confirms signup email")
    public void sheConfirmsSignupEmail() {
        navigateTo.theMailinatorPage();
        mailinatorActions.withSignupMail(SignupActions.email);
        switchToActions.switchToNewTab();
    }

    @Then("she should not see the the confirm email message")
    public void sheShouldNotSeeTheTheConfirmEmailMessage() {
        alertQuestions.verifyConfirmEmailIsNotDisplayed();
    }

    @And("she should see the email verification message is {string}")
    public void sheShouldSeeTheEmailVerificationMessageIs(String message) {
        verifyEmailQuestions.verifySuccessMessageIs(message);
    }

    @And("she click to Go to CollaBase dashboard button")
    public void sheClickToGoToCollaBaseDashboardButton() {
        verifyEmailActions.clickToGoToDashboardBtn();
    }

    @And("she add member with email")
    public void sheAddMemberWithEmail() {
        inviteYourTeamActions.addMemberWithEmail();
    }

    @And("member accepts the invitation email")
    public void memberAcceptsTheInvitationEmail() {
        navigateTo.theMailinatorPage();
        mailinatorActions.withInviteMail(InviteYourTeamActions.memberEmail);
        switchToActions.switchToNewTab();
    }

    @And("member create password with following info:")
    public void memberCreatePasswordWithFollowingInfo(DataTable info) {
        createPasswordActions.withInvitation(info);
    }

    @Then("member should see the create password error message {string} at field {string}")
    public void memberShouldSeeTheCreatePasswordErrorMessageAtField(String errorMessage, String field) {
        createPasswordQuestions.verifyErrorMessageAtField(field).is(errorMessage);
    }

    @Then("Anna/she should see the select workspace page")
    public void sheShouldSeeTheSelectWorkspacePage() {
        chooseWorkspaceQuestions.verifyCreateWorkspaceBtnIsDisplayed();
    }

    @Then("member should see the dashboard page")
    public void memberShouldSeeTheDashboardPage() {
        headerQuestions.verifyUserAvatarIsDisplayed();
    }

    @Then("Peter was logged in Collabase as admin")
    public void peterWasLoggedInCollabaseAsAdmin() {
        signin.with(LoadObject.getProperty("admin.user.name"), LoadObject.getProperty("admin.pwd"));
    }

    @And("she logout with profile menu")
    public void sheLogoutWithProfileMenu() {
        headerActions.clickToUserAvatar();
        userMenuActions.clickToSignoutBtn();
    }

    @Then("she should see page title is {string}")
    public void sheShouldSeePageTitleIs(String title) {
        commonQuestions.verifyPageTitleIs(title);
    }

    @And("url ends with {string}")
    public void urlEndsWith(String url) {
        commonQuestions.verifyPageUrlIsEndsWith(url);
    }

    @And("Workspace select page is opened")
    public void workspaceSelectPageIsOpened() {
        chooseWorkspaceQuestions.verifyCreateWorkspaceBtnIsDisplayed();
    }
}
