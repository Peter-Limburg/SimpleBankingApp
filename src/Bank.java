package src;
import java.util.ArrayList;
import java.util.List;
public class Bank {

    private List<Account> accounts;
    private List<Transaction> transactions;

    public Bank(List<Account> accounts, List<Transaction> transactions) {
        this.accounts = accounts != null ? accounts : new ArrayList<>();
        this.transactions = transactions != null ? transactions : new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public Transaction inquireTransaction(String transNumber){
        for (Transaction t : transactions){
            if (t.getTransactionNumber().equals(transNumber)){
                return t;
            }
        }
        return null;
    }
}