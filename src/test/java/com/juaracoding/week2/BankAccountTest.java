package com.juaracoding.week2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public void setUp() {
        account = new BankAccount();
        account.setAccount(1780041100, "Ikrar Bagaskara", 30000);
    }

    @Test(priority = 1)
    public void testSetAccount() {
        Assert.assertEquals(account.acc_no, 1780041100);
        Assert.assertEquals(account.name, "Ikrar Bagaskara");
        Assert.assertEquals(account.amount, 30000);
    }

    @Test(priority = 2)
    public void testDeposit() {
        double newBalance = account.deposit(5000.0);
        Assert.assertEquals(newBalance, 35000.0);
    }

    @Test(priority = 3)
    public void testCheckBalance() {
        double balance = account.checkBalance();
        Assert.assertEquals(balance, 35000.0);
    }

    @Test(priority = 4)
    public void testWithdraw() {
        double newBalance = account.withdraw(7000.0);
        Assert.assertEquals(newBalance, 28000.0);
    }

    @Test(priority = 5)
    public void testCheckBalanceAfterWithdraw() {
        double balance = account.checkBalance();
        Assert.assertEquals(balance, 28000.0);
    }

    @Test(priority = 6)
    public void testWithdrawInsufficientBalance() {
        try {
            double newBalance = account.withdraw(40000.0);
            if (newBalance < 0) {
                System.out.println("Insufficient Balance");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Message: " + e.getMessage());
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test(priority = 7)
    public void testDisplay() {
        String accountDetails = account.display();
        Assert.assertEquals(accountDetails, "1780041100 Ikrar Bagaskara 28000.0");
    }
}
