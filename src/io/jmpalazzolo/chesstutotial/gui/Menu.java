package io.jmpalazzolo.chesstutotial.gui;

public enum Menu {
    START_MENU,
    START_MENU_CONFIGURE,
    START_MENU_QUIT,
    SYSTEM_MENU,
    CREATE_USER,
    SEARCH_USER,
    UPDATE_USER,
    DELETE_USER;

    public static Menu getMenuByNumber(final int id) {
        switch (id) {
            case 1:
                return START_MENU;
            case 2:
                return START_MENU_CONFIGURE;
            case 3:
                return START_MENU_QUIT;
            case 4:
                return SYSTEM_MENU;
            case 5:
                return CREATE_USER;
            case 7:
                return SEARCH_USER;
            case 8:
                return UPDATE_USER;
            case 9:
                return DELETE_USER;
            default:
                throw new RuntimeException("Menu not defined in " + Menu.class.getCanonicalName());
        }
    }
}
