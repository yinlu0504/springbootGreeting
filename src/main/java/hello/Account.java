package hello;

public class Account {
    private final String name;
    private long balance;

    public Account(String name,long balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public long getBalance() {
        return balance;
    }
    public void deposite(long amount){
        balance = balance + amount;
    }
    public void withdraw(long amount) {
        if(balance < amount) {
            balance = 0;
        }
        else {
            balance = balance - amount;
        } 
    }
}