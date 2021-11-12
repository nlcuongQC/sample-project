package opencommerce.collabase.pageobjects.addnewitem;

import common.utilities.DataHelper;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.common.CommonActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewItemActions extends UIInteractionSteps {

    String fieldName, personName, tabName, optionName;

    @Steps
    CommonActions commonActions;

    public void toBoardWithoutLink() {
        DataHelper data = DataHelper.getData();
        String itemName = data.getRandomNameWithPrefix("Item");

        atFieldName("Text").inputToMainModelTxtbx(itemName);
        atFieldName("Long content").inputToMainModelTxtarea("Description");
        atFieldName("Number").inputToMainModelTxtbx("123456");
        atFieldName("Checkbox").atOption("Option C").clickToMainModelCheckbox();
        atFieldName("Dropdown").clickToMainModelDropdown();
        commonActions.clickToDropdownItem("Dropdown 2");
        waitForCondition().until(ExpectedConditions.textToBe($(AddNewItemPage.MAIN_MODEL_DROPDOWN_TXT, "Dropdown"),
                "Dropdown 2"));
        atFieldName("Tag").clickToMainModelTag();
        atFieldName("Radio").atOption("Radio 2").clickToMainModelRadioBtn();
        atFieldName("Person").clickToMainModelPersonDropdown();
        waitForCondition().until(ExpectedConditions.textToBe($(AddNewItemPage.MAIN_MODEL_PERSON_DROPDOWN, fieldName), "Cường Nguyễn"));
        atFieldName("Date").clickToMainModelDateTxtbx();
        atFieldName("Date").inputToMainModelTxtbx("09/10/2021");
        atFieldName("Time").clickToMainModelTxtbx();
        atFieldName("Percent").inputToMainModelTxtbx("25");
        atFieldName("Required").inputToMainModelTxtbx("Required");
    }

    @Step
    public void clickToMainModelTxtbx() {
        $(AddNewItemPage.MAIN_MODEL_TXTBX, fieldName).click();
    }

    @Step
    public void clickToMainModelDateTxtbx() {
        $(AddNewItemPage.MAIN_MODEL_DATE_TXTBX, fieldName).click();
    }

    @Step
    public void clickToMainModelRadioBtn() {
        $(AddNewItemPage.MAIN_MODEL_RADIO_BTN, fieldName, optionName).click();
    }

    @Step
    public void clickToMainModelTag() {
        $(AddNewItemPage.MAIN_MODEL_TAG, fieldName).click();
    }

    @Step
    public void clickToMainModelDropdown() {
        $(AddNewItemPage.MAIN_MODEL_DROPDOWN, fieldName).click();
    }

    @Step
    public void clickToMainModelCheckbox() {
        $(AddNewItemPage.MAIN_MODEL_CHECKBOX, fieldName, optionName).click();
    }

    @Step
    public AddNewItemActions atOption(String optionName) {
        this.optionName = optionName;
        return this;
    }

    @Step
    public void inputToMainModelTxtarea(String description) {
        $(AddNewItemPage.MAIN_MODEL_TXTAREA, fieldName).type(description);
    }

    @Step
    public AddNewItemActions atFieldName(String name) {
        this.fieldName = name;
        return this;
    }

    @Step
    public void inputToMainModelTxtbx(String value) {
        $(AddNewItemPage.MAIN_MODEL_TXTBX, fieldName).type(value);
    }

    @Step
    public void clickToMainModelPersonDropdown() {
        $(AddNewItemPage.MAIN_MODEL_PERSON_DROPDOWN, fieldName).click();
    }

    @Step
    public AddNewItemActions atPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    @Step
    public void clickToMainModelPersonPopupItem() {
        $(AddNewItemPage.MAIN_MODEL_PERSON_POPUP_ITEM, personName).click();
    }

    @Step
    public void clickToSaveBtn() {
        $(AddNewItemPage.SAVE_BTN).click();
    }

    @Step
    public void clickToAddNewEntryBtn() {
        $(AddNewItemPage.ADD_NEW_ENTRY_BTN, fieldName).click();
    }

    @Step
    public AddNewItemActions atTabName(String tabName) {
        this.tabName = tabName;
        return this;
    }

    @Step
    public void clickToTab() {
        commonActions.scrollToElement($(AddNewItemPage.TAB, tabName));
        $(AddNewItemPage.TAB, tabName).click();
    }
}
