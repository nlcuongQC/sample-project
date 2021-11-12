package opencommerce.collabase.pageobjects.workspacenamemenu;

import org.openqa.selenium.By;

public class WorkspaceNameMenuPage {
    static final By SIGNOUT_BTN = By
            .xpath("//p[contains(@class, 'user-email')]/ancestor::div[@role = " +
                    "'button']/following-sibling::div//span[contains(text(), 'Sign out')]");

    static final String DYNAMIC_MENU_NAME = "//div[@class = 's-dropdown-content']/parent::div[not(@style = 'display: " +
            "none;')]//span[contains(text(), '{0}')]";
}
