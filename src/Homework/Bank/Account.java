package Homework.Bank;

public class Account  {
    double balance;
    static int accountNumberGenerator = 10000;
    String firstName;
    String lastName;
    String phoneNumber;
    String ssn;
    String accType;
    String address;
    String pinNumber;
    double amount;
    int accountNumber;
    int accountAmount;


    public void getBankStatement () {
        System.out.println("\nHello " + firstName + "!" +
                "\nAccount Number: " + accountNumber +
                "\nAccount Type: " + accType +
                "\nAccount Balance: $" + balance +
                "\nHave a wonder day " + firstName);
    }

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

    public void openNewAccount (String accType, double amount) {

        if (accountAmount != 5) {
            if (accType.equalsIgnoreCase("Saving") || accType.equalsIgnoreCase("Checking")) {
                this.accType = accType;
            } else {
                System.out.println("Error! We only make Checking and Saving Accounts");
            }

            if (amount < 1000) {
                System.out.println("Error! Minimum deposit is $1000");
            } else {
                this.amount = amount;
                balance += amount;

            }

            if (this.amount > 0 && this.accType != null && this.accountAmount <=5) {
                this.accountAmount++;
                System.out.println("***** Account created! *****\n");
            }
        }else{
            System.out.println("\nSorry, You can no longer make addition account(s)");
        }
    }

}
