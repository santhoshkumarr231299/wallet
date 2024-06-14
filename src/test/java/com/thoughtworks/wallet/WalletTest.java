package com.thoughtworks.wallet;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class WalletTest {
    @Test
    void shouldDepositAmount() throws Exception {
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(70.0);
        wallet.put(rupee);
        assertTrue(rupee.equals(wallet.balance()));
    }

    @Test
    void shouldReturnErrorWhenTheRupeeIsNegative() throws Exception {
        Wallet wallet = new Wallet();
        assertThrows(Exception.class, () -> {
            Rupee rupee = new Rupee(-10);
            wallet.put(rupee);
        });
    }

    @Test
    void shouldDepositAmountTwice() throws Exception {
        Wallet wallet = new Wallet();
        Rupee rupee1 = new Rupee(20);
        Rupee rupee2 = new Rupee(10.5);
        wallet.put(rupee1);
        wallet.put(rupee2);
        assertTrue((rupee1.add(rupee2).equals(wallet.balance())));
    }

    @Test
    void shouldReturnTrueWhenAdding10Amount() throws Exception {
        Wallet wallet = new Wallet();
        Rupee rupee1 = new Rupee(10);
        wallet.put(rupee1);
        assertTrue(rupee1.equals(wallet.balance()));
    }

    @Test
    void shouldReturnTrueWhenAdding15Amount() throws Exception {
        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(15.25);
        wallet.put(rupee);
        assertTrue(rupee.equals(wallet.balance()));
    }

    @Test
    void shouldReturnTrueWhenAmountIsZeroInNewWallet() throws Exception {
        Wallet wallet = new Wallet();
        assertTrue(new Rupee(0).equals(wallet.balance()));
    }
}
