package opencommerce.collabase.pageobjects.createworkspace;

import org.openqa.selenium.By;

public class CreateWorkspacePage {
    //Target
    static final By WORKSPACE_NAME_TXTBX = By.xpath("//input[contains(@placeholder, 'workspace name')]");
    static final By SHORT_NAME_TXTBX = By.xpath("//input[contains(@placeholder, 'short name')]");
    static final By NEXT_BTN = By.xpath("//span[text() = 'Next']/parent::button");
}