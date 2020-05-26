package Homework.Printer;

import java.util.Scanner;

import static Homework.Printer.Printer.*;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static String userSelect;
    static String backMain;

    public static void main (String[] args) throws InterruptedException {

        do {
            System.out.println("Hello! Please choose an option:" +
                    "\n" + "|(A)Printer Resources| |(B)Add Toner| " +
                    "|(C)Add Paper| \n|(P)Print| |(S)Scanner-Copier| |(F)Fax| |(Q)Quit|");
                     userSelect = scanner.next().toLowerCase();

            if (userSelect.length() > 0) {
                switch (userSelect) {
                    case "a":
                        Printer.printerResources();
                        break;
                    case "p":
                        if (pageLevel <=0 || tonerLevel <=0) {
                            System.out.println("Must add resources");
                            break;
                        }
                        System.out.print("Page(s):");
                        int userInputPage = scanner.nextInt();

                        if (userInputPage <=0) {
                            System.out.println("Please enter a number greater than 0");
                        }else{
                            System.out.print("Single or Double(S/D):");
                            String userInputSingleOrDouble = scanner.next();
                            switch (userInputSingleOrDouble){
                                case "s":
                                case "d":
                                    Printer.print(userInputPage,userInputSingleOrDouble);
                                    System.out.println("Printing....");
                                    System.out.println("Printing Complete!");
                                    break;
                                default:
                                    System.out.println(userInputSingleOrDouble + " is invalid. Please choose Single(S) or Double(D) sided");
                            }
                        }
                        break;
                    case "s":
                        if (pageLevel <=0 || tonerLevel <=0) {
                            System.out.println("Must add resources");
                            break;
                        }
                        System.out.println("How many copies? ");
                        int userInputNumberOfCopies = scanner.nextInt();
                        if (userInputNumberOfCopies <=0) {
                            System.out.println("Please enter a number greater than 0");
                        }else {
                            System.out.print("Single or Double(S/D):");
                            String userInputSingOrDoub = scanner.next();
                            switch (userInputSingOrDoub) {
                                case "s":
                                case "d":
                                    Printer.scanner(userInputNumberOfCopies, userInputSingOrDoub);
                                    System.out.println("Scanning...");
                                    System.out.println("Scan Complete!");
                                    break;
                                default:
                                    System.out.println(userInputSingOrDoub + " is invalid.Please choose Single(S) or Double(D) sided");
                            }
                        }
                        break;
                    case "f":
                        Printer.Fax();
                        break;
                    case "b":
                        if (tonerLevel == 100) {
                            System.out.println("Toner Full");
                            break;
                        }else {
                            System.out.print("Toner Amount:");
                            int userInputTonerAmount = scanner.nextInt();
                            if (userInputTonerAmount <= 0) {
                                System.out.println("Please enter a number greater than 0");
                            } else {
                                Printer.setTonerLevel(userInputTonerAmount);
                            }
                        }
                        break;
                    case "c":
                        if (pageLevel == 100) {
                            System.out.println("Paper Tray Full");
                            break;
                        }else {
                            System.out.print("Paper Amount:");
                            int userInputPageAmount = scanner.nextInt();
                            if (userInputPageAmount <= 0) {
                                System.out.println("Please enter a number greater than 0");
                            } else {
                                Printer.setPageLevel(userInputPageAmount);
                            }
                        }
                        break;
                    case "q":
                        System.out.println("Exiting Program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println(userSelect + " Is a invalid command. Please choose from menu.");
                        break;
                }
            }

        } while (true);
    }
}
