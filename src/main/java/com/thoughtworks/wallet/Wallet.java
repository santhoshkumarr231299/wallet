package com.thoughtworks.wallet;

public class Wallet {
    private Rupee balance;
    public Wallet() throws Exception {
        balance = new Rupee(0);
    }
    public void put(Rupee rupee) throws Exception {
        balance = balance.add(rupee);
    }
    public Rupee balance() {
        return balance;
    }
}