package opencommerce.collabase.pageobjects.sidebardashboardmenu;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SidebarDashboardMenuQuestion extends UIInteractionSteps {

    @Step
    public void verifyWorkspaceNameIsDisplayed() {
        waitForCondition().until(
                ExpectedConditions.visibilityOfElementLocated(SidebarDashboardMenuPage.WORKSPACE_NAME)).isDisplayed();
    }
}
