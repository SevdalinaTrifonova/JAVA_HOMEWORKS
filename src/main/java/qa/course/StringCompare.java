package qa.course;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Compare two strings");
        System.out.println("Input the first string");
        String firstString = scn.nextLine();
        System.out.println("Input the second string");
        String secondString = scn.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println(firstString + " and " + secondString + " are equal!");
        } else {
            System.out.println(firstString + " and " + secondString + " are NOT equal!");
        }
    }
}
