package src;

import java.lang.*;

public abstract class Account {

protected String accountNumber;
protected String customerName;
protected String customerId;
protected float balance;

    public Account(String accountNumber, String customerName, String customerId, float balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerId = customerId;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);


}