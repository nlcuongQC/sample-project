package opencommerce.collabase.pageobjects.createpassword;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.Map;

public class CreatePasswordActions extends UIInteractionSteps {
    public void with(String password, String confirmPassword) {
        $(CreatePasswordPage.PASSWORD_TXTBX).sendKeys(password);
        $(CreatePasswordPage.CONFIRM_PASSWORD_TXTBX).sendKeys(confirmPassword);
        $(CreatePasswordPage.SUBMIT_BTN).click();
    }

    public void withInvitation(DataTable info) {
        List<Map<String, String>> createPasswordInfo = info.asMaps(String.class, String.class);

        String fullname = createPasswordInfo.get(0).get("Fullname");
        String password = createPasswordInfo.get(0).get("Password");
        String confirmPassword = createPasswordInfo.get(0).get("Confirm password");

        if (fullname == null) {
            fullname = "";
        }

        if (password == null) {
            password = "";
        }

        if (password.equals("space")) {
            password = "      ";
        }

        if (confirmPassword == null) {
            confirmPassword = "";
        }

        $(CreatePasswordPage.FULLNAME_TXTBX).sendKeys(fullname);
        $(CreatePasswordPage.PASSWORD_TXTBX).sendKeys(password);
        $(CreatePasswordPage.CONFIRM_PASSWORD_TXTBX).sendKeys(confirmPassword);
        $(CreatePasswordPage.SUBMIT_BTN).click();
    }
}
