package opencommerce.collabase.pageobjects.common;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonActions extends UIInteractionSteps {

    @Step
    public void clickToDropdownItem(String property) {
        waitForCondition().until(ExpectedConditions.visibilityOf($(CommonPage.DYNAMIC_DROPDOWN_ITEM_WITH_NAME, property))).isDisplayed();
        $(CommonPage.DYNAMIC_DROPDOWN_ITEM_WITH_NAME, property).click();
    }

    @Step
    public void scrollToElement(WebElement element) {
        WebDriver driver = getDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Step
    public void jsClickToElement(WebElement element) {
        WebDriver driver = getDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }
}
