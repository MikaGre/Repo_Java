package Homework.Bank;
import java.util.regex.Pattern;

public class Customer extends Account{
    String firstName;
    String lastName;
    String phoneNumber;
    String ssn;
    String pinNumber;
    String[] customerAccountsType = new String[4];
    Double[] customerAccountsAmount = new Double[4];

    public Customer (String firstName, String lastName, String ssn, String pinNumber, String accType, double amount) {
        this.firstName = firstName;
        this.lastName = lastName;

        String ssnPattern  = "\\d\\d\\d([-])\\d\\d([-])\\d\\d\\d\\d";
        if (ssn.matches(ssnPattern)) {
            this.ssn = ssn;
        }else{
            System.out.println("Please use ###-##-#### format");
        }


        if (pinNumber.length() != 4){
            System.out.println("Pin Number must be 4 digits");
        }else {
            this.pinNumber = pinNumber;
        }

        if (accType.equalsIgnoreCase("Saving") || accType.equalsIgnoreCase("Checking")){
            this.accType = accType;
        }else{
            System.out.println("Error! We only make Checking and Saving Accounts");
        }

        if (amount < 1000) {
            System.out.println("Error! Minimum deposit is $1000");
        }else {
            this.amount = amount;
            balance+=amount;

        }

        if (this.amount > 0 && this.accType != null && this.pinNumber != null && this.ssn != null) {
            System.out.println("***** Account created! *****\n");
        }
        accountNumber = accountNumberGenerator++;
        this.accountAmount++;
    }

    public void getBankStatement () {
        System.out.println("\nHello " + firstName + "!" +
                "\nAccount Number: " + accountNumber +
                "\nAccount Type: " + accType +
                "\nAccount Balance: $" + balance +
                "\nHave a wonder day " + firstName);
    }

    public void setPhoneNumber (String phoneNumber) {
        String pattern  = "\\d\\d\\d([-])\\d\\d\\d([-])\\d\\d\\d\\d";
        if (phoneNumber.matches(pattern)) {
            System.out.println("Phone number has been updated");
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println("Please use ###-###-#### format");
        }


    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setPinNumber (String pinNumber) {

       if (pinNumber.length() != 4){
            System.out.println("Pin Number must be 4 digits");
        }else {
            this.pinNumber = pinNumber;
        }
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




