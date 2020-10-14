package io.jmpalazzolo.chesstutotial.db;

import io.jmpalazzolo.chesstutotial.model.Student;

import java.util.HashMap;

public class DataBase {

    private static int id = 0;
    private static final HashMap<Integer, Student> usersTable = new HashMap<>();

    private DataBase() {
    }

    // Create
    public static void addUser(final Student baseUser) {
        usersTable.put(id, baseUser);
        id++;
    }

    // Update
    public static void updateUser(final Integer id, final Student baseUser) {
        if (usersTable.containsKey(id)) {
            usersTable.put(id, baseUser);
            return;
        }
        addUser(baseUser);
    }

    // Read
    public static Student getUserByID(final Integer id) {
        return usersTable.get(id);
    }

    // Delete
    public static void deleteUserByID(final Integer id) {
        usersTable.remove(id);
    }

    public static HashMap<Integer, Student> getUsersTable() {
        return usersTable;
    }
}
