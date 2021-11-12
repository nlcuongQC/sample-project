package opencommerce.collabase.pageobjects.usermenu;

import org.openqa.selenium.By;

public class UserMenuPage {

    static final By SIGNOUT_BTN = By.xpath("//div[contains(@class, 'image')]/parent::div[@role = " +
            "'button']/following-sibling::div//span[contains(text(), 'Sign out')]");
}
