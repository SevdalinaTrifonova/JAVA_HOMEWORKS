package qa.course;

import java.util.Scanner;

public class StringReplace {
     public static void main(String[] args) {

         Scanner scn = new Scanner(System.in);
         System.out.println("Write a text to search in:");
         String searchText=scn.nextLine();

         System.out.println("Text to find:");
         String findText=scn.nextLine();

         System.out.println("Text to replace with:");
         String replaceText=scn.nextLine();

         String resStr=searchText.replaceAll(findText,replaceText);
         System.out.println("The result of replacement:");
         System.out.println(resStr);
     }


}
