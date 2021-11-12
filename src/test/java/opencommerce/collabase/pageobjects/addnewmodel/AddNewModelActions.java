package opencommerce.collabase.pageobjects.addnewmodel;

import common.utilities.DataHelper;
import common.utilities.LoadObject;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailActions;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailQuestions;
import opencommerce.collabase.pageobjects.common.CommonActions;

public class AddNewModelActions {
    public static String modelName;

    @Steps
    BoardAdminDetailActions boardAdminDetailActions;

    @Steps
    BoardAdminDetailQuestions boardAdminDetailQuestions;

    @Steps
    CommonActions commonActions;

    public void withoutModelName() {
        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
    }

    public void withDuplicateModelName() {
        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.inputToModelNameTxtbx("DupeModel");
        boardAdminDetailActions.clickToSetMainModelCheckbx();
        boardAdminDetailActions.inputToModelDescriptionTxtbx("Test Description");
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
    }

    public void isMainWithValidName() {
        DataHelper data = DataHelper.getData();
        modelName = data.getRandomNameWithPrefix("Model");

        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.inputToModelNameTxtbx(modelName);
        boardAdminDetailActions.clickToSetMainModelCheckbx();
        boardAdminDetailActions.inputToModelDescriptionTxtbx("Test Description");
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
        boardAdminDetailQuestions.verifyModel(modelName).isDisplayedInRelation();
    }

    public void notMainWithValidName() {
        DataHelper data = DataHelper.getData();
        modelName = data.getRandomNameWithPrefix("Model");

        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.inputToModelNameTxtbx(modelName);
        boardAdminDetailActions.inputToModelDescriptionTxtbx("Test Description");
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
        boardAdminDetailQuestions.verifyModel(modelName).isDisplayedInRelation();
    }

    public void withoutDescription() {
        DataHelper data = DataHelper.getData();
        modelName = data.getRandomNameWithPrefix("Model");

        boardAdminDetailActions.clickToAddNewModelBtn();
        boardAdminDetailActions.inputToBoardNameTxtbx(modelName);
        boardAdminDetailActions.clickToAddNewModelSaveBtn();
    }

    public void fromAnotherBoard() {
        boardAdminDetailActions.clickToLinkToAnotherBoardBtn();
        boardAdminDetailActions.clickToSelectBoardDropdown();
        commonActions.clickToDropdownItem(LoadObject.getProperty("anotherboard.name"));
        boardAdminDetailActions.clickToLinkToAnotherBoardSaveBtn();
    }
}
