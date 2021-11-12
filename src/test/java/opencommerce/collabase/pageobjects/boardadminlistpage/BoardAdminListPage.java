package opencommerce.collabase.pageobjects.boardadminlistpage;

import org.openqa.selenium.By;

public class BoardAdminListPage {
    static final By CREATE_NEW_BOARD_BTN = By.xpath("//span[contains(text(), 'Create new board')]/parent::button");
    static final By SEARCH_TXTBX = By.xpath("//input[@placeholder = 'Search Entities']");
    static final String DYNAMIC_BOARD_MODELS = "(//span[@class = 'custom-board-name' and contains(text(), '{0}')" +
            "]/ancestor::td/following-sibling::td)[3]//span";
    static final String DYNAMIC_BOARD_STATUS = "(//span[@class = 'custom-board-name' and contains(text(), '{0}')]/ancestor::td/following-sibling::td)[1]//span";
}
