package opencommerce.collabase.pageobjects.boarduse;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class BoardUseQuestions extends UIInteractionSteps {

    @Step
    public void verifyBoardUseTitleIs(String title) {
        $(BoardUsePage.BOARD_TITLE).shouldContainText(title);
    }

    @Step
    public void verifyAmountOfBoardItemsIs(int amount) {
        assertThat($$(BoardUsePage.BOARD_ITEMS).size()).isEqualTo(amount);
    }

    @Step
    public void verifyBoardItemsIsDisplayedWithName(String name) {
        $(BoardUsePage.DYNAMIC_PROPERTY_NAME, name).shouldBeVisible();
    }

    @Step
    public void verifyBoardItemsIsNotDisplayedWithName(String name) {
        $(BoardUsePage.DYNAMIC_PROPERTY_NAME, name).shouldBeVisible();
    }
}
