package Homework;
import java.util.*;
/**
 * Question 1:
 * Create a method, that will return all duplicates values with count from the given String List
 * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 * Output:
 *      happy - 2
 *      joy - 3
 *      laugh - 2
 *
 * Question:2
 * Create a hashMap with any numbers of key-value pairs from the user
 * Key should be Integer
 * Value should be String
 * if there are keys with same value, print the keys otherwise, create method that will "All keys have different values"
 *
 *
 * Question 3:
 * Create a hashMap with any numbers of key-value pairs from the user (Key - String, Value - Integer)
 * Create a method that will take hashMap as input and returns the name of student(s) who scored maximum marks.
 */
/**
 * School:
 * Student1 - 55
 * Student2 - 65
 * Student3 - 75
 * Student4 - 85
 * Student5 - 95
 *
 * Store the data in appropriate variable
 * and print the name of student who scored max marks.
 *
 * 1. Store data in scoreSheet map variable
 * 2. get allValues from scoreSheet (scores)
 * 3. find max value in score-Collection
 * 4. find key(Student Name) corresponding to max-value (max-score)
 *
 */

public class Homework9 {
    public static Scanner scanner = new Scanner(System.in);

public static void main (String[] args) {
    List<String> words = new ArrayList<>(Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"));

    System.out.println("***Question1***\n");
    wordCount(words);

    System.out.println("\n***Question2***");

    Map<Integer, String> userPairs = new HashMap<>();
    System.out.print("How many Key/Value would you like to input?");
    int pairs = scanner.nextInt();

    for (int i = 0; i < pairs ; i++) {
        try {
            System.out.print("Enter a Integer for key:");
            int k = scanner.nextInt();
            System.out.print("Enter a String for key:");
            String v = scanner.next();
            userPairs.put(k,v);
        } catch (InputMismatchException e) {
            System.out.println("Must enter correct datatype");
            //e.printStackTrace();
        }
    }
    keyWithSameVal(userPairs);


    System.out.println("\n***Question3***");

    Map<String,Integer> studentScores = new HashMap<>();
    System.out.print("How many student grades do you have?");
    int amtOfStudents = scanner.nextInt();

    for (int i = 0; i < amtOfStudents ; i++) {
        try {
            System.out.print("Enter a Student:");
            String k = scanner.next();
            System.out.print("Enter Score for for " + k + " :");
            Integer v = scanner.nextInt();
            studentScores.put(k,v);
        } catch (InputMismatchException e) {
            System.out.println("Must enter correct datatype");
            //e.printStackTrace();
        }
    }


    System.out.println("Student(s) with the hightest score:\n" );
    studentMaxScore(studentScores).forEach(System.out::println);

}


    public static void wordCount(List<String> strings) {
        Map<String,Integer> word_count = new HashMap<>();

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (word_count.containsKey(s)) {
                word_count.put(s,word_count.get(s) + 1);
            } else {
                word_count.put(s,1);
            }
        }
        for (String k : word_count.keySet()) {
            if (word_count.get(k) >= 2) {
                String word = k;
                System.out.println(word+ " - " + word_count.get(k));
            }
        }
    }

    public static void keyWithSameVal (Map<Integer,String> keyValPairs) {

        Set<Integer> duplicates = new HashSet<>();

        for (Integer key1 : keyValPairs.keySet()) {
            for (Integer key2 : keyValPairs.keySet()) {
                String val1 = keyValPairs.get(key1);
                String val2 = keyValPairs.get(key2);
                if (val1.equalsIgnoreCase(val2)) {
                    duplicates.add(key2);
                } else {
                    break;
                }
            }
        }
        if (duplicates.size() > 1) {
            System.out.println("Keys with duplicate values:\n");
            duplicates.forEach(System.out::println);
        } else {
            System.out.println("No duplicate values found.");
        }
    }

    public static List<String> studentMaxScore (Map<String,Integer> stdScores) {
        Collection<Integer> scores = stdScores.values();
        Integer max = Collections.max(scores);
        List<String> topStudents = new ArrayList<>();

        for (String name : stdScores.keySet()) {
            if (stdScores.get(name) == max) {
                topStudents.add(name);
            }
        }
        return topStudents;
    }
}