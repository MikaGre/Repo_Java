package Homework;

import java.text.DecimalFormat;

public class Homework3 {
    public static void main (String[] args) {
/**
 * Create variable to store student-score,
 and total-possible-score based on the percentage,
 * display grade to student
 * Grade A: 91-100
 * Grade B: 81-90
 * Grade C: 71-80
 * Grade D: 61-70
 * Grade E: 51-60
 * Grade F: less than or equal to 50
 */
// int studentScore = 135;
// int maxScore = 150;
//calculate percentage
//Your percentage: XX.yy and your grade is: A
/**
 * Checking car mode (P, D, N, R)
 * if car mode is P and "you can park car"
 * if car mode is D drive car
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car mode is N you can "put car in car wash"
 * if car mode is R you can "revere the car"
 */
/**
 * store value in an int variable
 * if number is divisible by 3, print "divisible by 3"
 * if number is divisible by 5, print "divisible by 5"
 * if number is divisible by 3 and 5, print "divisible by both"
 * if not divisible by 3 or 5, print the number
 *
 */
        String pattern = "0.00%";
        DecimalFormat df = new DecimalFormat(pattern);


        System.out.println("*******Part1*******");
        System.out.println();

        char letterGrade = ' ';
        double studentScore = 75;
        double maxScore = 100;

        // formula is (x/y)*100. I am using Decimal Format to move the decimal places.
        double result = (studentScore / maxScore) ;
        String dfResult = df.format(result);


        if (result == 100 || result >= 91) {
            letterGrade = 'A';
        } else if (result >= 81 || result >= 90) {
            letterGrade = 'B';
        } else if (result >= 71 || result >= 80) {
            letterGrade = 'C';
        } else if (result >= 61 || result >= 70) {
            letterGrade = 'D';
        } else if (result >= 51 || result >= 60) {
            letterGrade = 'E';
        } else if (result < 50) {
            letterGrade = 'F';
        }
        System.out.println("Grade Percentage:" + dfResult  + "\n" + "Letter Grade:" + letterGrade);

        System.out.println();
        System.out.println("*******Part2*******");
        System.out.println();

        char carMode = 'z';
        char c = Character.toUpperCase(carMode);

        String driveType = "SNOW";
        String s = driveType.toLowerCase();

        String display = "";

        switch (c) {
            case 'P':
                display = "Car in Park";
                break;

            case 'D':
                switch (s) {
                    case "snow":
                        display = "Snow mode";
                        break;
                    case "sport":
                        display = "Sport mode";
                        break;
                    case "eco":
                        display = "Eco mode";
                        break;
                }
                break;
            case 'N':
                display = "Car in Neutral";
                break;
            case 'R':
                display = "Car in Reverse";
                break;
            default:
                display = "This mode is invalid:" + carMode;
        }
        System.out.println(display);

        System.out.println();
        System.out.println("*******Part3*******");
        System.out.println();

        int number = 15;

        if(number == 0){
            System.out.println("Cannot not divide by 0");
        }else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both");
        } else if (number % 3 == 0){
            System.out.println("Divisible by 3");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }else {
            System.out.println( number + " is not divisible by 3 or 5");
        }

    }
}
