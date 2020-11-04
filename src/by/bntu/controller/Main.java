package by.bntu.controller;

import by.bntu.model.SignInWorker;
import by.bntu.model.SignUpWorker;
import by.bntu.view.Inputter;
import by.bntu.view.Printer;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        while (choice!= 1 & choice!=2) {
            Printer.print("Please choose option: sign-in (1) sign-up (2)");
            choice = Inputter.inputIntValue();
            Printer.print("yeeah");
        }

        if(choice == 1){
            SignInWorker.signIn();
        }
        if(choice == 2){
            SignUpWorker.signUp();
        }
    }
}
