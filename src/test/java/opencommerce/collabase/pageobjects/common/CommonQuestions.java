package opencommerce.collabase.pageobjects.common;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonQuestions extends UIInteractionSteps {

    public void verifyPageTitleIs(String title) {
        assertThat(getDriver().getTitle()).contains(title);
    }

    public void verifyPageUrlIsEndsWith(String url) {
        assertThat(getDriver().getCurrentUrl()).endsWith(url);
    }
}
