package opencommerce.collabase.pageobjects.createworkspace;

import common.utilities.DataHelper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.header.HeaderQuestions;

import java.util.List;
import java.util.Map;

public class CreateWorkspaceActions extends UIInteractionSteps {

    @Steps
    HeaderQuestions headerQuestions;

    public void with(DataTable info) {
        List<Map<String, String>> createWorkspaceInfo = info.asMaps(String.class, String.class);

        DataHelper data = DataHelper.getData();

        String workspaceName = createWorkspaceInfo.get(0).get("Workspace name");
        String shortname = createWorkspaceInfo.get(0).get("Short name");

        if (workspaceName == null) {
            workspaceName = "";
        }

        if (shortname.equals("random")) {
            shortname = data.getName();
        }
        $(CreateWorkspacePage.WORKSPACE_NAME_TXTBX).sendKeys(workspaceName);
        $(CreateWorkspacePage.SHORT_NAME_TXTBX).sendKeys(shortname);
        $(CreateWorkspacePage.NEXT_BTN).click();
    }
}
