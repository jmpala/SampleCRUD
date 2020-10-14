package io.jmpalazzolo.chesstutotial.gui.consoleGui.helper;

import com.sun.xml.internal.ws.policy.privateutil.RuntimePolicyUtilsException;
import io.jmpalazzolo.chesstutotial.gui.Menu;

public class NumberToMenuMapper {

    private NumberToMenuMapper() {

    }

    public static Menu getMenuForStartMenuScreen(final int inputNumber) {
        Menu menu;
        switch (inputNumber) {
            case 1:
                menu = Menu.SYSTEM_MENU;
                break;
            case 2:
                menu = Menu.START_MENU_CONFIGURE;
                break;
            case 3:
                menu = Menu.START_MENU_QUIT;
                break;
            default:
                throw new RuntimeException("Menu not defined " + Class.class.getCanonicalName());
        }
        return menu;
    }

    public static Menu getMenuForMenuScreen(final int inputNumber) {
        Menu menu;
        switch (inputNumber) {
            case 1:
                menu = Menu.CREATE_USER;
                break;
            case 2:
                menu = Menu.SEARCH_USER;
                break;
            case 3:
                menu = Menu.UPDATE_USER;
                break;
            case 4:
                menu = Menu.DELETE_USER;
                break;
            case 5:
                menu = Menu.START_MENU;
                break;
            default:
                throw new RuntimeException("Menu not defined " + Class.class.getCanonicalName());
        }
        return menu;
    }
}
