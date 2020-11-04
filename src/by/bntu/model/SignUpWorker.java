package by.bntu.model;

import by.bntu.services.CredsWriter;
import by.bntu.view.Inputter;
import by.bntu.view.Printer;

public class SignUpWorker {
    private static String fileName = "C:\\Users\\Uladzislau_Shumchyk\\IdeaProjects\\authorization\\lp.txt";

    private static String collectLogPas() {
        StringBuilder logPas = new StringBuilder();

        Printer.print("Please enter new login");
        logPas.append(Inputter.inputString() + ",");
        Printer.print("Please enter new password");
        logPas.append(Inputter.inputString());

        return logPas.toString();
    }

    public static void signUp(){
        String creds = collectLogPas();
        try{
            CredsWriter.writeToFile(fileName,creds);
            Printer.print("Hooray you've signed up");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
