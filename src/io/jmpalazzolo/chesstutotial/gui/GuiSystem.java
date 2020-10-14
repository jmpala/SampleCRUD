package io.jmpalazzolo.chesstutotial.gui;


import io.jmpalazzolo.chesstutotial.model.Student;

public abstract class GuiSystem {

    private Menu menuState;

    /**
     * - Enter System -> showMenu()
     * - Configure options of the system
     * - Quit system
     */
    public abstract Menu showStartMenu();

    /**
     * - Create User -> showCrateUser()
     * - Search User -> showSearchUser()
     * - Update User -> showUpdateUser()
     * - Delete User -> showDeleteUser()
     * - Return to previous menu -> showStartMenu()
     */
    public abstract Menu showMenu();

    public abstract Student showCreateUser();

    public abstract int showSearchUser();
    public abstract void showSearchedUser(Student student);

    public abstract int showUpdateUser();
    public abstract Student showSearchedAndUpdateUser(Student student);

    public abstract int showDeleteUser();

    public Menu getMenuState() {
        return menuState;
    }

    public void setMenuState(Menu menuState) {
        this.menuState = menuState;
    }


}
