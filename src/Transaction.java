package src;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {

    private static final AtomicInteger counter = new AtomicInteger(1);
    private String transactionNumber;
    private float amount;
    private String type;
    private LocalDate date;
    private LocalTime time;
    private String fromAccount;
    private String toAccount;
    private String customerId;

    public Transaction(float amount, String type, LocalDate date, LocalTime time, String fromAccount, String toAccount, String customerId) {
        this.transactionNumber = generateTransactionNumber();
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.time = time;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.customerId = customerId;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    private static String generateTransactionNumber() {
        // Format: YYYYMMDDHHMMSS-XXXXX
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String timestamp = LocalDate.now().format(dateFormatter) + LocalTime.now().format(DateTimeFormatter.ofPattern("SSS"));
        int uniqueId = counter.getAndIncrement();
        return timestamp + "-" + String.format("%05d", uniqueId);
    }
}
