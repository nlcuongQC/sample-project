package opencommerce.collabase.pageobjects.boardadminlistpage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class BoardAdminListActions extends UIInteractionSteps {

    @Step
    public void clickToCreateNewBoardBtn() {
        $(BoardAdminListPage.CREATE_NEW_BOARD_BTN).click();
    }

    @Step
    public void inputToSearchTxtbxWith(String boardName) {
        $(BoardAdminListPage.SEARCH_TXTBX).typeAndEnter(boardName);
    }

    @Step
    public void clickToBoardStatus(String boardStatus) {
        $(BoardAdminListPage.DYNAMIC_BOARD_STATUS, boardStatus).click();
    }
}
