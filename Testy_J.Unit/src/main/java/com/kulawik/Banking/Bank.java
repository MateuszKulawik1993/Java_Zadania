package com.kulawik.Banking;

import java.util.concurrent.Callable;

public class Bank {
    private CashMashine[] cashMashine;
    private int size;

   public Bank(){
       this.cashMashine= new CashMashine[0];
       this.size=0;
   }

   public void addCashMashine(CashMashine cashMashine){
       CashMashine [] newCashMashine = new CashMashine[this.size+1];
       for(int i = 0; i<this.size;i++){
           newCashMashine[i]= this.cashMashine[i];
       }
       newCashMashine[this.size]=cashMashine;
       this.cashMashine= newCashMashine;
       this.size++;
   }
   public int getTotalBalanceOfAllCashMashines(){
       int totalBalance = 0;
       for(int i = 0;i <this.size; i++){
           totalBalance +=this.cashMashine[i].getTotalBalance();
       }
       return totalBalance;
   }
   public int getTotalNumberOfDeposits(){
       int totalDeposits = 0;
       for(int i = 0; i<this.size;i++){
           totalDeposits = totalDeposits + this.cashMashine[i].getNumberOfDeposits();
       }
       return totalDeposits;
   }
   public int getTotalNumberOfWithdrawals(){
       int totalWithdrawals= 0;
       for(int i = 0; i<this.size; i++){
           totalWithdrawals= totalWithdrawals + this.cashMashine[i].getNumberOfWithdrawals();
       }
       return totalWithdrawals;
   }
   public int getAverageDeposit(){
       int sum = 0;
       int count=0;
       for(int i = 0; i<this.size; i++){
           sum += this.cashMashine[i].getNumberOfDeposits()*this.cashMashine[i].getAverageDeposit();
           count+= this.cashMashine[i].getNumberOfDeposits();
       }
       return sum/count;
   }
    public int getAverageWithdrawal(){
        int sum = 0;
        int count=0;
        for(int i = 0; i<this.size; i++){
            sum += this.cashMashine[i].getNumberOfWithdrawals()*this.cashMashine[i].getAverageWithdrawal();
            count+= this.cashMashine[i].getNumberOfWithdrawals();
        }
        return sum/count;
    }

}
