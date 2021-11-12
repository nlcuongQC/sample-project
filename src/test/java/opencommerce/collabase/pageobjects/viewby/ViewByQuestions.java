package opencommerce.collabase.pageobjects.viewby;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ViewByQuestions extends UIInteractionSteps {

    String propertyName;

    @Step
    public ViewByQuestions atPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    @Step
    public void verifyPropertyIsNotDisplayed() {
        $(ViewByPage.DYNAMIC_PROPERTY, propertyName).shouldNotBeVisible();
    }
}
