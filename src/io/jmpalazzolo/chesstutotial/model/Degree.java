package io.jmpalazzolo.chesstutotial.model;

import io.jmpalazzolo.chesstutotial.gui.Menu;

public enum Degree {
    COMPUTER_SCIENCE,
    NATURAL_SCIENCE,
    PHILOSOPHY;

    public static Degree getDegreeByNumber(final int id) {
        switch (id) {
            case 1:
                return COMPUTER_SCIENCE;
            case 2:
                return NATURAL_SCIENCE;
            case 3:
                return PHILOSOPHY;
            default:
                throw new RuntimeException("Degree not defined in " + Menu.class.getCanonicalName());
        }
    }
}
