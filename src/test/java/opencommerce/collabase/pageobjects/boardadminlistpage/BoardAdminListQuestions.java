package opencommerce.collabase.pageobjects.boardadminlistpage;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class BoardAdminListQuestions extends UIInteractionSteps {

    String boardName;

    public BoardAdminListQuestions verifyBoard(String boardName) {
        this.boardName = boardName;
        return this;
    }

    public void statusIs(String status) {
        $(BoardAdminListPage.DYNAMIC_BOARD_STATUS, boardName).shouldContainText(status);
    }

    public void modelIs(String model) {
        $(BoardAdminListPage.DYNAMIC_BOARD_MODELS, boardName).shouldContainText(model);
    }

}
