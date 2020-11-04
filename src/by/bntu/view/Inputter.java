package by.bntu.view;

import java.util.Scanner;

public class Inputter {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputIntValue(){
        int limitation = scanner.nextInt();

        return limitation;
    }

    public static String inputString(){
        return scanner.next();
    }
}
