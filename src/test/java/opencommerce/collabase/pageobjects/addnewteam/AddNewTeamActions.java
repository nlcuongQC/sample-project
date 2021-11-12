package opencommerce.collabase.pageobjects.addnewteam;

import common.utilities.DataHelper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class AddNewTeamActions extends UIInteractionSteps {

    @Steps
    AddNewTeamQuestions addNewTeamQuestions;

    public static String teamName;

    public void with(DataTable info) {
        List<Map<String, String>> newTeamInfo = info.asMaps(String.class, String.class);

        DataHelper data = DataHelper.getData();

        teamName = newTeamInfo.get(0).get("Team name");
        String handle = newTeamInfo.get(0).get("Handle");
        String description = newTeamInfo.get(0).get("Description");
        String managers = newTeamInfo.get(0).get("Managers");
        String members = newTeamInfo.get(0).get("Members");

        if (managers == null) {
            managers = "";
        }

        if (members == null) {
            members = "";
        }

        if (teamName.equals("Pcam random")) {
            teamName = data.getRandomNameWithPrefix("Pcam");
        }

        if (handle.equals("pcam random")) {
            handle = data.getRandomNameWithPrefix("pcam");
        }

        if (managers.equals("") && members.equals("")) {
            inputToTeamNameTxtbx(teamName);
            clearHandleTxtbx();
            inputToHandleTxtbx(handle);
            inputToDescriptionTxtarea(description);
            clickToSaveBtn();
        }

        inputToTeamNameTxtbx(teamName);
        clearHandleTxtbx();
        inputToHandleTxtbx(handle);
        inputToDescriptionTxtarea(description);
        clickToManagerTxtbx();
        clickToMemberName(managers);
        addNewTeamQuestions.verifyManagerTagIsDisplayedWithName(managers);
        clickToTeamNameTxtbx();
        clickToMemberTxtbx();
        clickToMemberName(members);
        addNewTeamQuestions.verifyMemberTagIsDisplayedWithName(members);
        clickToTeamNameTxtbx();
        clickToSaveBtn();
    }

    @Step
    public void inputToTeamNameTxtbx(String teamName) {
        $(AddNewTeamPage.TEAM_NAME_TXTBX).type(teamName);
    }

    @Step
    public void clickToTeamNameTxtbx() {
        $(AddNewTeamPage.TEAM_NAME_TXTBX).click();
    }

    @Step
    public void clearHandleTxtbx() {
        $(AddNewTeamPage.HANDLE_TXTBX).clear();
    }

    @Step
    public void inputToHandleTxtbx(String handleName) {
        $(AddNewTeamPage.HANDLE_TXTBX).type(handleName);
    }

    @Step
    public void inputToDescriptionTxtarea(String description) {
        $(AddNewTeamPage.DESCRIPTION_TXTAREA).type(description);
    }

    @Step
    public void clickToManagerTxtbx() {
        $(AddNewTeamPage.MANAGERS_TXTBX).click();
    }

    @Step
    public void clickToSaveBtn() {
        $(AddNewTeamPage.SAVE_BTN).click();
    }

    @Step
    public void clickToMemberName(String memberName) {
        $(AddNewTeamPage.DYNAMIC_MEMBER_CHECKBX, memberName);
    }

    @Step
    public void clickToMemberTxtbx() {
        $(AddNewTeamPage.MEMBERS_TXTBX).click();
    }
}
