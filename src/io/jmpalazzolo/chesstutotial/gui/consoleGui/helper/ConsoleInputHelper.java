package io.jmpalazzolo.chesstutotial.gui.consoleGui.helper;

import io.jmpalazzolo.chesstutotial.model.Degree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleInputHelper {

    private static Scanner input = new Scanner(System.in);

    public static int getMenuFromInt() {
        while (!input.hasNextInt()) {
            String s = input.next();
            System.out.println(s + " is not an integer number");
        }
        return input.nextInt();
    }

    public static String getValidStringForName() {
        while (!input.hasNext("\\p{Alpha}*")) {
            String s = input.next();
            System.out.println(s + " does not contain only letters");
        }
        return input.next();
    }

    public static Date getValidDate() {
        System.out.println("Please enter a date (mm/dd/yyyy)");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        String uDate = input.nextLine();
        Date date = new Date();
        try {
            date = sdf.parse(uDate);
            System.out.println(uDate + " is a valid Date");
        } catch (Exception e) {
            System.out.println(uDate + " is not a valid Date");
            getValidDate();
        }
        return date;
    }

    public static Degree getValidDegree() {
        System.out.println("Choose a degree");
        System.out.println("1. Computer Science");
        System.out.println("2. Natural Science");
        System.out.println("3. Philosophy");
        int num = getMenuFromInt();
        switch (num) {
            case 1:
                return Degree.COMPUTER_SCIENCE;
            case 2:
                return Degree.NATURAL_SCIENCE;
            case 3:
                return Degree.PHILOSOPHY;
            default:
                System.out.println("Incorrect option " + num);
                return getValidDegree();
        }
    }
}
