package opencommerce.collabase.pageobjects.mailinator;

import net.serenitybdd.core.steps.UIInteractionSteps;
import opencommerce.collabase.pageobjects.switchto.SwitchToActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorActions extends UIInteractionSteps {

    SwitchToActions switchToActions;
    String frameName = "html_msg_body";

    public void withResetPasswordMail(String email) {
        $(MailinatorPage.EMAIL_TXTBX).typeAndEnter(email);
        $(MailinatorPage.DYNAMIC_EMAIL_ADDRESS_TITLE, "CollaBase", "Reset your password").click();
        switchToActions.switchToFrame(frameName);
        $(MailinatorPage.RESET_PASSWORD_BTN).click();
    }

    public void withSignupMail(String email) {
        $(MailinatorPage.EMAIL_TXTBX).typeAndEnter(email);
        waitForCondition().until(ExpectedConditions.visibilityOf($(MailinatorPage.DYNAMIC_EMAIL_ADDRESS_TITLE,
                "CollaBase", "Confirm your email"))).isDisplayed();
        $(MailinatorPage.DYNAMIC_EMAIL_ADDRESS_TITLE, "CollaBase", "Confirm your email").click();
        switchToActions.switchToFrame(frameName);
        $(MailinatorPage.JOIN_NOW_BTN).click();
    }

    public void withInviteMail(String email) {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(MailinatorPage.EMAIL_TXTBX));
        $(MailinatorPage.EMAIL_TXTBX).typeAndEnter(email);
        $(MailinatorPage.DYNAMIC_EMAIL_ADDRESS_TITLE, "CollaBase", "Invitation to workspace").click();
        switchToActions.switchToFrame(frameName);
        $(MailinatorPage.JOIN_NOW_INVITATION_BTN).click();
    }
}
