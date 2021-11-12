package opencommerce.collabase.pageobjects.mailinator;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:mailinator.page")
public class MailinatorPage extends PageObject {
    //Dynamic xpath
    static final String DYNAMIC_EMAIL_ADDRESS_TITLE =
            "//td[contains(text(), '{0}')]/following::td[contains(text(), '{1}')]/parent::tr";

    //Target
    static final By EMAIL_TXTBX = By.id("addOverlay");
    static final By RESET_PASSWORD_BTN = By.xpath("//p[contains(text(), 'CollaBase')]/following-sibling::table//a");
    static final By JOIN_NOW_BTN = By.xpath("//p[contains(text(), 'Confirm')]/following-sibling::table//a");
    static final By JOIN_NOW_INVITATION_BTN = By.xpath("//p[contains(., 'invited')]/following::table//a");
}
