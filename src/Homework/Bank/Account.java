package Homework.Bank;

public class Account  {
    double balance;
    static int accountNumberGenerator = 10000;

    String accType;
    String address;

    double amount;
    int accountNumber;
    int accountAmount;



    public  double makeDeposit (double amount) {
        if (amount > 0) {
            this.balance+=amount;
            System.out.println("\nDeposit of: $" + amount + " was successful \nNew Balance: " + this.balance);
        } else {
            System.out.println("\nInvalid amount to deposit -> " + amount);
        }
        return this.balance;
    }

    public  double makeWithdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance-=amount;
            System.out.println("\nWithdraw of: $" + amount + " was successful \nNew Balance: " + balance);
        } else {
            System.out.println("\nInvalid amount to withdraw -> " + amount);
        }
        return balance;
    }



}
