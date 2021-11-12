package opencommerce.collabase.pageobjects.boarduse;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class BoardUseActions extends UIInteractionSteps {

    @Step
    public void inputToSearchBoardTxtbx(String value) {
        $(BoardUsePage.SEARCH_BOARD_TXTBX).typeAndEnter(value);
    }

    @Step
    public void clickToViewByBtn() {
        $(BoardUsePage.VIEW_BY_BTN).click();
    }

    @Step
    public void openAddNewItemForm() {
        clickToAddItemsBtnDropdown();
        clickToAddItemsBtnItem("Add new item");
    }

    @Step
    public void clickToAddItemsBtnDropdown() {
        $(BoardUsePage.ADD_ITEMS_BTN_DROPDOWN).click();
    }

    @Step
    public void clickToAddItemsBtnItem(String name) {
        $(BoardUsePage.DYNAMIC_ADD_ITEMS_BTN_ITEM, name).click();
    }
}
