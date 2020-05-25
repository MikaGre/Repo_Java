package Homework.Bank;
import java.util.regex.Pattern;

public class Customer extends Account{
    String firstName;
    String lastName;
    String phoneNumber;
    String ssn;
    String pinNumber;

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
}




