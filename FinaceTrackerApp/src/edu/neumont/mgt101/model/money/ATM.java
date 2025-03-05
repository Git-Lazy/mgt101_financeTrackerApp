package edu.neumont.mgt101.model.money;

import java.util.ArrayList;

public class ATM {
    // the go between from the balance and the user (because the user can't just set how much money they have
    // can be taken out if it seems to be redundant
    //TODO: check transaction history; use an ArrayList
    private ArrayList<Integer> balanceTransactions = new ArrayList<>();
    private Balance userBalance = new Balance();

    public ATM() {
        // wait for login branch

    }
}
