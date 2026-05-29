import model.Transaction;
import service.BudgetTracker;

public class Main{
    public static void main(String[] args){

        BudgetTracker tracker = new BudgetTracker();
        Transaction t1 = new Transaction(500, "income", "01 June 2026","Salary", "This is my Salary for the month" );
        Transaction t2 = new Transaction(50, "expense", "01 June 2026","Data", "2 week Data" );
        tracker.addTransaction(t1);
        tracker.addTransaction(t2);
        double balance = tracker.calculateBalance();
        System.out.println(balance);
    }
}