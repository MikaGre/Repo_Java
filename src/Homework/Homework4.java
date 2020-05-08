package Homework;

import org.w3c.dom.ls.LSOutput;

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

        System.out.println("*******Part1*******");
        System.out.println();

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
        System.out.println();
        System.out.println("*******Part2*******");
        System.out.println();


        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification): " + line);

        String[] lines = line.toLowerCase().split(" ");
        String capital = "";

        for (String w : lines) {
        capital += w.toUpperCase().substring(0,1) + w.substring(1) + " ";
        line = capital;
        }

        System.out.println("Line (After modification): " + line);


        System.out.println();
        System.out.println("*******Part3*******");
        System.out.println();

        /**
         * reverse a string
         */


        String message = "RaDaR";
        String reverseMessage = "";

        char[] letterBox = new char[message.length()];

        int j = 0;

        System.out.println("Message: " + message);

        for (int i = message.length()-1; i >= 0; i--) {
            letterBox[j] = message.charAt(i);
            j++;
        }

        for (char c : letterBox) {
            reverseMessage = reverseMessage + c;
        }

        System.out.println("Message in reverse: " + reverseMessage);


        System.out.println();
        System.out.println("*******Part4*******");
        System.out.println();

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
