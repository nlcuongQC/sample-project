package opencommerce.collabase.pageobjects.sidebarsettingadminmenu;

import org.openqa.selenium.By;

public class SidebarSettingAdminMenuPage {

    static final String DYNAMIC_MENU = "//span[contains(text(), '{0}')]/ancestor::a";
    static final By BACK_TO_WORKSPACE_BTN = By.xpath("//div[contains(text(), 'Back to workspace')]/parent::div");
}
