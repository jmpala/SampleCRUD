package io.jmpalazzolo.samplecrud.controller;

import io.jmpalazzolo.samplecrud.db.DataBase;
import io.jmpalazzolo.samplecrud.gui.GuiSystem;
import io.jmpalazzolo.samplecrud.gui.Menu;
import io.jmpalazzolo.samplecrud.model.Student;

public class BaseCrudSystem {

    private GuiSystem guiSystem;
    private Menu menuState;

    private boolean isProgramRunning;

    public BaseCrudSystem(GuiSystem guiSystem) {
        this.isProgramRunning = true;
        this.guiSystem = guiSystem;
    }

    /**
     * The execution of the system starts here
     */
    public void runSystem() {
        menuState = Menu.START_MENU;
        while(isProgramRunning) {
            switch (menuState) {
                case START_MENU:
                    menuState = guiSystem.showStartMenu();
                    break;
                case START_MENU_QUIT:
                    isProgramRunning = false;
                    break;
                case CREATE_USER:
                    Student newStudent = guiSystem.showCreateUser();
                    DataBase.addUser(newStudent);
                    menuState = Menu.SYSTEM_MENU;
                    break;
                case DELETE_USER:
                    int deleteId = guiSystem.showDeleteUser();
                    DataBase.deleteUserByID(deleteId);
                    menuState = Menu.SYSTEM_MENU;
                    break;
                case SEARCH_USER:
                    searchUserInDataBase();
                    menuState = Menu.SYSTEM_MENU;
                    break;
                case SYSTEM_MENU:
                    menuState = guiSystem.showMenu();
                    break;
                case UPDATE_USER:
                    int id = guiSystem.showUpdateUser();
                    Student updateStudent = DataBase.getUserByID(id);
                    updateStudent = guiSystem.showSearchedAndUpdateUser(updateStudent);
                    DataBase.updateUser(id, updateStudent);
                    menuState = Menu.SYSTEM_MENU;
                    break;
                    default:
                        throw new RuntimeException("Menu not defined");
            }
        }
    }

    private void searchUserInDataBase() {
        int id = guiSystem.showSearchUser();
        Student student = DataBase.getUserByID(id);
        guiSystem.showSearchedUser(student);
    }


}
