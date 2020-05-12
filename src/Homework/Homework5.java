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
/**
 * Create a method that will tell the name of student with maximum marks/score.
 * int[] scores = {90, 89, 191, 100, 81};
 * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
 *
 * Jesse scored the maximum score(191)
 */

public class Homework5 {

    public static void main (String[] args) {

        String[] names1 = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        nameToSearch(names1, "michael");

        int[] numbers1 = {45, 22, 11};
        average(numbers1);

        int[] numbers2 = {45, 201, 11, 65, 189, 462, 100, 200};
        maximum(numbers2);

        int[] scores = {10, 89, 191, 100, 281};
        String[] names2 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        maximum(scores,names2);

    }

    public static int nameToSearch (String[] names, String lookingfor) {
        int pos = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(lookingfor)) {
                pos = (i + 1);
                break;
            }
        }
        if (pos > 0){
            System.out.println(lookingfor + "is on position-" + pos);
        }else{
            System.out.println(lookingfor + " is not present in the array.");
        }
        return pos;
    }



    public static int average (int[] avg){
        int total = 0;
        int a = 0;
        for (int num : avg) {
            total+=num;
        }
        a = total/avg.length;
        System.out.println("Average of the given array: " + a);
        return a;
    }




    public static int maximum (int [] max){
        int largestnum = 0;
        for (int i = 0; i < max.length; i++) {
                if (max[i] > largestnum){
                    largestnum = max[i];
                }
            }
            System.out.println("Maximum value in the given array: " + largestnum);
            return largestnum;
        }




    public static int maximum (int [] max, String[] students){
        int largestnum = 0;
        String topStudent = "";

        for (int i = 0; i < max.length; i++) {
            if (max[i] > largestnum){
                largestnum = max[i];
                topStudent = students[i];
            }
        }
        System.out.println(topStudent + " scored the maximum score " + "("+largestnum+")");
        return largestnum;
    }

    }

