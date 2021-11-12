package opencommerce.collabase.pageobjects.addnewteam;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;

public class AddNewTeamQuestions extends UIInteractionSteps {

    String fieldName;

    @Step
    public AddNewTeamQuestions atFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @Step
    public void verifyErrorMessageIs(String errorMessage) {
        if (fieldName.equals("Managers Members")) {
            List<String> fieldNames = Arrays.asList(fieldName.split(" "));
            String manager = fieldNames.get(0);
            String member = fieldNames.get(1);

            waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewTeamPage.DYNAMIC_ERROR, fieldName))).isDisplayed();
            $(AddNewTeamPage.DYNAMIC_ERROR, manager).shouldContainText(errorMessage);
            waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewTeamPage.DYNAMIC_ERROR, fieldName))).isDisplayed();
            $(AddNewTeamPage.DYNAMIC_ERROR, member).shouldContainText(errorMessage);

        } else {
            waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewTeamPage.DYNAMIC_ERROR, fieldName))).isDisplayed();
            $(AddNewTeamPage.DYNAMIC_ERROR, fieldName).shouldContainText(errorMessage);
        }

    }

    @Step
    public void verifyMemberTagIsDisplayedWithName(String name) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewTeamPage.DYNAMIC_TAG_MEMBER, name))).isDisplayed();
    }

    @Step
    public void verifyManagerTagIsDisplayedWithName(String name) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(AddNewTeamPage.DYNAMIC_TAG_MANAGER, name))).isDisplayed();
    }
}