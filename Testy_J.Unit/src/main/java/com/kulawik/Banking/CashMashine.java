package com.kulawik.Banking;

public class CashMashine {
    private int[] transactions;
    private int size;

    public CashMashine() {
        this.transactions = new int[0];
        this.size = 0;
    }
    public void addTransactions(int transaction){
        if(transaction==0){
            return;
        }
        this.size++;
        int[]newTab = new int[this.size];
        System.arraycopy(transactions,0,newTab,0, transactions.length);
        newTab[this.size-1]=transaction;
        this.transactions=newTab;
    }

    public int getTotalBalance() {
        int balance = 0;
        for (int i = 0; i < this.size; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }
    public int getNumberOfTransactions(){
        return this.size;
    }
    public int getNumberOfDeposits() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] > 0) {
                count++;
            }

    }
        return count;
    }

    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] < 0) {
                count++;
            }

        }
        return count;
    }

    public int getAverageDeposit(){
        int sum = 0;
        int count=0;
       for(int i = 0; i<this.size; i++){
           if(this.transactions[i]>0){
               sum+=this.transactions[i];
               count++;
           }
       }
       return sum /count;
    }

    public int getAverageWithdrawal(){
        int sum = 0;
        int count=0;
        for(int i =0; i<this.size;i++){
            if(this.transactions[i]<0){
                sum+= this.transactions[i];
                count++;
            }
        }
        return sum/count;
    }
}


