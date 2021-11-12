package opencommerce.collabase.pageobjects.boardadmindetail;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.common.CommonActions;
import org.openqa.selenium.Keys;

public class BoardAdminDetailActions extends UIInteractionSteps {

    String modelName, position, propertyType;

    @Steps
    CommonActions commonActions;

    @Step
    public void openCloseBoardConfirmation() {
        $(BoardAdminDetailPage.MORE_BTN).click();
        $(BoardAdminDetailPage.CLOSE_BOARD_BTN).click();
    }

    @Step
    public void inputToBoardNameTxtbx(String boardName) {
        $(BoardAdminDetailPage.BOARD_NAME_TXTBX).typeAndTab(boardName);
    }

    @Step
    public void inputToModelNameTxtbx(String modelName) {
        $(BoardAdminDetailPage.NAME_TXTBX).type(modelName);
    }

    @Step
    public void clickToAddNewModelBtn() {
        $(BoardAdminDetailPage.ADD_NEW_MODEL_BTN).click();
    }

    @Step
    public void clickToSetMainModelCheckbx() {
        $(BoardAdminDetailPage.SET_MAIN_MODEL_CHCKBX).click();
    }

    @Step
    public void clickToAddNewModelSaveBtn() {
        $(BoardAdminDetailPage.SAVE_BTN).click();
    }

    @Step
    public void clickToBackArrowBtn() {
        $(BoardAdminDetailPage.BACK_ARROW_BTN).click();
    }

    @Step
    public void clickToPublishBtn() {
        $(BoardAdminDetailPage.PUBLISH_BTN).click();
    }

    @Step
    public void inputToModelDescriptionTxtbx(String description) {
        $(BoardAdminDetailPage.MODEL_DESCRIPTION_TXTAREA).type(description);
    }

    @Step
    public void clickToLinkToAnotherBoardBtn() {
        $(BoardAdminDetailPage.LINK_TO_ANOTHER_BOARD_BTN).click();
    }

    @Step
    public void clickToSelectBoardDropdown() {
        $(BoardAdminDetailPage.SELECT_BOARD_DROPDOWN).click();
    }

    @Step
    public BoardAdminDetailActions atModel(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Step
    public BoardAdminDetailActions atPosition(String position) {
        this.position = position;
        return this;
    }

    @Step
    public void inputToPropertyNameTxtbx(String value) {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_NAME_WITH_MODEL_NAME_AND_POSITION, modelName, position).type(value);
    }

    @Step
    public void pressTabToPropertyName() {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_NAME_WITH_MODEL_NAME_AND_POSITION, modelName, position).sendKeys(Keys.TAB);
    }

    @Step
    public void clickToLinkToAnotherBoardSaveBtn() {
        $(BoardAdminDetailPage.LINK_TO_ANOTHER_BOARD_SAVE_BTN).click();
    }

    @Step
    public void clickPropertyTypeDropdown() {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_TYPE_DROPDOWN_WITH_MODEL_NAME_AND_POSITION, modelName, position).click();
    }

    @Step
    public void clickToAddFieldBtn() {
        $(BoardAdminDetailPage.DYNAMIC_ADD_FIELD_BTN_WITH_MODEL_NAME, modelName).click();
    }

    @Step
    public void clickToSelectModelDropdown() {
        $(BoardAdminDetailPage.DYNAMIC_SELECT_MODEL_DROPDOWN_WITH_MODEL_NAME, modelName).click();
    }

    @Step
    public BoardAdminDetailActions atPropertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    @Step
    public void clickToPropertyOptionBtn() {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_OPTION_BTN_WITH_MODEL_NAME_AND_PROPERTY_TYPE, modelName, propertyType).click();
    }

    public void clickToMoreBtn() {
        commonActions.scrollToElement($(BoardAdminDetailPage.MORE_BTN));
        commonActions.jsClickToElement($(BoardAdminDetailPage.MORE_BTN));
    }
}
