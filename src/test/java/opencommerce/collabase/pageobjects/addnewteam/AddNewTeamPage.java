package opencommerce.collabase.pageobjects.addnewteam;

import org.openqa.selenium.By;

public class AddNewTeamPage {
    //String
    static final String DYNAMIC_MEMBER_CHECKBX = "//div[contains(@id, 'sb-popover') and not(contains(@style, " +
            "'display: none'))]//div[contains(text(), '{0}')]/ancestor::div[contains(@class, 'sb-pointer')]";
    static final String DYNAMIC_ERROR = "//label[contains(text(), '{0}')]/following-sibling::div/div[contains(@class," +
            " 'message')]";
    static final String DYNAMIC_TAG_MANAGER = "//label[@for = 'manager']/following-sibling::div//span[contains(text()" +
            ", '{0}')]/ancestor::div[@class = 'tag-member']";
    static final String DYNAMIC_TAG_MEMBER = "//label[@for = 'member']/following-sibling::div//span[contains(text(), " +
            "'{0}')]/ancestor::div[@class = 'tag-member']";

    static final By TEAM_NAME_TXTBX = By.xpath("//label[@for = 'name']/following-sibling::div//input");
    static final By HANDLE_TXTBX = By.xpath("//label[@for = 'handle']/following-sibling::div//input");
    static final By DESCRIPTION_TXTAREA = By.xpath("//label[@for = 'description']/following-sibling::div//textarea");
    static final By MANAGERS_TXTBX = By.xpath("//label[contains(text(), 'Managers')" +
            "]/following-sibling::div//div[@class = 'sb-flex']");
    static final By MEMBERS_TXTBX = By.xpath("//label[contains(text(), 'Members')]/following-sibling::div//div[@class" +
            " = 'sb-flex']");
    static final By SAVE_BTN = By.xpath("//span[contains(text(), 'Save')]/parent::button");
}