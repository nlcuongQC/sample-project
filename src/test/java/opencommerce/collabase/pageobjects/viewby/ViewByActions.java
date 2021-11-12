package opencommerce.collabase.pageobjects.viewby;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ViewByActions extends UIInteractionSteps {

    String propertyName;

    @Step
    public void clickToResetViewBtn() {
        $(ViewByPage.RESET_VIEW_BTN).click();
    }

    @Step
    public void clickToSaveBtn() {
        $(ViewByPage.SAVE_BTN).click();
    }

    @Step
    public void clickToProperty() {
        $(ViewByPage.DYNAMIC_PROPERTY, propertyName).click();
    }

    @Step
    public ViewByActions atProperty(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    public void untickOfAllViewBy() {
        atProperty("Text").clickToProperty();
        atProperty("Long content").clickToProperty();
        atProperty("Number").clickToProperty();
        atProperty("Checkbox").clickToProperty();
        atProperty("Dropdown").clickToProperty();
        atProperty("Tag").clickToProperty();
        atProperty("Radio").clickToProperty();
        atProperty("Person").clickToProperty();
        atProperty("Date").clickToProperty();
        atProperty("Time").clickToProperty();
        atProperty("Percent").clickToProperty();
        atProperty("Formula").clickToProperty();
        atProperty("Required").clickToProperty();
    }

    public void untickOfSomeViewBy() {
        atProperty("Text").clickToProperty();
        atProperty("Number").clickToProperty();
        atProperty("Checkbox").clickToProperty();
    }
}
