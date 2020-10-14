package io.jmpalazzolo.chesstutotial.model;

/**
 * Defines the base element for the users in the system
 * All users have an ID
 */
public abstract class BaseUser {

    private int id;

    public BaseUser() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
