package common.enums;

public enum WorkspaceMenu {
    OTHER_WORKSPACES("Other workspaces"),
    INVITE_PEOPLE_TO("Invite people to"),
    SETTINGS_ADMINISTRATION("Settings & Administration"),
    SIGNOUT("Sign out");

    public String value;

    WorkspaceMenu(String value) {
        this.value = value;
    }
}
