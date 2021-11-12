package common.utilities;

import org.openqa.selenium.By;

public class MultiBy {

    public static LocatorBuilder named(String des) {
        return new LocatorBuilder(des);
    }

    public static class LocatorBuilder {

        private String des;
        private By androidLocator;
        private By iOSLocator;
        private By locator;

        public LocatorBuilder(String des) {
            this.des = des;
        }

        public LocatorBuilder locatedForAndroid(By androidLocator) {

            this.androidLocator = androidLocator;

            return this;
        }

        public LocatorBuilder locatedForIOS(By iOSLocator) {
            this.iOSLocator = iOSLocator;
            return this;
        }

        public LocatorBuilder locatedForWeb(By locator) {
            this.locator = locator;
            return this;
        }

        public By byPlatform() {

            if(null!=this.androidLocator && null!=this.iOSLocator) {

                if("android".equals(getPlatformName())) {
                    return this.androidLocator;
                }else if("ios".equals(getPlatformName())){
                    return this.iOSLocator;
                }else {
                    throw new RuntimeException("My framework does not support this platform");
                }
            }

            return this.locator;
        }

        private String getPlatformName() {
            String name = "Android";
            // TODO Auto-generated method stub
            return name.toLowerCase();
        }

    }

}
