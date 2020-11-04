package by.bntu.model;

import by.bntu.services.CredsReader;
import by.bntu.view.*;

import java.util.List;


public class SignInWorker {
    private static String fileName = "C:\\Users\\Uladzislau_Shumchyk\\IdeaProjects\\authorization\\lp.txt";

    public static void signIn() {
        try {
            List<String> allLogPass = CredsReader.readLogPass(fileName);
            String userCreds = enterCreds();

            if (allLogPass.contains(userCreds)) {
                Printer.print("You've logined succesfully");
            }else{
                Printer.print("something went wrong");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String enterCreds() {
        StringBuilder loginPass = new StringBuilder();

        Printer.print("Please enter your login:\t");
        loginPass.append(Inputter.inputString() + ",");

        Printer.print("Please enter your password:\t");
        loginPass.append(Inputter.inputString());

        return loginPass.toString();
    }

}
