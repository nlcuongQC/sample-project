package opencommerce.collabase.pageobjects.addnewitem;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class AddNewItemQuestions extends UIInteractionSteps {

    String fieldName, personName;

    @Step
    public AddNewItemQuestions atFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @Step
    public AddNewItemQuestions atPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    @Step
    public void verifyMainModelPersonPopupItemIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewItemPage.MAIN_MODEL_PERSON_POPUP_ITEM, fieldName))).isDisplayed();
    }

    @Step
    public void verifyMainModelPersonDropdownIs(String value) {
        $(AddNewItemPage.MAIN_MODEL_PERSON_DROPDOWN, fieldName).shouldContainText(value);
    }

    @Step
    public void verifyLinkedModelDefaultFieldDropdownIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewItemPage.LINKED_MODEL_DEFAULT_FIELD_DROPDOWN, fieldName))).isDisplayed();
    }

    @Step
    public void verifyLinkedModelFieldTitleIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewItemPage.LINKED_MODEL_FIELD_TITLE, fieldName))).isDisplayed();
    }

    @Step
    public void verifyLinkedModelFieldTxtbxIsDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewItemPage.LINKED_MODEL_FIELD_TXTBX, fieldName))).isDisplayed();
    }

    @Step
    public void verifyAmountOfMainModelTxtbxIs(int amount) {
        assertThat($$(AddNewItemPage.MAIN_MODEL_TXTBX, fieldName).size()).isEqualTo(amount);
    }

    @Step
    public void verifyMainModelRequiredErrorTxtIs(String message) {
        $(AddNewItemPage.MAIN_MODEL_REQUIRED_ERROR_TXT, fieldName).shouldContainText(message);
    }
}
