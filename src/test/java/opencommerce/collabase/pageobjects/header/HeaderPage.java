package opencommerce.collabase.pageobjects.header;

import org.openqa.selenium.By;

public class HeaderPage {
    static final By USER_AVATAR_BTN = By.xpath("//div[contains(@class, 'image')]/parent::div[@role = 'button']");
    static final By NOTIFICATION_BTN = By.xpath("//img[contains(@src, 'Notification')]/parent::button");

}
