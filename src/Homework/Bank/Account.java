package Homework.Bank;

public class Account  {
    double balance;
    static int accountNumberGenerator = 10000;

    String accType;
    String address;

    double amount;
    int accountNumber;
    int accountAmount;




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
