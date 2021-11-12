package opencommerce.collabase.pageobjects.createpassword;

import org.openqa.selenium.By;

class CreatePasswordPage {

    static final String DYNAMIC_ERROR_TEXT_AT_FIELD = "//input[@name= '{0}']/../following-sibling::div";

    static final By PASSWORD_TXTBX = By.id("password");
    static final By FULLNAME_TXTBX = By.id("name");
    static final By CONFIRM_PASSWORD_TXTBX = By.xpath("//input[@name = 'confirmPassword']");
    static final By SUBMIT_BTN = By.xpath("//div[@class = 'ui-stack-login text-right']/button");
}