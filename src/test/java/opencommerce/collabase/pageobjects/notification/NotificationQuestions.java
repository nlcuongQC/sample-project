package opencommerce.collabase.pageobjects.notification;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NotificationQuestions extends UIInteractionSteps {

    String position;

    @Step
    public NotificationQuestions atPosition(String position) {
        this.position = position;
        return this;
    }

    @Step
    public void verifyNotificationIs(String notification) {
        $(NotificationPage.NOTIFICATION, position).shouldContainText(notification);
    }

}
