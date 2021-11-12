package opencommerce.collabase.pageobjects.addnewboard;

import common.utilities.DataHelper;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailActions;

public class AddNewBoardActions extends UIInteractionSteps {

    public static String boardName;
    public static String modelName;

    @Steps
    BoardAdminDetailActions boardAdminDetailActions;

    public void withoutBoardName() {
        boardAdminDetailActions.inputToBoardNameTxtbx("");
    }

    public void withoutMainModel() {
        DataHelper data = DataHelper.getData();
        boardName = data.getRandomNameWithPrefix("Board");
        boardAdminDetailActions.inputToBoardNameTxtbx(boardName);
    }

    public void withMainModel() {
        DataHelper data = DataHelper.getData();
        boardName = data.getRandomNameWithPrefix("Board");
        modelName = data.getRandomNameWithPrefix("Model");

        boardAdminDetailActions.inputToBoardNameTxtbx(boardName);
        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.inputToModelNameTxtbx(modelName);
        boardAdminDetailActions.clickToSetMainModelCheckbx();
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
    }
}
