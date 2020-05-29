package midterm;

import java.util.Arrays;

public class midtermMain {

    public static void main (String[] args) {
        System.out.println("Question1:");
        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        System.out.println("Original Array: " + Arrays.toString(array) + "\nRemove: " + remove);
        System.out.println("Returned Array: " + Arrays.toString(removeNumber(array, remove)));

        System.out.println("\nQuestion2:");
        int[] array2 = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        System.out.println("Array: " + Arrays.toString(array2));
        System.out.println("Smallest missing Integer: " + smallestPositiveInteger(array2));

        System.out.println("\nQuestion3:");
        speedTrafficPointCal(88);
    }



    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     */

    public static int [] removeNumber (int[] originalArray, int remove) {
        int count = 0;

        for (int number : originalArray) {
            if (number == remove) {
                count++;
            }
        }

        int size = originalArray.length - count;
        int [] newArray = new int[size];

        int temp = 0;
        int j = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != remove) {
                temp = originalArray[i];
                if (newArray[j] == 0) {
                    newArray[j] = temp;
                    j++;
                }
            }
        }
        return newArray;
    }


    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     */

    public static int smallestPositiveInteger (int [] findSmallestInt) {
        int len = findSmallestInt.length;

        for (int i = 0; i < len; i++) {
            while (findSmallestInt[i] != i + 1) {
                if (findSmallestInt[i] <= 0 || findSmallestInt[i] >= len)
                    break;

                if(findSmallestInt[i]==findSmallestInt[findSmallestInt[i]-1])
                    break;

                int temp = findSmallestInt[i];
                findSmallestInt[i] = findSmallestInt[temp - 1];
                findSmallestInt[temp - 1] = temp;
            }
        }

        for (int i = 0; i < len; i++){
            if (findSmallestInt[i] != i + 1){
                return i + 1;
            }
        }

        return len + 1;
    }


    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against the license for over speeding.
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 78 ; 1 points
     *      user speed = 88 ; 3 points
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     *      88 -> 3
     *      70
     *      70-75 : 1
     *      75-80 : 1
     *      80-85 : 1
     *      85-88
     *
     */

    public static void speedTrafficPointCal (int speed) {
        int SPEED_LIMIT = 70;
        int pointCounter = (speed - SPEED_LIMIT) / 5;

        if (speed > 0) {
            System.out.println("Car speed: " + speed +
                    "\nSpeed Limit: " + SPEED_LIMIT +
                    "\nPoints charged against license: " + pointCounter);
        }

        if (speed < 0) {
            System.out.println("Error! Is the car moving?");
            if (pointCounter >= 12) {
                System.out.println("****LICENSE SUSPENDED**** ");
            } else if (pointCounter >= 1) {
                System.out.println("****PLEASE SLOW DOWN****");
            } else  if (pointCounter == 0) {
                System.out.println("Thank you for driving within the speed limit.");
            }
        }

    }


}
