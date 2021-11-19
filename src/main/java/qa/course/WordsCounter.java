package qa.course;

import java.util.Scanner;

public class WordsCounter {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input the string (words delimited by space):");
        String str = scn.nextLine();
        str.trim();
        String[] words = str.split("\\s+");
        System.out.println("There are "+ words.length + " words in the text!");

    }

}
