package io.jmpalazzolo.chesstutotial;

import io.jmpalazzolo.chesstutotial.controller.BaseCrudSystem;
import io.jmpalazzolo.chesstutotial.gui.consoleGui.GuiConsoleImplementation;

public class Main {

    public static void main(String[] args) {
        BaseCrudSystem system = new BaseCrudSystem(new GuiConsoleImplementation());
        system.runSystem();
    }
}
