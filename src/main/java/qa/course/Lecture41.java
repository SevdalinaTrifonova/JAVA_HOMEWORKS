package qa.course;

import java.util.Scanner;

public class Lecture41 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String anyKey =  "Press any key to continue!";

        System.out.println("Compare tree numbers and print the biggest one!");
        System.out.println("Input the first number");
        int a = scn.nextInt();
        System.out.println("Input the second number");
        int b = scn.nextInt();
        System.out.println("Input the third number");
        int c = scn.nextInt();
        int biggestNumber = findBiggestNumber(a, b, c);
        System.out.printf("The biggest number is %d!%n", biggestNumber);
        System.out.printf("%s%n",anyKey);
        scn.nextLine();
        scn.nextLine();

        System.out.println("Calculate perimeter and area of a rectangle!");
        System.out.println("Input the height");
        float d = scn.nextFloat();
        System.out.println("Input the width");
        float e = scn.nextFloat();
        calcRectangleArea(d, e);
        System.out.printf("%s%n",anyKey);
        scn.nextLine();
        scn.nextLine();

        System.out.println("Even or odd number?");
        System.out.println("Input number");
        int f = scn.nextInt();
        oddNumber(f);
        System.out.printf("%s%n",anyKey);
        scn.nextLine();
        scn.nextLine();

        System.out.println("Run test dayOfWeek()!");
        dayOfWeek(1);
        dayOfWeek(2);
        dayOfWeek(3);
        dayOfWeek(4);
        dayOfWeek(5);
        dayOfWeek(6);
        dayOfWeek(7);
        dayOfWeek(8);
        dayOfWeek(0);

    }

    public static int findBiggestNumber(int a, int b, int c) {
        //find the biggest of tree numbers


        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
               return c;
            }

        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void calcRectangleArea(double h, double w) {
        //calculate perimeter and area of a rectangle

        if (h <= 0 || w <= 0) {
            System.out.printf("It is not possible to build a rectangle with height=%.2f and width=%.2f!%n", h, w);
        } else {
            System.out.printf("Perimeter of the rectangle is 2*( %.2f + %.2f ) = %.2f%n", h, w, 2 * (h + w));
            System.out.printf("Area of the rectangle is %.2f*%.2f = %.2f%n", h, w, h * w);
        }
    }

    public static void oddNumber(int a) {
        //even or odd number

        System.out.printf("%d is " + (a % 2 == 0 ? "even" : "odd") + " number!%n", a);
    }

    public static void dayOfWeek(int dayNumber) {
        //prints day of week

        String dayOfWeek = "";
        String abr = "th";
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                abr = "st";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                abr = "nd";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                abr = "rd";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                break;
        }

        if (dayOfWeek.length() == 0) {
            System.out.printf("Your input is %d. This is an invalid input!%n", dayNumber);
        } else {
            System.out.printf("The %d%s day of the week is %s%n", dayNumber, abr, dayOfWeek);
        }

    }

}
