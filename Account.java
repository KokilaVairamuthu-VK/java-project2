package atm;
import java.util.List;
import java.util.ArrayList;
public class Account {
 private static double balance;
 //private static List<Transaction> transactionHistory;
//
//    public Account(double balance) {
//        this.balance = balance;
//        this.transactionHistory = new ArrayList<>();
//    }

    public static void deposit(double amount,int accNum) {
        balance += amount;
//        transactionHistory.add(new Deposits(amount, "Deposit"));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
//            transactionHistory.add(new Withdrawals(amount, "Withdrawal"));
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

//    public void printTransactionHistory() {
//        System.out.println("Transaction History:");
//        for (Transaction transaction : transactionHistory) {
//            System.out.println(transaction.description + ": " + transaction.amount);
//        }
//    }
}
