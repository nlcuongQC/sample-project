package opencommerce.collabase.pageobjects.inviteyourteam;

import common.utilities.DataHelper;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.header.HeaderQuestions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InviteYourTeamActions extends UIInteractionSteps {

    public static String memberEmail;

    @Steps
    HeaderQuestions headerQuestions;

    @Step
    public void clickToDoItLaterLink() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(InviteYourTeamPage.DO_IT_LATER_LINK))).isDisplayed();
        $(InviteYourTeamPage.DO_IT_LATER_LINK).click();
    }

    public void addMemberWithEmail() {
        DataHelper data = DataHelper.getData();
        memberEmail = data.getEmail();

        waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(InviteYourTeamPage.SEND_INVITATION_BTN)).isDisplayed();
        $(InviteYourTeamPage.ADD_MEMBER_TXTBX).typeAndEnter(memberEmail);
        $(InviteYourTeamPage.MEMBER_TAG).shouldBeVisible();
        $(InviteYourTeamPage.SEND_INVITATION_BTN).click();
        headerQuestions.verifyUserAvatarIsDisplayed();
    }
}