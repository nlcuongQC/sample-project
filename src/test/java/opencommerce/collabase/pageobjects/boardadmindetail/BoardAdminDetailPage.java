package opencommerce.collabase.pageobjects.boardadmindetail;

import org.openqa.selenium.By;

public class BoardAdminDetailPage {
    static final By BOARD_NAME_TXTBX = By.xpath("//input[@class = 'board-name']");
    static final By PUBLISH_BTN = By.xpath("//span[contains(text(), 'Publish')]/parent::button");
    static final By MORE_BTN = By.xpath("//span[contains(text(), 'More')]/parent::button");
    static final By CLOSE_BOARD_BTN = By.xpath("//li[contains(text(), 'Close Board')]");
    static final By BOARD_NAME_VALIDATE_TXT = By.cssSelector(".board-name ~ div");
    static final By BACK_ARROW_BTN = By.xpath("//span[@class = 'pr-6 pointer pt-13']/span");
    static final By NAME_TXTBX = By.xpath("//label[@for = 'modelName']/following-sibling::div//input");
    static final By SET_MAIN_MODEL_CHCKBX = By.xpath("//span[contains(text(), 'Set as main model')]/parent::label");
    static final By MODEL_DESCRIPTION_TXTAREA = By
            .xpath("//label[@for = 'modelDescription']/following-sibling::div//textarea");
    static final By SAVE_BTN = By.xpath("//div[contains(text(), 'Add new model')]/..//button");
    static final By BLANK_NAME_ERROR_MSG = By
            .xpath("//label[@for = 'modelName']/following-sibling::div//div[contains(@class, 'message')]");
    static final By MAIN_MODEL_TITLE = By.xpath("//div[@id = 'board-model-visual']//h5[contains(@title, '(Main)')]");
    static final By ADD_NEW_MODEL_BTN = By.xpath("//span[contains(text(), 'Add new model')]/ancestor::button");
    static final By ADD_SYSTEM_MODEL_BTN = By.xpath("//span[contains(text(), 'Add system model')]/ancestor::button");
    static final By LINK_TO_ANOTHER_BOARD_BTN = By
            .xpath("//span[contains(text(), 'Link to another board')]/ancestor::button");
    static final By SELECT_BOARD_DROPDOWN = By.xpath("//span[contains(text(), 'Select board')]/parent::button");
    static final By LINK_TO_ANOTHER_BOARD_SAVE_BTN = By.xpath("(//span[contains(text(), 'Save')]/../parent::button)" +
            "[3]");

    static final String DYNAMIC_PROPERTY_NAME_WITH_MODEL_NAME_AND_POSITION = "(//div[contains(., '{0}') and contains" +
            "(@class, 'align')]/following-sibling::div//input[@placeholder = \"Field's name\"])[{1}]";
    static final String DYNAMIC_PROPERTY_NAME_ERROR_WITH_MODEL_NAME_AND_POSITION = "(//div[contains(., '{0}') and " +
            "contains(@class, 'align')]/following-sibling::div//div[contains(@class, 'input__inner')])[{1}]/../." +
            "./following-sibling::div";
    static final String DYNAMIC_PROPERTY_TYPE_DROPDOWN_WITH_MODEL_NAME_AND_POSITION = "(//div[contains(., '{0}') and " +
            "contains(@class, 'sb-mb-medium')]/following-sibling::div//div[@class = 'row input-container'])" +
            "[{1}]//button[contains(., 'Type')]";
    static final String DYNAMIC_PROPERTY_TYPE_DROPDOWN_TXT_WITH_MODEL_NAME_AND_POSITION = "((//div[contains(., '{0}')" +
            " and contains(@class, 'sb-mb-medium')]/following-sibling::div//div[@class = 'row input-container'])" +
            "[{1}]//span[contains(@class, 'sb-button--label')])[1]";
    static final String DYNAMIC_ADD_FIELD_BTN_WITH_MODEL_NAME = "//span[contains(text(), '{0}')]/ancestor::div[@class" +
            " = 'setting-page__block']//span[contains(text(), 'Add field')]";
    static final String DYNAMIC_SELECT_MODEL_DROPDOWN_WITH_MODEL_NAME = "(//div[contains(., '{0}') and contains" +
            "(@class, 'sb-mb-medium')]/following-sibling::div//div[@class = 'row input-container'])[last()" +
            "]//div[@class = 'col-xs-2']//button[not(contains(., 'Link to model'))]";
    static final String DYNAMIC_SELECT_MODEL_DROPDOWN_TXT_WITH_MODEL_NAME = "((//div[contains(., '{0}') and contains" +
            "(@class, 'sb-mb-medium')]/following-sibling::div//div[@class = 'row input-container'])[last()" +
            "]//span[contains(@class, 'sb-button--label')])[2]";
    static final String DYNAMIC_PROPERTY_OPTION_BTN_WITH_MODEL_NAME_AND_PROPERTY_TYPE = "(//div[contains(., '{0}') " +
            "and contains(@class, 'sb-mb-medium')]/following-sibling::div//div[@class = 'row " +
            "input-container']//div//span[contains(text(), '{1}')])[1]/ancestor::div[@class = 'row " +
            "input-container']//div[@class = 'col-xs-1 max-width-53']//button";
    static final String DYNAMIC_MODEL_IN_RELATION_WITH_NAME = "//div[@id = 'board-model-visual']//h5[contains(@title," +
            " '{0}')]";
}
