package opencommerce.collabase.pageobjects.inviteyourteam;

import org.openqa.selenium.By;

public class InviteYourTeamPage {
    static final By DO_IT_LATER_LINK = By.xpath("//a[@href = '/workspace/select']");
    static final By ADD_MEMBER_TXTBX = By.cssSelector(".sb-input__input");
    static final By MEMBER_TAG = By.xpath("//div[contains(@class, 'sb-tag__caption')]");
    static final By SEND_INVITATION_BTN = By.xpath("//span[contains(text(), 'Send invitation')]/parent::button");
}