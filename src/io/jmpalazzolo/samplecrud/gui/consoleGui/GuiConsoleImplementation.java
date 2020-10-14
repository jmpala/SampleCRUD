package io.jmpalazzolo.samplecrud.gui.consoleGui;

import io.jmpalazzolo.samplecrud.gui.GuiSystem;
import io.jmpalazzolo.samplecrud.gui.Menu;
import io.jmpalazzolo.samplecrud.gui.consoleGui.helper.ConsoleInputHelper;
import io.jmpalazzolo.samplecrud.gui.consoleGui.helper.NumberToMenuMapper;
import io.jmpalazzolo.samplecrud.model.Degree;
import io.jmpalazzolo.samplecrud.model.Student;

import java.util.Date;

public class GuiConsoleImplementation extends GuiSystem {

    @Override
    public Menu showStartMenu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Enter System");
        System.out.println("2. Configure");
        System.out.println("3. Exit");
        System.out.println("--- Menu ---");
        int menu = ConsoleInputHelper.getMenuFromInt();
        return NumberToMenuMapper.getMenuForStartMenuScreen(menu);
    }

    @Override
    public Menu showMenu() {
        System.out.println("--- System Menu ---");
        System.out.println("1. Create a new user");
        System.out.println("2. Search user");
        System.out.println("3. Update user");
        System.out.println("4. Delete user");
        System.out.println("5. Return to menu");
        System.out.println("--- System Menu ---");
        int menu = ConsoleInputHelper.getMenuFromInt();
        return NumberToMenuMapper.getMenuForMenuScreen(menu);
    }

    @Override
    public Student showCreateUser() {
        System.out.println("--- Create User ---");
        System.out.println("To create user insert:");
        System.out.println("1. Name");
        String name = ConsoleInputHelper.getValidStringForName();
        System.out.println("2. Date of birth");
        Date birthDate = ConsoleInputHelper.getValidDate();
        System.out.println("3. Study");
        Degree degree = ConsoleInputHelper.getValidDegree();
        System.out.println("--- Create User ---");
        return new Student(name, birthDate, degree);
    }

    @Override
    public int showSearchUser() {
        System.out.println("--- Search User ---");
        System.out.println("Insert the user id:");
        int id = ConsoleInputHelper.getMenuFromInt();
        System.out.println("--- Search User ---");
        return id;
    }

    @Override
    public void showSearchedUser(Student student) {
        System.out.println("--- Searched User ---");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Birth date: " + student.getBirthDate());
        System.out.println("Degree: " + student.getDegree());
        System.out.println("--- Searched User ---");
    }

    @Override
    public int showUpdateUser() {
        int id = showSearchUser();
        return id;
    }

    @Override
    public Student showSearchedAndUpdateUser(Student student) {
        return showCreateUser();
    }

    @Override
    public int showDeleteUser() {
        System.out.println("--- Show User ---");
        System.out.println("Insert the id to delete the user");
        System.out.println("--- Show User ---");
        return showSearchUser();
    }
}
