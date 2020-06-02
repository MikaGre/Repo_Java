package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework8 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>stringList = new ArrayList<>();
        // {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        stringList.add("happy");
        stringList.add("peace");
        stringList.add("joy");
        stringList.add("grow");
        stringList.add("laugh");
        stringList.add("happy");
        stringList.add("laugh");
        stringList.add("joy");
        System.out.println(allDuplicates(stringList));

        int[] arr1 = {11, 32, 43, 54, 65};
        int[] arr2 = {76, 11, 89, 43, 87, 23, 32};

        System.out.println(commonElements(arr1, arr2));
    }

    /**
     * Create a method, that will return all duplicates values in the given String array.
     * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
     * Result -> ["happy", "joy", "laugh"]
     *
     *
     * Create a method, that will return the common elements/value in two given int-array
     * int[] arr1 = {11, 32, 43, 54, 65}
     * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     * Result -> [11, 32, 43]
     *
     */

    public static List<String> allDuplicates (List<String>words){
        List<String> result = new ArrayList<>();

        for (String s : words) {
            if (words.indexOf(s) != words.lastIndexOf(s)) {
                if (!result.contains(s)) {
                    result.add(s);
                }
            }
        }
        return result;
    }

    public static List<Integer> commonElements (int[] arr1, int[] arr2){
        List<Integer> common = new ArrayList<>();
        List<Integer> bothArr = new ArrayList<>();

        for (int n1 : arr1) {
            bothArr.add(n1);
        }
        for (int n2 : arr2) {
            bothArr.add(n2);
        }
        for (int num : bothArr) {
            if (bothArr.indexOf(num) != bothArr.lastIndexOf(num)) {
                if (!common.contains(num)) {
                    common.add(num);
                }
            }
        }
        return common;

    }


}
