package com.kulawik.Banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getTotalBalance() {
        CashMashine cashMashine1 =new CashMashine();
        CashMashine cashMashine2 =new CashMashine();
        cashMashine1.addTransactions(50);
        cashMashine1.addTransactions(100);

        cashMashine2.addTransactions(150);
        cashMashine2.addTransactions(200);

        Bank bank = new Bank();
        bank.addCashMashine(cashMashine1);
        bank.addCashMashine(cashMashine2);
        assertEquals(500,bank.getTotalBalanceOfAllCashMashines());

    }

    @Test
    void getTotalNumberOfDeposits() {
        CashMashine cashMashine1 = new CashMashine();
        CashMashine cashMashine2 = new CashMashine();

        cashMashine1.addTransactions(100);
        cashMashine1.addTransactions(300);
        cashMashine1.addTransactions(200);

        cashMashine2.addTransactions(100);
        cashMashine2.addTransactions(200);

        Bank bank = new Bank();
        bank.addCashMashine(cashMashine1);
        bank.addCashMashine(cashMashine2);

        assertEquals(5,bank.getTotalNumberOfDeposits());

    }

    @Test
    void getTotalNumberOfWithdrawals() {
        CashMashine cashMashine1 = new CashMashine();
        CashMashine cashMashine2 = new CashMashine();

        cashMashine1.addTransactions(50);
        cashMashine1.addTransactions(50);

        cashMashine1.addTransactions(100);
        cashMashine1.addTransactions(-100);

        Bank bank = new Bank();
        bank.addCashMashine(cashMashine1);
        bank.addCashMashine(cashMashine2);
        assertEquals(0,bank.getTotalNumberOfWithdrawals());

    }

    @Test
    void getAverageDeposit() {
        CashMashine cashMashine1 =new CashMashine();
        CashMashine cashMashine2 =new CashMashine();

        cashMashine1.addTransactions(100);
        cashMashine1.addTransactions(200);

        cashMashine2.addTransactions(100);
        cashMashine2.addTransactions(200);

        Bank bank = new Bank();
        bank.addCashMashine(cashMashine1);
        bank.addCashMashine(cashMashine2);
        assertEquals(150, bank.getAverageDeposit());

    }

    @Test
    void getAverageWithdrawal() {
        CashMashine cashMashine1 =new CashMashine();
        CashMashine cashMashine2 =new CashMashine();

        cashMashine1.addTransactions(-100);
        cashMashine1.addTransactions(-200);

        cashMashine2.addTransactions(-100);
        cashMashine2.addTransactions(-200);

        Bank bank = new Bank();
        bank.addCashMashine(cashMashine1);
        bank.addCashMashine(cashMashine2);
        assertEquals(-150, bank.getAverageWithdrawal());
    }
}