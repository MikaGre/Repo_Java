package Homework;

<<<<<<< HEAD
=======

>>>>>>> fa2784eeef03e6bbf20d1909ff05416a63fa4d27
public class Homework4 {

    public static void main (String[] args) {

        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */

        System.out.println("\n"+"***Part1***"+"\n");

        String msg = "main interface keyword array";
        String abr = "";

        String[] s = msg.toUpperCase().split(" ");

        for (String word : s) {
           abr += word.charAt(0);
        }

        System.out.println("Abbreviation: " + abr);

        /**
         * Make 1st Char of each word Capital
         */
        System.out.println("\n"+"***Part2***"+"\n");


        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification): " + line);

        String[] lines = line.toLowerCase().split(" ");
        line = "";

        for (String w : lines) {
            line += w.toUpperCase().substring(0,1) + w.substring(1) + " ";
        }

        System.out.println("Line (After modification):" + line.trim());


        System.out.println("\n"+"***Part3***"+"\n");

        /**
         * reverse a string
         */


        String message = "pizza";
        String reverseMessage = "";

        char[] letterBox = message.toCharArray();
        System.out.println("Message: " + message);

        for (int i = message.length() -1; i >= 0; i--) {
            reverseMessage += message.charAt(i);
        }

        System.out.println("Message in reverse: " + reverseMessage);

        System.out.println("\n"+"***Part4***"+"\n");

        /**
         * Check if word is palindrome
         */

        //using logic from Part 3
        boolean result = false;

        if (message.equalsIgnoreCase(reverseMessage)){
            result = true;
        }

        System.out.println("Is " + message + " a palindrome: "  + result);

    }


}
