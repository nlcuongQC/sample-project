package common.utilities;



public class main {
    enum MENU {
        OTHER_WORKSPACES("Other workspaces"),
        INVITE_PEOPLE_TO("Invite people to"),
        SETTINGS_ADMINISTRATION("Settings & Administration"),
        SIGNOUT("Sign out");

        private String value;

        private MENU(String value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        System.out.println(MENU.SIGNOUT.value);
    }
}