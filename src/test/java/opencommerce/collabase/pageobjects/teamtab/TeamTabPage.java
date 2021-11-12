package opencommerce.collabase.pageobjects.teamtab;

import org.openqa.selenium.By;

public class TeamTabPage {

    static final By ADD_NEW_TEAM_BTN = By.xpath("//span[contains(text(), 'Add new team')]/ancestor::button");
    static final By SEARCH_BX = By.xpath("//input[contains(@placeholder, 'Filter')]");
    static final By HANDLE_LIST = By.xpath("//td[@class = 'setting-text' and @name]");
    static final By TEAM_NAME_LIST = By.xpath("//td[@class = 'setting__tbody-text-custom-table']");
    static final By NO_ITEM_MESSAGE = By.xpath("//div[@class = 'no-collection text-center']");

    static final String DYNAMIC_DEACTIVATE_BTN = "//td[contains(text(), '{0}')]/following-sibling::td/div[@class = " +
            "'deactive-button']";
    static final String DYNAMIC_ACTIVATE_BTN = "//td[contains(text(), '{0')]/following-sibling::td/div[@class = " +
            "'active-button']";

}
