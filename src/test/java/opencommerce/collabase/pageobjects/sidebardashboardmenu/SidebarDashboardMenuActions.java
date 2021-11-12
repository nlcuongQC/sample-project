package opencommerce.collabase.pageobjects.sidebardashboardmenu;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SidebarDashboardMenuActions extends UIInteractionSteps {

    @Step
    public void openWorkspaceNameMenu(){
        $(SidebarDashboardMenuPage.WORKSPACE_NAME).click();
    }

    @Step
    public void chooseBoard(String boardName){
        $(SidebarDashboardMenuPage.DYNAMIC_BOARD, boardName).click();
    }
}
