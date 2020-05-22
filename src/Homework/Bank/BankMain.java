package Homework.Bank;

public class BankMain  {
    public static void main (String[] args) {

        Customer customer1 = new Customer("Derrick", "Web", "004-14-2222","4506","Saving",1000);
        //Customer customer2 = new Customer("Margo", "Park", "009-44-3333","5678","Checking",2000);

        //customer1.makeDeposit(20.40);
        //customer1.makeWithdraw(700.67);
       // customer1.makeWithdraw(2500);
        customer1.openNewAccount("saving",2000);
        customer1.openNewAccount("saving",2000);
        customer1.openNewAccount("saving",2000);
        customer1.openNewAccount("saving",2000);
        customer1.openNewAccount("saving",2000);

        //customer2.makeDeposit(300);
        //customer2.makeWithdraw(100);

        //customer1.getBankStatement();
       //customer2.getBankStatement();

//        customer1.setPhoneNumber("124561234");

    }


}
