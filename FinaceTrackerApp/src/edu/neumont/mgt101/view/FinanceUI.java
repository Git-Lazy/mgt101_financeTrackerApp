package edu.neumont.mgt101.view;

public class FinanceUI {

    public static int displayMainMenu() {
        return Console.getIntInput("""
                1. Create Account
                2. Login
                3. Exit
                """, 1, 5);
    }
    public static int displayLoggedInMenu() {
        return Console.getIntInput("""
                1. 
                """, 1, 5);
    }
}
