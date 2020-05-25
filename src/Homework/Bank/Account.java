package Homework.Bank;

public class Account  {
    double balance;
    static int accountNumberGenerator = 10000;

    String accType;
    String address;

    double amount;
    int accountNumber;
    int accountAmount;
    String[] customerAccountsType = new String[4];
    Double[] customerAccountsAmount = new Double[4];



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
                this.balance += amount;

            }

            if (this.amount > 0 && this.accType != null && this.accountAmount <=5) {
                this.accountAmount++;
                System.out.println("***** Account created! *****\n");
            }
            for (int i = 0; i < customerAccountsAmount.length ; i++) {
                if (customerAccountsAmount[i] == null){
                    customerAccountsAmount[i] = amount;
                    break;
                }
            }
            for (int i = 0; i < customerAccountsType.length ; i++) {
                if (customerAccountsType[i] == null){
                    customerAccountsType[i] = accType;
                    break;
                }
            }

        }else{
            System.out.println("\nSorry, You can no longer make addition account(s)");
        }
    }

}
