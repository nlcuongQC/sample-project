package common.utilities;

import org.openqa.selenium.Dimension;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CommonFunctions {
    private static void setViewPort(int width, int height) {
        getDriver().manage().window().setSize(new Dimension(width, height));
    }

    public static void maximizeWindow() {
        try {
            setViewPort(1920, 1080);
            getDriver().manage().window().maximize();
        } catch (Exception e) {
            setViewPort(1920, 1080);
        }
    }
}
