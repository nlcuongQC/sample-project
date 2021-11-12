package opencommerce.collabase.pageobjects.alert;

import org.openqa.selenium.By;

public class AlertPage {
    static final By CONFIRM_EMAIL_MSG = By.xpath("//div[contains(@class, 'alert__content')]/span");
    static final By SUCCESS_BOTTOM_MSG = By.xpath("//div[@class = 's-toast is-success is-bottom']/div");
    static final By SUCCESS_TOP_MSG = By.xpath("//div[@class = 's-toast is-success is-top']/div");
    static final By RED_BOTTOM_MSG = By.xpath("//div[@class = 's-toast is-danger is-bottom']/div");
    static final By RED_TOP_MSG = By.xpath("//div[@class = 's-toast is-danger is-top']/div");
}
