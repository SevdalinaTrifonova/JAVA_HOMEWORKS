package qa.course;

import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String printStr = "";
        String strTemp = "";
        do {
            System.out.println("Input new text line (empty string input ends the process):");
            strTemp = scn.nextLine();
            printStr += " " + strTemp;
        }
        while (!strTemp.equals(""));
        System.out.println("The text you entered: ");
        System.out.println(printStr.trim());
    }
}
