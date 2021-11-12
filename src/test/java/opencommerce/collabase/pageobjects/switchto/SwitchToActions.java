package opencommerce.collabase.pageobjects.switchto;

import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.ArrayList;

public class SwitchToActions extends UIInteractionSteps {
    public void switchToNewTab() {
        ArrayList<String> availableWindows = new ArrayList<>(getDriver().getWindowHandles());
        if (!availableWindows.isEmpty()) {
            getDriver().switchTo().window(availableWindows.get(1));
        }
    }

    public void switchToFrame(String frameName) {
        getDriver().switchTo().frame(frameName);
    }
}
