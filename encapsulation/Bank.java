package encapsulation;

public class Bank {
    private int account_number;
    private double balance;
    private double total;

    public Bank(int account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public Bank() {
    }

    public double deposit(double money){
          total= balance+money;
         return total;
     }
     public double withdraw(double money){
        return total-money;
     }
    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
