package opencommerce.collabase.pageobjects.boardadmindetail;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardAdminDetailQuestions extends UIInteractionSteps {

    String modelName, propertyType, position;

    @Step
    public void verifyMainModelTitleIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(BoardAdminDetailPage.MAIN_MODEL_TITLE)).isDisplayed();
    }

    @Step
    public void verifyErrorBlankBoardnameIs(String message) {
        waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(BoardAdminDetailPage.BOARD_NAME_VALIDATE_TXT)).isDisplayed();
        $(BoardAdminDetailPage.BOARD_NAME_VALIDATE_TXT).shouldContainText(message);
    }

    public BoardAdminDetailQuestions verifyModel(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Step
    public void isDisplayedInRelation() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(BoardAdminDetailPage.DYNAMIC_MODEL_IN_RELATION_WITH_NAME, modelName))).isDisplayed();
    }

    @Step
    public void verifyMainModelTitleInRelationIs(String modelTitle) {
        $(BoardAdminDetailPage.MAIN_MODEL_TITLE).shouldContainText(modelTitle);
    }

    @Step
    public void verifyMainModelTitleInRelationIsNot(String modelTitle) {
        $(BoardAdminDetailPage.MAIN_MODEL_TITLE).shouldNotContainText(modelTitle);
    }

    @Step
    public void verifyErrorMessageBlankModelIs(String message) {
        $(BoardAdminDetailPage.BLANK_NAME_ERROR_MSG).shouldContainText(message);
    }

    @Step
    public BoardAdminDetailQuestions atModel(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Step
    public BoardAdminDetailQuestions atPosition(String position) {
        this.position = position;
        return this;
    }

    @Step
    public void verifySelectModelDropdownTxtIs(String value) {
        WebElementFacade selectModelDropdownTxt = $(BoardAdminDetailPage.DYNAMIC_SELECT_MODEL_DROPDOWN_TXT_WITH_MODEL_NAME, modelName);
        waitForCondition().until(ExpectedConditions.visibilityOf(selectModelDropdownTxt)).isDisplayed();
        selectModelDropdownTxt.shouldContainText(value);
    }

    @Step
    public void verifySelectModelDropdownTxtIsNot(String value) {
        WebElementFacade selectModelDropdownTxt = $(BoardAdminDetailPage.DYNAMIC_SELECT_MODEL_DROPDOWN_TXT_WITH_MODEL_NAME, modelName);
        waitForCondition().until(ExpectedConditions.visibilityOf(selectModelDropdownTxt)).isDisplayed();
        selectModelDropdownTxt.shouldNotContainText(value);
    }

    @Step
    public void verifySelectModelDropdownTxtIsDisplayed() {
        WebElementFacade selectModelDropdownTxt = $(BoardAdminDetailPage.DYNAMIC_SELECT_MODEL_DROPDOWN_TXT_WITH_MODEL_NAME, modelName);
        waitForCondition().until(ExpectedConditions.visibilityOf(selectModelDropdownTxt)).isDisplayed();
    }

    @Step
    public BoardAdminDetailQuestions atPropertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    @Step
    public void verifyPropertyOptionBtnIsNotDisplayed() {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_OPTION_BTN_WITH_MODEL_NAME_AND_PROPERTY_TYPE, modelName, propertyType).shouldNotBeVisible();
    }

    @Step
    public void verifyCloseBoardBtnIsDisabled() {
        assertThat($(BoardAdminDetailPage.CLOSE_BOARD_BTN).getAttribute("class")).contains("is-disabled");
    }

    @Step
    public void verifyCloseBoardBtnIsEnabled() {
        $(BoardAdminDetailPage.CLOSE_BOARD_BTN).shouldBeEnabled();
    }

    @Step
    public void verifyPublishBtnIsNotDisplayed() {
        $(BoardAdminDetailPage.PUBLISH_BTN).shouldNotBeVisible();
    }

    @Step
    public void verifyPropertyNameErrorMessageIs(String message) {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_NAME_ERROR_WITH_MODEL_NAME_AND_POSITION, modelName, position).shouldContainText(message);
    }

    @Step
    public void verifyPropertyTypeDropdownTxtIs(String propertyType) {
        $(BoardAdminDetailPage.DYNAMIC_PROPERTY_TYPE_DROPDOWN_TXT_WITH_MODEL_NAME_AND_POSITION, modelName, position).shouldContainText(propertyType);
    }
}
