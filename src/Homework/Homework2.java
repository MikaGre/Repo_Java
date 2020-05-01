package Homework;

public class Homework2 {

    public static void main (String[] args) {
        /**
         *
         * Store your first name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your name starts with "K" (Considering cases)
         *     3. First alphabet of your name
         *     4. Does your name ends with "M" (Ignoring cases)
         *
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Fetch the last word of the sentence
         * 	2. Display the total number of words in the myStatement.
         * 	3. replace all the 'r' characters with 'f' characters.
         *
         * Store your first name in a string variable.
         * Calculate the length of your name, without using length() method of String class.
         */


        //Part 1
        System.out.println("******* Part 1 *******");
        System.out.println("");

        //Store your first name in a variable
        String fNAme = "Mika";

        //Display length of the first name.
        System.out.println("The length of my first name is: " + fNAme.length());

        //Does your name starts with "K" (Considering cases)
        System.out.println("Does " + fNAme + " start with a 'K'? " + fNAme.substring(0,1).equals("K"));

        //First alphabet of your name
        System.out.println("The first letter in " +fNAme+ " is: " + fNAme.charAt(0));

        //Does your name ends with "M" (Ignoring cases)
        System.out.println("Does " + fNAme + " start with a 'M'? " + fNAme.substring(3,4).equalsIgnoreCase("M"));

        //Part 2
        System.out.println("");
        System.out.println("******* Part 2 *******");
        System.out.println("");


        //"I am a good programmer";
        String myStatment = "I am a good programmer";

        //Fetch the last word of the sentence
        String[] statement = myStatment.split(" ");
        System.out.println("The last word of the sentence: " + statement[statement.length-1]);

        //Display the total number of words in the myStatement.
        System.out.println("Total number of words in var myStatement: " + statement.length );

        //replace all the 'r' characters with 'f' characters.
        myStatment = myStatment.replace('r','f');
        System.out.println("Replaces all the 'r' characters with 'f' characters: " + myStatment);

        //Part 3
        System.out.println("");
        System.out.println("******* Part 3 *******");
        System.out.println("");

        String[] nameSplit = fNAme.split("");
        System.out.println("The  length of my name: "+ nameSplit.length);




    }
}
