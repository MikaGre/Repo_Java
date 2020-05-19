package PrinterHomework;

public class Printer {
     static int tonerLevel = 100;
     static int pageLevel = 100;

    static void mainMenu () {
        System.out.println("Hello! Please choose an option:" +
                "\n" + "|A.Printer Resources| |B.Add Toner| " +
                "|C.Add Paper| \n|P.Print| |S.Scanner-Copier| |F.Fax| |Q.Quit|");
        main.userSelect = main.scanner.next().toLowerCase();
    }

    public static int getTonerLevel () {
        if (tonerLevel <= 10){
            System.out.println("Add Toner");
        }
        return tonerLevel;
    }

    public static int getPageLevel () {
        if (pageLevel <= 10) {
            System.out.println("Add Paper");
        }
        return pageLevel;
    }

    public static void printerResources () {
        System.out.println("**** Toner Level:" + getTonerLevel() +" *****");
        System.out.println("**** Page Level:" + getPageLevel() + " *****");
    }

    public static void setTonerLevel (int addToner) {
        System.out.print("Toner Amount:");
        if (addToner+Printer.tonerLevel > 100 ) {
            int tonerAmountToFull = 100 - tonerLevel;
            System.out.println(addToner + " Toner is too much. Add " + tonerAmountToFull + " or less");
        }else if(addToner+Printer.tonerLevel < 100) {
            Printer.tonerLevel += addToner;
            System.out.println(addToner + " Toner Added");
        }
    }

    public static void setPageLevel (int addPaper) {

        if (addPaper + Printer.pageLevel > 100) {
            int paperAmountToFull = 100 - pageLevel ;
            System.out.println(addPaper + " Paper is too much. Add " + paperAmountToFull + " or less");
        }else if (addPaper + Printer.pageLevel <= 100){
            Printer.pageLevel += addPaper;
            System.out.println(addPaper + " Pages Added");
        }
    }


    public static void print (int numberOfPages,String singleOrDouble) throws InterruptedException {

        switch (singleOrDouble) {
            case "s":
                tonerLevel -= numberOfPages;
                pageLevel -= numberOfPages;
                break;
            case "d":
                tonerLevel -= numberOfPages;
                pageLevel -= (numberOfPages / 2.0);
                break;
        }

        System.out.println("Printing....");
        Thread.sleep(2000);
        System.out.println("Printing Complete!");

    }

    public static void scanner (int copiesNeeded, String optFrontandBack) throws InterruptedException {
        switch (optFrontandBack) {
            case "s":
                tonerLevel -= copiesNeeded;
                pageLevel -= copiesNeeded;
                break;
            case "d":
                tonerLevel -= copiesNeeded;
                pageLevel -= (copiesNeeded / 2.0);
                break;
        }
        System.out.println("Scanning...");
        Thread.sleep(3000);
        System.out.println("Scan Complete!");
    }

    public static void Fax () throws InterruptedException {

        System.out.println("Faxing...");
        Thread.sleep(3000);
        System.out.println("Fax Complete!");
    }
}