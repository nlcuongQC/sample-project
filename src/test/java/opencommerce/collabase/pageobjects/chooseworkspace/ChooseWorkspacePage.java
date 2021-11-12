package opencommerce.collabase.pageobjects.chooseworkspace;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("page:colla.chooseWorkspace")
public class ChooseWorkspacePage extends PageObject {
    static final String DYNAMIC_WORKSPACE = "//span[contains(text(), '{0}')]/ancestor::a";

    static final By CREATE_NEW_WORKSPACE_BTN = By.xpath("//span[contains(text(), 'Create new workspace')]/ancestor::a");
    static final By TRY_USING_ANOTHER_ACCOUNT_LINK = By.cssSelector(".link-color");
    static final By SELECT_WORKSPACE_TXT = By.cssSelector(".sb-pb-large > .sign__title");
}
