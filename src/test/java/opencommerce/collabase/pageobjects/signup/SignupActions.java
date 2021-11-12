package opencommerce.collabase.pageobjects.signup;

import common.utilities.DataHelper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.Map;

public class SignupActions extends UIInteractionSteps {

    public static String email;

    public void with(DataTable info) {
        List<Map<String, String>> signUpInfo = info.asMaps(String.class, String.class);

        DataHelper data = DataHelper.getData();

        String fullname = signUpInfo.get(0).get("fullname");
        email = signUpInfo.get(0).get("email");
        String password = signUpInfo.get(0).get("password");
        String confirmPassword = signUpInfo.get(0).get("confirmPassword");

        if (email == null) {
            email = "";
        }

        if (email.equals("random")) {
            email = data.getEmail();
        }

        $(SignupPage.FULLNAME_TXTBX).sendKeys(fullname);
        $(SignupPage.EMAIL_TXTBX).sendKeys(email);
        $(SignupPage.PASSWORD_TXTBX).sendKeys(password);
        $(SignupPage.CONFIRM_PASSWORD_TXTBX).sendKeys(confirmPassword);
        $(SignupPage.SIGN_UP_BTN).click();
    }
}
