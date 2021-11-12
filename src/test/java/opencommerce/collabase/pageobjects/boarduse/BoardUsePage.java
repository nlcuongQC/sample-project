package opencommerce.collabase.pageobjects.boarduse;

import org.openqa.selenium.By;

public class BoardUsePage {
    static final By BOARD_TITLE = By.xpath("//span[contains(@class, 'board-use-title')]");
    static final By SEARCH_BOARD_TXTBX = By.xpath("//input[@placeholder = 'Search & filter by free text']");
    static final By BOARD_ITEMS = By.xpath("//tbody//td[not(contains(@class, 'is-hidden')) and contains(@class, 'is-left')]/..");
    static final By VIEW_BY_BTN = By.xpath("//span[contains(text(), 'View by')]/ancestor::button");
    static final By ADD_ITEMS_BTN_DROPDOWN = By.xpath("//button[contains(., 'Add items')]");

    static final String DYNAMIC_ADD_ITEMS_BTN_ITEM = "//div[@class = 's-dropdown-content']/span[contains(., '{0}')]";
    static final String DYNAMIC_PROPERTY_NAME = "//div[@class = 'cell' and text() = '{0}']/parent::th[not(contains(@class, 'hidden'))]/div";
}
