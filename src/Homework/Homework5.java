package Homework;
/**
 *
 * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
 * String nameToSearch = "philip";
 * Create a method that will tell the position of name of the given array
 * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
 *
 * philip is on position-4
 * happy is not present in the array
 *
 */
/**
 * Create a method to find average of an int-array
 * Average of the given array: 123
 */
/**
 * Create a method to find maximum value in the given int-array
 * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
 *
 * Maximum value in the given array: 189
 */

import java.util.Arrays;

/**
 * Create a method that will tell the name of student with maximum marks/score.
 * int[] scores = {90, 89, 191, 100, 81};
 * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
 *
 * Jesse scored the maximum score(191)
 */

public class Homework5 {
   static String nameNotFound = "";
   static int studentIndex = 0;
   static int largestnum;
   static String topStudent = "";


    public static void main (String[] args) {

        String[] names1 = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        int findNamePos = nameToSearch(names1, "do");

        if (findNamePos > 0){
            System.out.println(names1[findNamePos -1] + " is on position-" + findNamePos);
        }else{
            System.out.println(nameNotFound +" is not present in the array.");
        }

        int[] numbers1 = {45, 22, 11};
        int averageOfNumbers = average(numbers1);
        System.out.println("Average of the given array: " + averageOfNumbers);

        int[] scores = {-10, -89, -191, -100, -281};
        int maxVal = maximum(scores);
        System.out.println("Maximum value in the given array: " + maxVal);

        String[] names2 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        String highestScoreinArr = studentScores(scores, names2);
        System.out.println(topStudent + " scored the maximum score " + "("+largestnum+")");


    }

    public static int nameToSearch (String[] names, String lookingfor) {
       int pos = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(lookingfor)) {
                pos = (i + 1);
                break;
            }else{
                nameNotFound = lookingfor;
            }
        }
  return pos;
    }



    public static int average (int[] arr){
        int total = 0;
        int averageofarr = 0;
        for (int num : arr) {
            total+=num;
        }
        averageofarr = total/arr.length;

        return averageofarr;
    }




    public static int maximum (int [] max){
        largestnum = max[0];
        for (int i = 0; i < max.length; i++) {
                if (max[i] > largestnum){
                    largestnum = max[i];
                    studentIndex = i;
                }
            }
            return largestnum;
        }




    public static String studentScores (int [] max, String[] students){
        int studentHighScore = maximum(max);
        topStudent = students[studentIndex];

        return topStudent;
    }

}

