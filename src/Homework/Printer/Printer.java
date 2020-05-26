package Homework.Printer;

public class Printer {
     static int tonerLevel = 100;
     static int pageLevel = 100;

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
                int paperAmountToFull = 100 - pageLevel;
                System.out.println(addPaper + " Paper is too much. Add " + paperAmountToFull + " or less");
            } else if (addPaper + Printer.pageLevel <= 100) {
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
                tonerLevel -= numberOfPages+1;
                pageLevel -= (numberOfPages / 2.0);
                break;
            default:
                System.out.println("Error! Single or Double (S/D)");
        }
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
    }

    public static void Fax (){
        System.out.println("Faxing...");
        System.out.println("Fax Complete!");
    }
}