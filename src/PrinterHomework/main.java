package PrinterHomework;

import java.util.Scanner;

import static PrinterHomework.Printer.*;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static String userSelect;
    static String backMain;

    public static void main (String[] args) throws InterruptedException {

        do {
            mainMenu();
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
                        String userInputSingleOrDouble = "";

                        System.out.print("Page(s):");
                        int userInputPage = scanner.nextInt();

                        if (userInputPage <=0) {
                            System.out.println("Error");
                        }else{
                            System.out.print("Single or Double(S/D):");
                            userInputSingleOrDouble = scanner.next();
                            switch (userInputSingleOrDouble){
                                case "s":
                                case "d":
                                    Printer.print(userInputPage,userInputSingleOrDouble);
                                    break;
                                default:
                                    System.out.println(userInputSingleOrDouble + " is invalid");
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
                            System.out.println("Error");
                        }else {
                            System.out.print("Single or Double(S/D):");
                            String userInputCopies = scanner.next();
                            switch (userInputCopies) {
                                case "s":
                                case "d":
                                    Printer.scanner(userInputNumberOfCopies, userInputCopies);
                                    break;
                                default:
                                    System.out.println("Error");
                            }
                        }
                        break;
                    case "f":
                        Printer.Fax();
                        break;
                    case "b":
                        System.out.print("Toner Amount:");
                        int userInputTonerAmount = scanner.nextInt();
                        if (userInputTonerAmount <=0) {
                            System.out.println("Error");
                        }else {
                            Printer.setTonerLevel(userInputTonerAmount);
                        }
                        break;
                    case "c":
                        System.out.print("Paper Amount:");
                        int userInputPageAmount = scanner.nextInt();
                        if (userInputPageAmount <=0) {
                            System.out.println("Error");
                        }else{
                                Printer.setPageLevel(userInputPageAmount);
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
