package opencommerce.collabase.pageobjects.addnewitem;

import org.openqa.selenium.By;

public class AddNewItemPage {
    static final By SAVE_BTN = By.xpath("//span[contains(., 'Save')]/parent::button");
    static final By MAIN_MODEL_FILE = By.xpath("//input[@type = 'file']");

    static final String ADD_NEW_ENTRY_BTN = "//span[@class = 'board-use-label' and contains(., '{0}')]/." +
            "./following-sibling::div//span[text() = 'Add new entry']";
    static final String TAB = "//div[contains(@id, 'tab')]/div[. = '{0}']";
    static final String LINKED_MODEL_FIELD_TITLE = "//div[@class = 'col-xs-12 sb-pt-medium']/div[contains(., '{0}')]";
    static final String LINKED_MODEL_DEFAULT_FIELD_DROPDOWN = "//div[@class = 'col-xs-12 sb-pt-medium']/div[contains(" +
            "., '{0}')]//button";
    static final String LINKED_MODEL_FIELD_TXTBX = "//div[@class = 'col-xs-12 sb-pt-medium']/div[contains(., '{0}')" +
            "]//input";
    static final String MAIN_MODEL_TXTBX = "//span[. = '{0}']/../following-sibling::div//input";
    static final String MAIN_MODEL_DATE_TXTBX = "//span[. = '{0}']/../following-sibling::div//div[contains(@class, " +
            "'align')]";
    static final String MAIN_MODEL_TXTAREA = "//span[. = '{0}']/../following-sibling::div//textarea";
    static final String MAIN_MODEL_CHECKBOX = "//span[. = '{0}']/../following-sibling::div//span[. = '{1}']";
    static final String MAIN_MODEL_DROPDOWN = "//span[. = '{0}']/../following-sibling::div//button";
    static final String MAIN_MODEL_REQUIRED_ERROR_TXT = "//span[@class = 'board-use-label' and contains(., '{0}')]/." +
            "./following-sibling::div//div[contains(@class, 'invalid-text')]";
    static final String MAIN_MODEL_DROPDOWN_TXT = "//span[. = '{0}']/../following-sibling::div//button/span[contains" +
            "(@class, 'label')]";
    static final String MAIN_MODEL_TAG = "//span[. = '{0}']/../following-sibling::div//div[contains(@class, " +
            "'trigger')]";
    static final String MAIN_MODEL_TAG_POPUP_ITEM = "//div[@class = 'sb-py-medium popper-box-shadow']//span[contains" +
            "(text(), '{0}')]";
    static final String MAIN_MODEL_TAG_ITEM = "//span[. = '{0}']/../following-sibling::div//div[contains(@class, " +
            "'trigger')]//span[contains(text(), '{1}')]";
    static final String MAIN_MODEL_RADIO_BTN = "//span[. = '{0}']/../following-sibling::div//span[contains(text(), " +
            "'{1}')]";
    static final String MAIN_MODEL_PERSON_DROPDOWN = "//span[. = '{0}']/../following-sibling::div//div[contains" +
            "(@class, 'border')]/span[@class = 'sb-pr-small']/following-sibling::span[not(contains(@class, 'pos'))]";
    static final String MAIN_MODEL_PERSON_POPUP_ITEM = "//input[@placeholder = 'Search members to " +
            "assign']/ancestor::div[contains(@class, 'sb-px-medium')]/following-sibling::div//span[contains(., '{0}')" +
            "]/../..";
}
