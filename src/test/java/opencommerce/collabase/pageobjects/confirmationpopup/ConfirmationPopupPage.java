package opencommerce.collabase.pageobjects.confirmationpopup;

import org.openqa.selenium.By;

public class ConfirmationPopupPage {
    static final By YES_BTN = By.xpath("//span[contains(text(), 'Yes')]/parent::button");
    static final By POPUP = By.cssSelector(".sb-popup__container");
}
