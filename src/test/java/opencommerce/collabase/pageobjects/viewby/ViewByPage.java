package opencommerce.collabase.pageobjects.viewby;

import org.openqa.selenium.By;

public class ViewByPage {
    static final By SAVE_BTN = By.xpath("//span[contains(text(), 'Save')]/ancestor::button");
    static final By RESET_VIEW_BTN = By.xpath("//div[contains(text(), 'Reset view')]");

    static final String DYNAMIC_PROPERTY = "//span[contains(text(), '{0}') and @class = 'sb-control-label']";
}
