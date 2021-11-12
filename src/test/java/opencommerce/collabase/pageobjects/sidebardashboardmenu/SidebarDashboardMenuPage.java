package opencommerce.collabase.pageobjects.sidebardashboardmenu;

import org.openqa.selenium.By;

public class SidebarDashboardMenuPage {

    static final By WORKSPACE_NAME = By
            .xpath("//div[@class = 'unite-ui-frame vertical-screen']//div[not(@style)]/aside//p");

    static final String DYNAMIC_BOARD = "//span[contains(text(), '{0}')]/ancestor::a";
}
