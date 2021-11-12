package common.enums;

public enum SettingsAdministrationMenu {
    BOARDS("Boards"),
    GENERAL("General"),
    TEAMS("Teams");

    public String value;

    SettingsAdministrationMenu(String value) {
        this.value = value;
    }
}
