package service;

import model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BudgetTracker{
    private List<Transaction> transactions;

    public BudgetTracker(){
        this.transactions = new ArrayList<>();
    }

    //METHODS
    public void addTransaction(Transaction newTransaction){
        transactions.add(newTransaction);
    }
    public double calculateBalance() {
        double balance = 0;
        for(Transaction transaction :transactions){
            if(transaction.getType().equals("income")){
                balance +=  transaction.getAmount();
            }else{
                balance -= transaction.getAmount();

            }
        }
        return balance;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }

}